/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiService.java
 * @Created:	23-03-2016
 * @Updated:	12-05-2016
 */
package ec.com.levelap.kushki.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.com.levelap.kushki.KushkiException;
import ec.com.levelap.kushki.object.KushkiAmount;
import ec.com.levelap.kushki.object.KushkiContact;
import ec.com.levelap.kushki.object.KushkiServicesEnum;

/**
 * Kushki integration with Spring Framework exposed as {@link Service}. The
 * integration need a configuration like:<br/>
 * * In application.yml:<br/>
 * <br/>
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
public class KushkiService extends KushkiServiceIntegration {

	/**
	 * Make a charge with a <b>token</b> provided by Kushki which represents the
	 * customer's credit card. The <b>amount object</b> contains the detailed
	 * amount to be charged. If the <b>months</b> field is provided and is
	 * between 2 and 48, a deferred charge will be performed.
	 * 
	 * @param token
	 *            Kushki token generated at frontend ({@link String}).
	 * @param amount
	 *            {@link KushkiAmount} object.
	 * @param optionals
	 *            {@link Map} of optionals values:<br/>
	 *            * months: {@link Integer} number with max value of 48.<br/>
	 *            * metadata: {@link Map} of {@link String}.
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	public String transactionCharge(final String token, final KushkiAmount amount, final Map<String, Object>... optionals) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		kushkiRequest.put("token", token);
		kushkiRequest.put("amount", amount);
		if (optionals[0].get("months") == null) {
			kushkiRequest.put("months", optionals[0].get("months"));
		}
		if (optionals[0].get("metadata") == null) {
			kushkiRequest.put("metadata", optionals[0].get("metadata"));
		}
		return (String) super.doOperation(KushkiServicesEnum.TRANSACTION_CHARGE, kushkiRequest);
	}

	/**
	 * Void a transaction identified by its <b>ticketNumber</b>. The
	 * <b>ticketNumber</b> is provided when a charge or a deferred charge is
	 * successful. The <b>amount object</b> contains the detailed amount of the
	 * transaction to be voided.
	 * 
	 * @param ticketNumber
	 *            Transaction ticket number generated on charge event
	 *            ({@link String}).
	 * @param optionals
	 *            {@link Map} of optionals values:<br/>
	 *            * amount: {@link KushkiAmount} object.
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	public String voidTransactionCharge(final String ticketNumber, final Map<String, Object>... optionals) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		if (optionals[0].get("amount") == null) {
			kushkiRequest.put("amount", optionals[0].get("amount"));
		}
		Map<String, Object> params = new HashMap<>();
		params.put("ticketNumber", ticketNumber);
		return (String) super.doOperation(KushkiServicesEnum.TRANSACTION_VOID, kushkiRequest, params);
	}

	/**
	 * Create a subscription with a <b>token</b> provided by Kushki which
	 * represents the customer's credit card. The <b>amount object</b> contains
	 * the detailed amount to be charged with the given <b>periodicity</b>.
	 * 
	 * @param token
	 *            Kushki token generated at frontend ({@link String}).
	 * @param planName
	 *            Single name for the plan ({@link String}).
	 * @param periodicity
	 *            The periodicity's charge type ({@link String}):<br/>
	 *            * daily<br/>
	 *            * weekly</br>
	 *            * biweekly</br>
	 *            * monthly</br>
	 *            * quarterly</br>
	 *            * halfYearly</br>
	 *            * yearly</br>
	 *            * custom
	 * @param contactDetails
	 *            {@link KushkiContact} object.
	 * @param amount
	 *            {@link KushkiAmount} object.
	 * @param optionals
	 *            {@link Map} of optionals values:<br/>
	 *            * language: {@link String} acronym of language ("es", "fr",
	 *            "en").<br/>
	 *            * metadata: {@link Map} of {@link String}.
	 * @return the subscription number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public String subscriptionCreate(final String token, final String planName, final String periodicity, final KushkiContact contactDetails, final KushkiAmount amount, final Map<String, Object>... optionals) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		kushkiRequest.put("token", token);
		kushkiRequest.put("planName", planName);
		kushkiRequest.put("periodicity", periodicity);
		kushkiRequest.put("contactDetails", contactDetails);
		kushkiRequest.put("amount", amount);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date today = Calendar.getInstance().getTime();
		kushkiRequest.put("startDate", dateFormat.format(today));
		if (optionals[0].get("language") == null) {
			kushkiRequest.put("language", optionals[0].get("language"));
		}
		if (optionals[0].get("metadata") == null) {
			kushkiRequest.put("metadata", optionals[0].get("metadata"));
		}
		return (String) super.doOperation(KushkiServicesEnum.SUBSCRIPTION_CREATE, kushkiRequest);
	}

	/**
	 * Cancel a subscription identified by its <b>subscriptionId</b>.
	 * 
	 * @param subscriptionId
	 *            Subscription id to be cancel ({@link String}).
	 * @param optionals
	 *            {@link Map} of optionals values:<br/>
	 *            * language: {@link String} acronym of language ("es", "fr",
	 *            "en").<br/>
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public Boolean subscriptionCancel(final String subscriptionId, final Map<String, Object>... optionals) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		if (optionals[0].get("language") == null) {
			kushkiRequest.put("language", optionals[0].get("language"));
		}
		Map<String, Object> params = new HashMap<>();
		params.put("subscriptionId", subscriptionId);
		return (Boolean) super.doOperation(KushkiServicesEnum.SUBSCRIPTION_CANCEL, kushkiRequest, params);
	}

	/**
	 * Update a subscription identified by its <b>subscriptionId</b>. All the
	 * fields are optional, they must be sent if they are meant to be changed.
	 * 
	 * @param subscriptionId
	 *            Subscription id to be updated ({@link String}).
	 * @param optionals
	 *            {@link Map} of optionals values:<br/>
	 *            * planName: Single name for the plan ({@link String}).<br/>
	 *            * periodicity: The periodicity's charge type
	 *            ({@link String}):<br/>
	 *            - daily<br/>
	 *            - weekly</br>
	 *            - biweekly</br>
	 *            - monthly</br>
	 *            - quarterly</br>
	 *            - halfYearly</br>
	 *            - yearly</br>
	 *            - custom</br>
	 *            * contactDetails: {@link KushkiContact} object.</br>
	 *            * amount: {@link KushkiAmount} object.</br>
	 *            * language: {@link String} acronym of language ("es", "fr",
	 *            "en").<br/>
	 *            * metadata: {@link Map} of {@link String}.
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "unchecked" })
	public Boolean subscriptionUpdate(final String subscriptionId, final Map<String, Object>... optionals) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		if (optionals[0].get("planName") != null) {
			kushkiRequest.put("planName", optionals[0].get("planName"));
		}
		if (optionals[0].get("periodicity") != null) {
			kushkiRequest.put("periodicity", optionals[0].get("periodicity"));
		}
		if (optionals[0].get("contactDetails") != null) {
			kushkiRequest.put("contactDetails", optionals[0].get("contactDetails"));
		}
		if (optionals[0].get("amount") != null) {
			kushkiRequest.put("amount", optionals[0].get("amount"));
		}
		if (optionals[0].get("startDate") != null) {
			kushkiRequest.put("startDate", optionals[0].get("startDate"));
		}
		if (optionals[0].get("language") != null) {
			kushkiRequest.put("language", optionals[0].get("language"));
		}
		if (optionals[0].get("metadata") != null) {
			kushkiRequest.put("metadata", optionals[0].get("metadata"));
		}
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("subscriptionId", subscriptionId);
		return (Boolean) super.doOperation(KushkiServicesEnum.SUBSCRIPTION_UPDATE, kushkiRequest, params);
	}

	/**
	 * Make a charge on an existing subscription identified by its
	 * <b>subscriptionId</b>. The <b>cvv</b> is optional but if parameterized it
	 * will be validated. The <b>amount</b> is optional but if it is present on
	 * the request is used instead the amount configured on the Subscription.
	 * 
	 * @param subscriptionId
	 *            Subscription id to be charged ({@link String}).
	 * @param optionals
	 *            {@link Map} of optionals values:<br/>
	 *            * amount: {@link KushkiAmount} object.</br>
	 *            * cvv: {@link String} card secure code.</br>
	 *            * language: {@link String} acronym of language ("es", "fr",
	 *            "en").<br/>
	 *            * metadata: {@link Map} of {@link String}.
	 * @return the transaction ticket number generated.
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "unchecked" })
	public String subscriptionCharge(final String subscriptionId, final Map<String, Object>... optionals) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		if (optionals[0].get("amount") != null) {
			kushkiRequest.put("amount", optionals[0].get("amount"));
		}
		if (optionals[0].get("cvv") != null) {
			kushkiRequest.put("cvv", optionals[0].get("cvv"));
		}
		if (optionals[0].get("language") != null) {
			kushkiRequest.put("language", optionals[0].get("language"));
		}
		if (optionals[0].get("metadata") != null) {
			kushkiRequest.put("metadata", optionals[0].get("metadata"));
		}
		Map<String, Object> params = new HashMap<>();
		params.put("subscriptionId", subscriptionId);
		return (String) super.doOperation(KushkiServicesEnum.SUBSCRIPTION_CHARGE, kushkiRequest, params);
	}

	/**
	 * Add a temporary charge or discount to a Subscription identified by its
	 * <b>subscriptionId</b>.
	 * 
	 * @param subscriptionId
	 *            Subscription id to make an adjustment ({@link String}).
	 * @param type
	 *            Additional operation type ({@link String}):<br/>
	 *            * charge<br/>
	 *            * discount
	 * @param amount
	 *            {@link KushkiAmount} object.
	 * @param periods
	 *            {@link Integer} number with min value of 1.
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "unchecked" })
	public Boolean suscriptionAdjustment(final String subscriptionId, final String type, final KushkiAmount amount, final Integer periods) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		kushkiRequest.put("type", type);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date today = Calendar.getInstance().getTime();
		kushkiRequest.put("date", dateFormat.format(today));
		kushkiRequest.put("amount", amount);
		kushkiRequest.put("periods", periods);
		Map<String, Object> params = new HashMap<>();
		params.put("subscriptionId", subscriptionId);
		return (Boolean) super.doOperation(KushkiServicesEnum.SUBSCRIPTION_ADJUSTMENT, kushkiRequest, params);
	}

	/**
	 * Update a subscription's card information, identified by its
	 * <b>subscriptionId</b>.
	 * 
	 * @param subscriptionId
	 *            Subscription id to update the card ({@link String}).
	 * @param token
	 *            Kushki token generated at frontend ({@link String}).
	 * @return Final transaction status (TRUE for successful response).
	 * @throws ServletException
	 * @throws KushkiException
	 */
	@Transactional
	@SuppressWarnings({ "unchecked" })
	public Boolean suscriptionUpdateCard(final String subscriptionId, final String token) throws ServletException, KushkiException {
		Map<String, Object> kushkiRequest = new HashMap<>();
		kushkiRequest.put("token", token);
		Map<String, Object> params = new HashMap<>();
		params.put("subscriptionId", subscriptionId);
		return (Boolean) super.doOperation(KushkiServicesEnum.SUBSCRIPTION_UPDATE_CARD, kushkiRequest, params);
	}

}
