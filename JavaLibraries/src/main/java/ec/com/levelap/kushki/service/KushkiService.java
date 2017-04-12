/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiException.java
 * @Created:	23-03-2016
 * @Updated:	
 */
package ec.com.levelap.kushki.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ec.com.levelap.kushki.KushkiException;
import ec.com.levelap.kushki.object.KushkiAmount;
import ec.com.levelap.kushki.object.KushkiContact;
import ec.com.levelap.kushki.object.KushkiSubscriptionRequest;

/**
 * Kushki integration with Spring Framework exposed as {@link Service}. The
 * integration need a configuration like at application.yml:<br/>
 * <br/>
 * 
 * kushki-configuration:<br/>
 * &nbsp;&nbsp;show-log: true OR false<br/>
 * &nbsp;&nbsp;private-merchant-id: PRIVATE_MERCHANT_ID<br/>
 * &nbsp;&nbsp;end-point:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;path: https://api-uat.kushkipagos.com/v1
 * (TESTING)<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;path: https://api.kushkipagos.com/v1
 * (PRODUCTION)<br/>
 * <br/>
 * 
 * The integration with Kushki needs to configure a bean like:<br/>
 * &nbsp;&nbsp;@Bean<br/>
 * &nbsp;&nbsp;public RestTemplate restTemplate() {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RestTemplate restTemplate = new
 * RestTemplate(new OkHttp3ClientHttpRequestFactory());<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;restTemplate.getMessageConverters().add(0,
 * new StringHttpMessageConverter(Charset.forName("UTF-8")));<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;restTemplate.getMessageConverters().add(new
 * MappingJackson2HttpMessageConverter());<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return restTemplate;<br/>
 * &nbsp;&nbsp;}<br/>
 * 
 * @author Luis García Castro.
 */
@Service
public class KushkiService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${kushki-configuration.show-log}")
	private Boolean showLog;

	@Value("${kushki-configuration.private-merchant-id}")
	private String privateMerchantId;

	@Value("${kushki-configuration.end-point.path}")
	private String endPoint;

	private static final String SUBSCRIPTION_CREATE = "/subscriptions";

	private static final String SUBSCRIPTION_PATCH = "/subscriptions/{subscriptionId}";

	private static final String SUBSCRIPTION_CHARGE = "/subscriptions/{subscriptionId}/charges";

	private static final String SUBSCRIPTION_PUT_CARD = "/subscriptions/{subscriptionId}/card";

	/**
	 * Checks some configuration at application.yml and
	 * {@link SpringBootApplication}
	 * 
	 * @throws ServletException
	 *             Internal server error.
	 */
	private void checkConfiguration() throws ServletException {
		if (privateMerchantId == null || privateMerchantId.equals("")) {
			throw new ServletException("Make sure you set up your Kushki Private Merchant Id into your application.properties or application.yml");
		}
		if (restTemplate == null) {
			throw new ServletException("Make sure you set up your RestTemplate bean");
		}
		if (endPoint == null) {
			throw new ServletException("Make sure you set up your the end-point.path on your application yml");
		}
	}

	/**
	 * Allows to create a subscription id with the API RESTful by Kushki.
	 * 
	 * @param token
	 *            Kushki token generated at frontend.
	 * @param firstName
	 *            Subscription owner's first name.
	 * @param lastName
	 *            Subscription owner's last name.
	 * @param email
	 *            Subscription owner's email.
	 * @return the subscription number generated.
	 * @throws ServletException
	 *             Internal server error.
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String createSubscriptionId(String token, String firstName, String lastName, String email, String planName, String periodicity, String language, Map<String, String> metadata) throws ServletException, KushkiException {
		try {
			this.checkConfiguration();
			if (SUBSCRIPTION_CREATE == null) {
				throw new ServletException("Make sure you set up your the subscription.create on your application yml");
			}

			KushkiSubscriptionRequest kushkiRequest = new KushkiSubscriptionRequest(planName, periodicity, language, metadata);
			kushkiRequest.setToken(token);
			kushkiRequest.setContactDetails(new KushkiContact(firstName, lastName, email));
			kushkiRequest.setAmount(new KushkiAmount(0D));

			HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
			ResponseEntity<HashMap> httpResponse = this.restTemplate.postForEntity(endPoint.concat(SUBSCRIPTION_CREATE), httpRequest, HashMap.class);
			if (!httpResponse.getStatusCode().equals(HttpStatus.CREATED)) {
				throw this.getException(httpResponse.getBody());
			}
			return (String) httpResponse.getBody().get("subscriptionId");
		} catch (HttpClientErrorException ex) {
			try {
				Map<String, Object> kushkiError = new HashMap<>();
				ObjectMapper mapper = new ObjectMapper();
				kushkiError = mapper.readValue(ex.getResponseBodyAsString(), new TypeReference<Map<String, Object>>() {
				});
				throw getException(kushkiError);
			} catch (IOException iox) {
				if (showLog) {
					iox.printStackTrace();
				}
				throw new ServletException("Kushki Integration Error");
			}
		} catch (Exception ex) {
			if (showLog) {
				ex.printStackTrace();
			}
			throw new ServletException("Kushki Integration Error");
		}
	}

	/**
	 * Allows to update an existing subscription with the API RESTful by Kushki.
	 * 
	 * @param token
	 *            Kushki token generated at frontend.
	 * @param subscriptionId
	 *            Subscription id to update.
	 * @return Subscription id to update.
	 * @throws ServletException
	 *             Internal server error.
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void updateSuscriptionCard(final String token, final String subscriptionId) throws ServletException, KushkiException {
		try {
			this.checkConfiguration();
			if (SUBSCRIPTION_PUT_CARD == null) {
				throw new ServletException("Make sure you set up your the subscription.put-card on your application yml");
			}

			Map<String, Object> kushkiRequest = new HashMap<>();
			kushkiRequest.put("token", token);

			Map<String, String> params = new HashMap<String, String>();
			params.put("subscriptionId", subscriptionId);

			HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
			ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(SUBSCRIPTION_PUT_CARD), HttpMethod.PUT, httpRequest, HashMap.class, params);
			if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
				throw this.getException(httpResponse.getBody());
			}
		} catch (HttpClientErrorException ex) {
			try {
				Map<String, Object> kushkiError = new HashMap<>();
				ObjectMapper mapper = new ObjectMapper();
				kushkiError = mapper.readValue(ex.getResponseBodyAsString(), new TypeReference<Map<String, Object>>() {
				});
				throw getException(kushkiError);
			} catch (IOException iox) {
				if (showLog) {
					iox.printStackTrace();
				}
				throw new ServletException("Kushki Integration Error");
			}
		} catch (Exception ex) {
			if (showLog) {
				ex.printStackTrace();
			}
			throw new ServletException("Kushki Integration Error");
		}
	}

	/**
	 * Allows to charge an amount to an existing subscription with the API
	 * RESTful by Kushki.
	 * 
	 * @param subscriptionId
	 *            Subscription id to charge an amount.
	 * @param amount
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 *             Internal server error.
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String chargeAmountToSubscription(final String subscriptionId, final Double amount) throws ServletException, KushkiException {
		try {
			this.checkConfiguration();
			if (SUBSCRIPTION_PATCH == null) {
				throw new ServletException("Make sure you set up your the subscription.patch on your application yml");
			}
			if (SUBSCRIPTION_CHARGE == null) {
				throw new ServletException("Make sure you set up your the subscription.charge on your application yml");
			}

			Map<String, Object> kushkiRequest = new HashMap<>();
			kushkiRequest.put("amount", new KushkiAmount(amount));

			Map<String, String> params = new HashMap<String, String>();
			params.put("subscriptionId", subscriptionId);

			HttpEntity<?> httpRequestPatch = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
			ResponseEntity<HashMap> httpResponsePatch = this.restTemplate.exchange(endPoint.concat(SUBSCRIPTION_PATCH), HttpMethod.PATCH, httpRequestPatch, HashMap.class, params);
			if (!httpResponsePatch.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
				throw getException(httpResponsePatch.getBody());
			}

			HttpEntity<?> httpRequestCharge = new HttpEntity<>(null, this.createHeaderRest());
			ResponseEntity<HashMap> httpResponseCharge = this.restTemplate.postForEntity(endPoint.concat(SUBSCRIPTION_CHARGE), httpRequestCharge, HashMap.class, params);
			if (!httpResponseCharge.getStatusCode().equals(HttpStatus.CREATED)) {
				throw getException(httpResponseCharge.getBody());
			}
			return (String) httpResponseCharge.getBody().get("ticketNumber");
		} catch (HttpClientErrorException ex) {
			try {
				Map<String, Object> kushkiError = new HashMap<>();
				ObjectMapper mapper = new ObjectMapper();
				kushkiError = mapper.readValue(ex.getResponseBodyAsString(), new TypeReference<Map<String, Object>>() {
				});
				throw getException(kushkiError);
			} catch (IOException iox) {
				if (showLog) {
					iox.printStackTrace();
				}
				throw new ServletException("Kushki Integration Error");
			}
		} catch (Exception ex) {
			if (showLog) {
				ex.printStackTrace();
			}
			throw new ServletException("Kushki Integration Error");
		}
	}

	/**
	 * Allows to set the Kushki Exception object to propagate the exception with
	 * the integration.
	 * 
	 * @param response
	 *            rest client response.
	 * @return KushkiException
	 * @throws ServletException
	 */
	private KushkiException getException(Map<String, Object> response) throws ServletException {
		if (response.containsKey("code") && response.containsKey("message")) {
			return new KushkiException((String) response.get("code"), (String) response.get("message"));
		} else {
			throw new ServletException("Kushki Integration Error");
		}
	}

	/**
	 * Perform the header configuration to be used by the {@link RestTemplate}
	 * client.
	 * 
	 * @return the header configured with the kushki private merchant id.
	 */
	private HttpHeaders createHeaderRest() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Private-Merchant-Id", this.privateMerchantId);
		return headers;
	}

}
