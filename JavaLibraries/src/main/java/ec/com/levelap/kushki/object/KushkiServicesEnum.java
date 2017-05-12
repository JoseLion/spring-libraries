/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiServicesEnum.java
 * @Created:	12-05-2017
 * @Updated:	
 */
package ec.com.levelap.kushki.object;

/**
 * Kushki Web Services RESTful paths.
 * 
 * @author Luis García Castro
 */
public enum KushkiServicesEnum {

	TRANSACTION_CHARGE(1, "/charges"),
	TRANSACTION_VOID(2, "/charges/{ticketNumber}"),
	SUBSCRIPTION_CREATE(3, "/subscriptions"),
	SUBSCRIPTION_CANCEL(4, "/subscriptions/{subscriptionId}"),
	SUBSCRIPTION_UPDATE(5, "/subscriptions/{subscriptionId}"),
	SUBSCRIPTION_CHARGE(6, "/subscriptions/{subscriptionId}/charges"),
	SUBSCRIPTION_ADJUSTMENT(7, "/subscriptions/{subscriptionId}/adjustment"),
	SUBSCRIPTION_UPDATE_CARD(8, "/subscriptions/{subscriptionId}/card");

	private Integer id;

	private String path;

	/**
	 * {@link KushkiServicesEnum} constructor with parameters.
	 */
	private KushkiServicesEnum(Integer id, String path) {
		this.id = id;
		this.path = path;
	}

	/* GETTERS AND SETTERS */

	public Integer getId() {
		return id;
	}

	public void setCode(Integer id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
