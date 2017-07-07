
package ec.com.levelap.tcc.entity.wsrecogidas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsServicioRecogidaIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsServicioRecogidaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fecha_Inicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Fecha_Final" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IDCiudad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Persona_Solicita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsServicioRecogidaIn", propOrder = {
    "nit",
    "numero",
    "fechaInicial",
    "fechaFinal",
    "idCiudad",
    "personaSolicita"
})
public class ClsServicioRecogidaIn {

    @XmlElement(name = "Nit", required = true)
    protected BigDecimal nit;
    @XmlElement(name = "Numero", required = true, type = Integer.class, nillable = true)
    protected Integer numero;
    @XmlElement(name = "Fecha_Inicial", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicial;
    @XmlElement(name = "Fecha_Final", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinal;
    @XmlElement(name = "IDCiudad", required = true, type = Integer.class, nillable = true)
    protected Integer idCiudad;
    @XmlElement(name = "Persona_Solicita")
    protected String personaSolicita;

    /**
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNit(BigDecimal value) {
        this.nit = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
    }

    /**
     * Gets the value of the fechaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Sets the value of the fechaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicial(XMLGregorianCalendar value) {
        this.fechaInicial = value;
    }

    /**
     * Gets the value of the fechaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Sets the value of the fechaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinal(XMLGregorianCalendar value) {
        this.fechaFinal = value;
    }

    /**
     * Gets the value of the idCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCiudad() {
        return idCiudad;
    }

    /**
     * Sets the value of the idCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCiudad(Integer value) {
        this.idCiudad = value;
    }

    /**
     * Gets the value of the personaSolicita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaSolicita() {
        return personaSolicita;
    }

    /**
     * Sets the value of the personaSolicita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaSolicita(String value) {
        this.personaSolicita = value;
    }

}
