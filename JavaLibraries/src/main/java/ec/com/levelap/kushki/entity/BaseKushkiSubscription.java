package ec.com.levelap.kushki.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseKushkiSubscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	protected Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP")
	protected Date creationDate = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	protected Date updateDate;

	@Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR")
	protected String firstName;

	@Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR")
	protected String lastName;

	@Column(name = "email", nullable = false, columnDefinition = "VARCHAR")
	protected String email;

	@Column(name = "subscription_id", nullable = false, columnDefinition = "VARCHAR")
	protected String subscriptionId;

	@Column(name = "card_finale", nullable = false, length = 4)
	protected String cardFinale;

	@Column(name = "status", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
	protected Boolean status = Boolean.TRUE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

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

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getCardFinale() {
		return cardFinale;
	}

	public void setCardFinale(String cardFinale) {
		this.cardFinale = cardFinale;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@PreUpdate
	protected void onUpdate() {
		this.setUpdateDate(new Date());
	}

}
