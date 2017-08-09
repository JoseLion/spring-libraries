
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Novedad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Novedad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigonovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechanovedad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="novedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadonovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Novedad", propOrder = {
    "codigonovedad",
    "fechanovedad",
    "novedad",
    "estadonovedad"
})
public class Novedad {

    protected String codigonovedad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechanovedad;
    protected String novedad;
    protected String estadonovedad;

    /**
     * Gets the value of the codigonovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigonovedad() {
        return codigonovedad;
    }

    /**
     * Sets the value of the codigonovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigonovedad(String value) {
        this.codigonovedad = value;
    }

    /**
     * Gets the value of the fechanovedad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechanovedad() {
        return fechanovedad;
    }

    /**
     * Sets the value of the fechanovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechanovedad(XMLGregorianCalendar value) {
        this.fechanovedad = value;
    }

    /**
     * Gets the value of the novedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovedad() {
        return novedad;
    }

    /**
     * Sets the value of the novedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovedad(String value) {
        this.novedad = value;
    }

    /**
     * Gets the value of the estadonovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadonovedad() {
        return estadonovedad;
    }

    /**
     * Sets the value of the estadonovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadonovedad(String value) {
        this.estadonovedad = value;
    }

}
