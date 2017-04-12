/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiSubscriptionRequest.java
 * @Created:	23-03-2016
 * @Updated:	
 */
package ec.com.levelap.kushki.object;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Kushki subscription request object.
 * 
 * @author Luis García Castro
 */
public class KushkiSubscriptionRequest {

	private String token;

	private String planName;

	private String periodicity;

	private KushkiContact contactDetails;

	private KushkiAmount amount;

	private String startDate;

	private String language;

	private Map<String, String> metadata;

	/**
	 * {@link KushkiContact} constructor with parameters
	 * 
	 * @param planName
	 * @param periodicity
	 * @param language
	 * @param metadata
	 */
	public KushkiSubscriptionRequest(String planName, String periodicity, String language, Map<String, String> metadata) {
		Calendar today = Calendar.getInstance();
		StringBuilder finalDate = new StringBuilder();
		finalDate.append(today.get(Calendar.YEAR));
		finalDate.append("-");
		finalDate.append(today.get(Calendar.MONTH) < 9 ? "0" : "");
		finalDate.append(today.get(Calendar.MONTH) + 1);
		finalDate.append("-");
		finalDate.append(today.get(Calendar.DATE));
		this.startDate = finalDate.toString();

		this.planName = planName;

		this.periodicity = periodicity;

		this.language = language;

		if (metadata == null) {
			this.metadata = new HashMap<>();
		} else {
			this.metadata = metadata;
		}
	}

	/* GETTERS AND SETTERS */

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public KushkiContact getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(KushkiContact contactDetails) {
		this.contactDetails = contactDetails;
	}

	public KushkiAmount getAmount() {
		return amount;
	}

	public void setAmount(KushkiAmount amount) {
		this.amount = amount;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

}
