/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiServiceIntegration.java
 * @Created:	12-05-2016
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
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ec.com.levelap.kushki.KushkiException;
import ec.com.levelap.kushki.object.KushkiServicesEnum;

/**
 * Makes the final integration with Kushki RESTful api and Levelap Spring REST
 * Client.
 * 
 * @author Luis García Castro
 */
public abstract class KushkiServiceIntegration {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${kushki-configuration.show-log}")
	private Boolean showLog;

	@Value("${kushki-configuration.private-merchant-id}")
	private String privateMerchantId;

	@Value("${kushki-configuration.end-point.path}")
	private String endPoint;

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

	/**
	 * Allows to set the Kushki Exception object to propagate the exception with
	 * the integration.
	 * 
	 * @param response
	 *            rest client response.
	 * @return KushkiException
	 * @throws ServletException
	 */
	KushkiException getException(Map<String, Object> response) throws ServletException {
		if (response.containsKey("code") && response.containsKey("message")) {
			return new KushkiException((String) response.get("code"), (String) response.get("message"));
		} else {
			throw new ServletException("Kushki Integration Error");
		}
	}

	/**
	 * Checks the operation and then it will be executed.
	 */
	@SuppressWarnings("unchecked")
	protected Object doOperation(final KushkiServicesEnum operation, final Map<String, Object> kushkiRequest, final Map<String, Object>... params) throws ServletException, KushkiException {
		try {
			switch (operation) {
			case TRANSACTION_CHARGE:
				return transactionCharge(kushkiRequest);
			case TRANSACTION_VOID:
				return voidTransactionCharge(kushkiRequest, params[0]);
			case SUBSCRIPTION_CREATE:
				return subscriptionCreate(kushkiRequest);
			case SUBSCRIPTION_CANCEL:
				return subscriptionCancel(kushkiRequest, params[0]);
			case SUBSCRIPTION_UPDATE:
				return subscriptionUpdate(kushkiRequest, params[0]);
			case SUBSCRIPTION_CHARGE:
				return subscriptionCharge(kushkiRequest, params[0]);
			case SUBSCRIPTION_ADJUSTMENT:
				return subscriptionAdjustment(kushkiRequest, params[0]);
			case SUBSCRIPTION_UPDATE_CARD:
				return suscriptionUpdateCard(kushkiRequest, params[0]);
			default:
				throw new ServletException("Internal Error");
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
	 * Make a charge with a <b>token</b> provided by Kushki which represents the
	 * customer's credit card. The <b>amount object</b> contains the detailed
	 * amount to be charged. If the <b>months</b> field is provided and is
	 * between 2 and 48, a deferred charge will be performed.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 * @throws HttpClientErrorException
	 * @throws Exception
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String transactionCharge(final Map<String, Object> kushkiRequest) throws ServletException, KushkiException, HttpClientErrorException, Exception {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(KushkiServicesEnum.TRANSACTION_CHARGE.getPath()), HttpMethod.POST, httpRequest, HashMap.class);
		if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
			throw getException(httpResponse.getBody());
		}
		return (String) httpResponse.getBody().get("ticketNumber");
	}

	/**
	 * Void a transaction identified by its <b>ticketNumber</b>. The
	 * <b>ticketNumber</b> is provided when a charge or a deferred charge is
	 * successful. The <b>amount object</b> contains the detailed amount of the
	 * transaction to be voided.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @param params
	 *            Path requested objects.
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String voidTransactionCharge(final Map<String, Object> kushkiRequest, final Map<String, Object> params) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(KushkiServicesEnum.TRANSACTION_VOID.getPath()), HttpMethod.DELETE, httpRequest, HashMap.class, params);
		if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
			throw getException(httpResponse.getBody());
		}
		return (String) httpResponse.getBody().get("ticketNumber");
	}

	/**
	 * Create a subscription with a <b>token</b> provided by Kushki which
	 * represents the customer's credit card. The <b>amount object</b> contains
	 * the detailed amount to be charged with the given <b>periodicity</b>.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @return the subscription number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String subscriptionCreate(final Map<String, Object> kushkiRequest) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.postForEntity(endPoint.concat(KushkiServicesEnum.SUBSCRIPTION_CREATE.getPath()), httpRequest, HashMap.class);
		if (!httpResponse.getStatusCode().equals(HttpStatus.CREATED)) {
			throw this.getException(httpResponse.getBody());
		}
		return (String) httpResponse.getBody().get("subscriptionId");
	}

	/**
	 * Cancel a subscription identified by its <b>subscriptionId</b>.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @param params
	 *            Path requested objects.
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Boolean subscriptionCancel(final Map<String, Object> kushkiRequest, final Map<String, Object> params) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(KushkiServicesEnum.SUBSCRIPTION_CANCEL.getPath()), HttpMethod.DELETE, httpRequest, HashMap.class, params);
		if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
			throw this.getException(httpResponse.getBody());
		}
		return Boolean.TRUE;
	}

	/**
	 * Update a subscription identified by its <b>subscriptionId</b>. All the
	 * fields are optional, they must be sent if they are meant to be changed.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @param params
	 *            Path requested objects.
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Boolean subscriptionUpdate(final Map<String, Object> kushkiRequest, final Map<String, Object> params) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(KushkiServicesEnum.SUBSCRIPTION_UPDATE.getPath()), HttpMethod.PATCH, httpRequest, HashMap.class, params);
		if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
			throw getException(httpResponse.getBody());
		}
		return Boolean.TRUE;
	}

	/**
	 * Make a charge on an existing subscription identified by its
	 * <b>subscriptionId</b>. The <b>cvv</b> is optional but if parameterized it
	 * will be validated. The <b>amount</b> is optional but if it is present on
	 * the request is used instead the amount configured on the Subscription.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @param params
	 *            Path requested objects.
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String subscriptionCharge(final Map<String, Object> kushkiRequest, final Map<String, Object> params) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequestCharge = new HttpEntity<>(null, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponseCharge = this.restTemplate.postForEntity(endPoint.concat(KushkiServicesEnum.SUBSCRIPTION_CHARGE.getPath()), httpRequestCharge, HashMap.class, params);
		if (!httpResponseCharge.getStatusCode().equals(HttpStatus.CREATED)) {
			throw getException(httpResponseCharge.getBody());
		}
		return (String) httpResponseCharge.getBody().get("ticketNumber");
	}

	/**
	 * Add a temporary charge or discount to a Subscription identified by its
	 * <b>subscriptionId</b>.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @param params
	 *            Path requested objects.
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Boolean subscriptionAdjustment(final Map<String, Object> kushkiRequest, final Map<String, Object> params) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(KushkiServicesEnum.SUBSCRIPTION_ADJUSTMENT.getPath()), HttpMethod.PUT, httpRequest, HashMap.class, params);
		if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
			throw this.getException(httpResponse.getBody());
		}
		return Boolean.TRUE;
	}

	/**
	 * Update a subscription's card information, identified by its
	 * <b>subscriptionId</b>.
	 * 
	 * @param kushkiRequest
	 *            Request object.
	 * @param params
	 *            Path requested objects.
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Boolean suscriptionUpdateCard(final Map<String, Object> kushkiRequest, final Map<String, Object> params) throws ServletException, KushkiException {
		this.checkConfiguration();
		HttpEntity<?> httpRequest = new HttpEntity<>(kushkiRequest, this.createHeaderRest());
		ResponseEntity<HashMap> httpResponse = this.restTemplate.exchange(endPoint.concat(KushkiServicesEnum.SUBSCRIPTION_UPDATE_CARD.getPath()), HttpMethod.PUT, httpRequest, HashMap.class, params);
		if (!httpResponse.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
			throw this.getException(httpResponse.getBody());
		}
		return Boolean.TRUE;
	}

}
