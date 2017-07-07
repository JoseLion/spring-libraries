
package ec.com.levelap.tcc.entity.wsDespachos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpDocumentoReferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpDocumentoReferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipodocumento" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="numerodocumento" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="fechadocumento" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpDocumentoReferencia", namespace = "http://www.tcc.com.co/xsd", propOrder = {
    "tipodocumento",
    "numerodocumento",
    "fechadocumento"
})
public class TpDocumentoReferencia {

    @XmlElement(namespace = "", required = true, nillable = true)
    protected String tipodocumento;
    @XmlElement(namespace = "", required = true, nillable = true)
    protected String numerodocumento;
    @XmlElement(namespace = "", required = true, nillable = true)
    protected String fechadocumento;

    /**
     * Gets the value of the tipodocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipodocumento() {
        return tipodocumento;
    }

    /**
     * Sets the value of the tipodocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipodocumento(String value) {
        this.tipodocumento = value;
    }

    /**
     * Gets the value of the numerodocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerodocumento() {
        return numerodocumento;
    }

    /**
     * Sets the value of the numerodocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerodocumento(String value) {
        this.numerodocumento = value;
    }

    /**
     * Gets the value of the fechadocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechadocumento() {
        return fechadocumento;
    }

    /**
     * Sets the value of the fechadocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechadocumento(String value) {
        this.fechadocumento = value;
    }

}
