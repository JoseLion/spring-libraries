
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsSeguimientoNovedad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsSeguimientoNovedad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FcrioTcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FcrioCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InfoSeg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsSeguimientoNovedad", propOrder = {
    "fcrioTcc",
    "fcrioCliente",
    "fecha",
    "infoSeg"
})
public class ClsSeguimientoNovedad {

    @XmlElement(name = "FcrioTcc")
    protected String fcrioTcc;
    @XmlElement(name = "FcrioCliente")
    protected String fcrioCliente;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "InfoSeg")
    protected String infoSeg;

    /**
     * Gets the value of the fcrioTcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcrioTcc() {
        return fcrioTcc;
    }

    /**
     * Sets the value of the fcrioTcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcrioTcc(String value) {
        this.fcrioTcc = value;
    }

    /**
     * Gets the value of the fcrioCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcrioCliente() {
        return fcrioCliente;
    }

    /**
     * Sets the value of the fcrioCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcrioCliente(String value) {
        this.fcrioCliente = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the infoSeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSeg() {
        return infoSeg;
    }

    /**
     * Sets the value of the infoSeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSeg(String value) {
        this.infoSeg = value;
    }

}
