/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiContact.java
 * @Created:	23-03-2017
 * @Updated:	12-05-2017
 */
package ec.com.levelap.kushki.object;

/**
 * Kushki contact object.
 * 
 * @author Luis García Castro
 */
public class KushkiContact {

	private String firstName;

	private String lastName;

	private String email;

	/**
	 * {@link KushkiContact} default constructor.
	 */
	public KushkiContact() {
	}

	/**
	 * {@link KushkiContact} constructor with parameters.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public KushkiContact(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	/* GETTERS AND SETTERS */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
