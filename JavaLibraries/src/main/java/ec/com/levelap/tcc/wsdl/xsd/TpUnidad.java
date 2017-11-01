
package ec.com.levelap.tcc.wsdl.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpUnidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpUnidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipounidad" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="tipoempaque" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="claseempaque" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="dicecontener" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="cantidadunidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="kilosreales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="pesovolumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="valormercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codigobarras" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="numerobolsa" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="referencias" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="unidadesinternas" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpUnidad", propOrder = {
    "tipounidad",
    "tipoempaque",
    "claseempaque",
    "dicecontener",
    "cantidadunidades",
    "kilosreales",
    "largo",
    "alto",
    "ancho",
    "pesovolumen",
    "valormercancia",
    "codigobarras",
    "numerobolsa",
    "referencias",
    "unidadesinternas"
})
public class TpUnidad {

    @XmlElement(required = true, nillable = true)
    protected String tipounidad;
    @XmlElement(required = true, nillable = true)
    protected String tipoempaque;
    @XmlElement(required = true, nillable = true)
    protected String claseempaque;
    @XmlElement(required = true, nillable = true)
    protected String dicecontener;
    protected String cantidadunidades;
    protected String kilosreales;
    @XmlElement(required = true, nillable = true)
    protected String largo;
    @XmlElement(required = true, nillable = true)
    protected String alto;
    @XmlElement(required = true, nillable = true)
    protected String ancho;
    protected String pesovolumen;
    protected String valormercancia;
    @XmlElement(required = true, nillable = true)
    protected String codigobarras;
    @XmlElement(required = true, nillable = true)
    protected String numerobolsa;
    @XmlElement(required = true, nillable = true)
    protected String referencias;
    @XmlElement(required = true, nillable = true)
    protected String unidadesinternas;

    /**
     * Gets the value of the tipounidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipounidad() {
        return tipounidad;
    }

    /**
     * Sets the value of the tipounidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipounidad(String value) {
        this.tipounidad = value;
    }

    /**
     * Gets the value of the tipoempaque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoempaque() {
        return tipoempaque;
    }

    /**
     * Sets the value of the tipoempaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoempaque(String value) {
        this.tipoempaque = value;
    }

    /**
     * Gets the value of the claseempaque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseempaque() {
        return claseempaque;
    }

    /**
     * Sets the value of the claseempaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseempaque(String value) {
        this.claseempaque = value;
    }

    /**
     * Gets the value of the dicecontener property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicecontener() {
        return dicecontener;
    }

    /**
     * Sets the value of the dicecontener property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicecontener(String value) {
        this.dicecontener = value;
    }

    /**
     * Gets the value of the cantidadunidades property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadunidades() {
        return cantidadunidades;
    }

    /**
     * Sets the value of the cantidadunidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadunidades(String value) {
        this.cantidadunidades = value;
    }

    /**
     * Gets the value of the kilosreales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilosreales() {
        return kilosreales;
    }

    /**
     * Sets the value of the kilosreales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilosreales(String value) {
        this.kilosreales = value;
    }

    /**
     * Gets the value of the largo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargo() {
        return largo;
    }

    /**
     * Sets the value of the largo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargo(String value) {
        this.largo = value;
    }

    /**
     * Gets the value of the alto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlto() {
        return alto;
    }

    /**
     * Sets the value of the alto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlto(String value) {
        this.alto = value;
    }

    /**
     * Gets the value of the ancho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncho() {
        return ancho;
    }

    /**
     * Sets the value of the ancho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncho(String value) {
        this.ancho = value;
    }

    /**
     * Gets the value of the pesovolumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesovolumen() {
        return pesovolumen;
    }

    /**
     * Sets the value of the pesovolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesovolumen(String value) {
        this.pesovolumen = value;
    }

    /**
     * Gets the value of the valormercancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValormercancia() {
        return valormercancia;
    }

    /**
     * Sets the value of the valormercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValormercancia(String value) {
        this.valormercancia = value;
    }

    /**
     * Gets the value of the codigobarras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigobarras() {
        return codigobarras;
    }

    /**
     * Sets the value of the codigobarras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigobarras(String value) {
        this.codigobarras = value;
    }

    /**
     * Gets the value of the numerobolsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerobolsa() {
        return numerobolsa;
    }

    /**
     * Sets the value of the numerobolsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerobolsa(String value) {
        this.numerobolsa = value;
    }

    /**
     * Gets the value of the referencias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencias() {
        return referencias;
    }

    /**
     * Sets the value of the referencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencias(String value) {
        this.referencias = value;
    }

    /**
     * Gets the value of the unidadesinternas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadesinternas() {
        return unidadesinternas;
    }

    /**
     * Sets the value of the unidadesinternas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadesinternas(String value) {
        this.unidadesinternas = value;
    }

}
