
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsDespachoPaqueteria2_Detalle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsDespachoPaqueteria2_Detalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoIUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDeEmpaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PesoKilosUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoVolumenUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LargoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnchoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AltoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValorMercanciaUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsDespachoPaqueteria2_Detalle", propOrder = {
    "codigoIUP",
    "tipoDeEmpaque",
    "referencia",
    "descripcion",
    "cantidadUnidades",
    "pesoKilosUnitario",
    "pesoVolumenUnitario",
    "largoCmsUnitario",
    "anchoCmsUnitario",
    "altoCmsUnitario",
    "valorMercanciaUnitario"
})
public class ClsDespachoPaqueteria2Detalle {

    @XmlElement(name = "CodigoIUP")
    protected String codigoIUP;
    @XmlElement(name = "TipoDeEmpaque")
    protected String tipoDeEmpaque;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "CantidadUnidades", required = true, type = Integer.class, nillable = true)
    protected Integer cantidadUnidades;
    @XmlElement(name = "PesoKilosUnitario", required = true, type = Double.class, nillable = true)
    protected Double pesoKilosUnitario;
    @XmlElement(name = "PesoVolumenUnitario", required = true, type = Double.class, nillable = true)
    protected Double pesoVolumenUnitario;
    @XmlElement(name = "LargoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer largoCmsUnitario;
    @XmlElement(name = "AnchoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer anchoCmsUnitario;
    @XmlElement(name = "AltoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer altoCmsUnitario;
    @XmlElement(name = "ValorMercanciaUnitario", required = true, type = Double.class, nillable = true)
    protected Double valorMercanciaUnitario;

    /**
     * Gets the value of the codigoIUP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIUP() {
        return codigoIUP;
    }

    /**
     * Sets the value of the codigoIUP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIUP(String value) {
        this.codigoIUP = value;
    }

    /**
     * Gets the value of the tipoDeEmpaque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeEmpaque() {
        return tipoDeEmpaque;
    }

    /**
     * Sets the value of the tipoDeEmpaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeEmpaque(String value) {
        this.tipoDeEmpaque = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the cantidadUnidades property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadUnidades() {
        return cantidadUnidades;
    }

    /**
     * Sets the value of the cantidadUnidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadUnidades(Integer value) {
        this.cantidadUnidades = value;
    }

    /**
     * Gets the value of the pesoKilosUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoKilosUnitario() {
        return pesoKilosUnitario;
    }

    /**
     * Sets the value of the pesoKilosUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoKilosUnitario(Double value) {
        this.pesoKilosUnitario = value;
    }

    /**
     * Gets the value of the pesoVolumenUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoVolumenUnitario() {
        return pesoVolumenUnitario;
    }

    /**
     * Sets the value of the pesoVolumenUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoVolumenUnitario(Double value) {
        this.pesoVolumenUnitario = value;
    }

    /**
     * Gets the value of the largoCmsUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLargoCmsUnitario() {
        return largoCmsUnitario;
    }

    /**
     * Sets the value of the largoCmsUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLargoCmsUnitario(Integer value) {
        this.largoCmsUnitario = value;
    }

    /**
     * Gets the value of the anchoCmsUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchoCmsUnitario() {
        return anchoCmsUnitario;
    }

    /**
     * Sets the value of the anchoCmsUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchoCmsUnitario(Integer value) {
        this.anchoCmsUnitario = value;
    }

    /**
     * Gets the value of the altoCmsUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAltoCmsUnitario() {
        return altoCmsUnitario;
    }

    /**
     * Sets the value of the altoCmsUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAltoCmsUnitario(Integer value) {
        this.altoCmsUnitario = value;
    }

    /**
     * Gets the value of the valorMercanciaUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMercanciaUnitario() {
        return valorMercanciaUnitario;
    }

    /**
     * Sets the value of the valorMercanciaUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMercanciaUnitario(Double value) {
        this.valorMercanciaUnitario = value;
    }

}
