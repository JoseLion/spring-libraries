
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsDespachoPaqueteriaDetalle5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsDespachoPaqueteriaDetalle5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CantidadUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PesoKilosTotalDetalle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoVolumenTotalDetalle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LargoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnchoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AltoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsDespachoPaqueteriaDetalle5", propOrder = {
    "cantidadUnidades",
    "pesoKilosTotalDetalle",
    "pesoVolumenTotalDetalle",
    "largoCmsUnitario",
    "anchoCmsUnitario",
    "altoCmsUnitario"
})
public class ClsDespachoPaqueteriaDetalle5 {

    @XmlElement(name = "CantidadUnidades", required = true, type = Integer.class, nillable = true)
    protected Integer cantidadUnidades;
    @XmlElement(name = "PesoKilosTotalDetalle", required = true, type = Double.class, nillable = true)
    protected Double pesoKilosTotalDetalle;
    @XmlElement(name = "PesoVolumenTotalDetalle", required = true, type = Double.class, nillable = true)
    protected Double pesoVolumenTotalDetalle;
    @XmlElement(name = "LargoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer largoCmsUnitario;
    @XmlElement(name = "AnchoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer anchoCmsUnitario;
    @XmlElement(name = "AltoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer altoCmsUnitario;

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
     * Gets the value of the pesoKilosTotalDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoKilosTotalDetalle() {
        return pesoKilosTotalDetalle;
    }

    /**
     * Sets the value of the pesoKilosTotalDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoKilosTotalDetalle(Double value) {
        this.pesoKilosTotalDetalle = value;
    }

    /**
     * Gets the value of the pesoVolumenTotalDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoVolumenTotalDetalle() {
        return pesoVolumenTotalDetalle;
    }

    /**
     * Sets the value of the pesoVolumenTotalDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoVolumenTotalDetalle(Double value) {
        this.pesoVolumenTotalDetalle = value;
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

}
