package ec.com.levelap.kushki.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseKushkiPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	protected Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP")
	protected Date creationDate = new Date();

	@Column(name = "transaction_number", columnDefinition = "VARCHAR")
	protected String transactionNumber;

	@Column(name = "amount_subtotal_iva")
	protected Double amountSubtotalIva;

	@Column(name = "amount_subtotal_iva0")
	protected Double amountSubtotalIva0;

	@Column(name = "amount_iva")
	protected Double amountIva;

	@Column(name = "amount_currency")
	protected String amountCurrency = "USD";

	@Column(name = "error_code", columnDefinition = "VARCHAR")
	protected String errorCode;

	@Column(name = "error_message", columnDefinition = "VARCHAR")
	protected String errorMessage;

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

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public Double getAmountSubtotalIva() {
		return amountSubtotalIva;
	}

	public void setAmountSubtotalIva(Double amountSubtotalIva) {
		this.amountSubtotalIva = amountSubtotalIva;
	}

	public Double getAmountSubtotalIva0() {
		return amountSubtotalIva0;
	}

	public void setAmountSubtotalIva0(Double amountSubtotalIva0) {
		this.amountSubtotalIva0 = amountSubtotalIva0;
	}

	public Double getAmountIva() {
		return amountIva;
	}

	public void setAmountIva(Double amountIva) {
		this.amountIva = amountIva;
	}

	public String getAmountCurrency() {
		return amountCurrency;
	}

	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
