/**
 * @Copyright:	Levelap 2017
 * @Class:		KushkiAmount.java
 * @Created:	23-03-2017
 * @Updated:	12-05-2017
 */
package ec.com.levelap.kushki.object;

/**
 * Kushki amount object.
 * 
 * @author Luis García Castro. Edit: José Luis León
 * 
 */
public class KushkiAmount {

	private Double subtotalIva = 0D;

	private Double subtotalIva0 = 0D;

	private Double ice = 0D;

	private Double iva = 0D;

	private String currency = "USD";

	/**
	 * {@link KushkiAmount} default constructor.
	 */
	public KushkiAmount() {
	}
	
	/**
	 * {@link KushkiAmount} constructor with parameters.
	 * 
	 * @param subtotalIva
	 */
	public KushkiAmount(Double subtotalIva) {
		this.subtotalIva = subtotalIva;
	}

	/**
	 * {@link KushkiAmount} constructor with parameters.
	 * 
	 * @param subtotalIva
	 * @param subtotalIva0
	 * @param ice
	 * @param iva
	 */
	public KushkiAmount(Double subtotalIva, Double subtotalIva0, Double ice, Double iva) {
		this.subtotalIva = subtotalIva;
		this.subtotalIva0 = subtotalIva0;
		this.ice = ice;
		this.iva = iva;
	}

	/* GETTERS AND SETTERS */

	public Double getSubtotalIva() {
		return subtotalIva;
	}

	public void setSubtotalIva(Double subtotalIva) {
		this.subtotalIva = subtotalIva;
	}

	public Double getSubtotalIva0() {
		return subtotalIva0;
	}

	public void setSubtotalIva0(Double subtotalIva0) {
		this.subtotalIva0 = subtotalIva0;
	}

	public Double getIce() {
		return ice;
	}

	public void setIce(Double ice) {
		this.ice = ice;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
