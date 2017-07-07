
package ec.com.levelap.tcc.entity.wsrecogidas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsServicio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HoraInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HoraFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Volumen" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorMercancia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TipoServicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsServicio", propOrder = {
    "fecha",
    "horaInicial",
    "horaFinal",
    "unidades",
    "peso",
    "volumen",
    "valorMercancia",
    "tipoServicio",
    "observaciones",
    "cdPago"
})
public class ClsServicio {

    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "HoraInicial", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horaInicial;
    @XmlElement(name = "HoraFinal", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horaFinal;
    @XmlElement(name = "Unidades")
    protected int unidades;
    @XmlElement(name = "Peso", required = true)
    protected BigDecimal peso;
    @XmlElement(name = "Volumen", required = true)
    protected BigDecimal volumen;
    @XmlElement(name = "ValorMercancia", required = true)
    protected BigDecimal valorMercancia;
    @XmlElement(name = "TipoServicio")
    protected int tipoServicio;
    @XmlElement(name = "Observaciones")
    protected String observaciones;
    @XmlElement(name = "CDPago")
    protected int cdPago;

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
     * Gets the value of the horaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicial() {
        return horaInicial;
    }

    /**
     * Sets the value of the horaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicial(XMLGregorianCalendar value) {
        this.horaInicial = value;
    }

    /**
     * Gets the value of the horaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFinal() {
        return horaFinal;
    }

    /**
     * Sets the value of the horaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFinal(XMLGregorianCalendar value) {
        this.horaFinal = value;
    }

    /**
     * Gets the value of the unidades property.
     * 
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Sets the value of the unidades property.
     * 
     */
    public void setUnidades(int value) {
        this.unidades = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Gets the value of the volumen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumen() {
        return volumen;
    }

    /**
     * Sets the value of the volumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumen(BigDecimal value) {
        this.volumen = value;
    }

    /**
     * Gets the value of the valorMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMercancia() {
        return valorMercancia;
    }

    /**
     * Sets the value of the valorMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMercancia(BigDecimal value) {
        this.valorMercancia = value;
    }

    /**
     * Gets the value of the tipoServicio property.
     * 
     */
    public int getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Sets the value of the tipoServicio property.
     * 
     */
    public void setTipoServicio(int value) {
        this.tipoServicio = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the cdPago property.
     * 
     */
    public int getCDPago() {
        return cdPago;
    }

    /**
     * Sets the value of the cdPago property.
     * 
     */
    public void setCDPago(int value) {
        this.cdPago = value;
    }

}
