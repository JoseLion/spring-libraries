
package ec.com.levelap.tcc.wsdl.clientes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsInfoRemesa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsInfoRemesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Remesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdRemesa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Consecutivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecharemesa" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Docreferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigenMpio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodOrigenMpio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DestinoMpio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDestinoMpio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EstadoRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEstadoRemesa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TieneImagen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NombRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuentaRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PesoReal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CodPostalRte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHoraInicialRecogida" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraFinalRecogida" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraBaseCumplimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraEstimadaEntregaCumplimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Cumplimiento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CodPostalDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HorasParaCumplido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tracking" type="{http://clientes.tcc.com.co/}ArrayOfClsTrackingRemesa" minOccurs="0"/>
 *         &lt;element name="Novedades" type="{http://clientes.tcc.com.co/}ArrayOfClsNovedadRemesa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsInfoRemesa", propOrder = {
    "remesa",
    "idRemesa",
    "consecutivo",
    "numero",
    "fecharemesa",
    "docreferencia",
    "origenMpio",
    "codOrigenMpio",
    "destinoMpio",
    "codDestinoMpio",
    "estadoRemesa",
    "codEstadoRemesa",
    "tieneImagen",
    "nombRemitente",
    "direccionRemitente",
    "cuentaRemitente",
    "nombreDestinatario",
    "direccionDestinatario",
    "fechaEntrega",
    "unidades",
    "pesoReal",
    "codPostalRte",
    "fechaHoraInicialRecogida",
    "fechaHoraFinalRecogida",
    "fechaHoraBaseCumplimiento",
    "fechaHoraEstimadaEntregaCumplimiento",
    "cumplimiento",
    "codPostalDrio",
    "horasParaCumplido",
    "tracking",
    "novedades"
})
public class ClsInfoRemesa {

    @XmlElement(name = "Remesa")
    protected String remesa;
    @XmlElement(name = "IdRemesa", required = true, type = Integer.class, nillable = true)
    protected Integer idRemesa;
    @XmlElement(name = "Consecutivo", required = true, type = Integer.class, nillable = true)
    protected Integer consecutivo;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Fecharemesa", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecharemesa;
    @XmlElement(name = "Docreferencia")
    protected String docreferencia;
    @XmlElement(name = "OrigenMpio")
    protected String origenMpio;
    @XmlElement(name = "CodOrigenMpio", required = true, type = Integer.class, nillable = true)
    protected Integer codOrigenMpio;
    @XmlElement(name = "DestinoMpio")
    protected String destinoMpio;
    @XmlElement(name = "CodDestinoMpio", required = true, type = Integer.class, nillable = true)
    protected Integer codDestinoMpio;
    @XmlElement(name = "EstadoRemesa")
    protected String estadoRemesa;
    @XmlElement(name = "CodEstadoRemesa", required = true, type = Integer.class, nillable = true)
    protected Integer codEstadoRemesa;
    @XmlElement(name = "TieneImagen", required = true, type = Boolean.class, nillable = true)
    protected Boolean tieneImagen;
    @XmlElement(name = "NombRemitente")
    protected String nombRemitente;
    @XmlElement(name = "DireccionRemitente")
    protected String direccionRemitente;
    @XmlElement(name = "CuentaRemitente")
    protected String cuentaRemitente;
    @XmlElement(name = "NombreDestinatario")
    protected String nombreDestinatario;
    @XmlElement(name = "DireccionDestinatario")
    protected String direccionDestinatario;
    @XmlElement(name = "FechaEntrega", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntrega;
    @XmlElement(name = "Unidades", required = true, type = Integer.class, nillable = true)
    protected Integer unidades;
    @XmlElement(name = "PesoReal", required = true, nillable = true)
    protected BigDecimal pesoReal;
    @XmlElement(name = "CodPostalRte")
    protected String codPostalRte;
    @XmlElement(name = "FechaHoraInicialRecogida", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraInicialRecogida;
    @XmlElement(name = "FechaHoraFinalRecogida", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraFinalRecogida;
    @XmlElement(name = "FechaHoraBaseCumplimiento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraBaseCumplimiento;
    @XmlElement(name = "FechaHoraEstimadaEntregaCumplimiento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraEstimadaEntregaCumplimiento;
    @XmlElement(name = "Cumplimiento", required = true, type = Boolean.class, nillable = true)
    protected Boolean cumplimiento;
    @XmlElement(name = "CodPostalDrio")
    protected String codPostalDrio;
    @XmlElement(name = "HorasParaCumplido", required = true, type = Integer.class, nillable = true)
    protected Integer horasParaCumplido;
    @XmlElement(name = "Tracking")
    protected ArrayOfClsTrackingRemesa tracking;
    @XmlElement(name = "Novedades")
    protected ArrayOfClsNovedadRemesa novedades;

    /**
     * Gets the value of the remesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemesa() {
        return remesa;
    }

    /**
     * Sets the value of the remesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemesa(String value) {
        this.remesa = value;
    }

    /**
     * Gets the value of the idRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRemesa() {
        return idRemesa;
    }

    /**
     * Sets the value of the idRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRemesa(Integer value) {
        this.idRemesa = value;
    }

    /**
     * Gets the value of the consecutivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Sets the value of the consecutivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the fecharemesa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecharemesa() {
        return fecharemesa;
    }

    /**
     * Sets the value of the fecharemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecharemesa(XMLGregorianCalendar value) {
        this.fecharemesa = value;
    }

    /**
     * Gets the value of the docreferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocreferencia() {
        return docreferencia;
    }

    /**
     * Sets the value of the docreferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocreferencia(String value) {
        this.docreferencia = value;
    }

    /**
     * Gets the value of the origenMpio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenMpio() {
        return origenMpio;
    }

    /**
     * Sets the value of the origenMpio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenMpio(String value) {
        this.origenMpio = value;
    }

    /**
     * Gets the value of the codOrigenMpio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodOrigenMpio() {
        return codOrigenMpio;
    }

    /**
     * Sets the value of the codOrigenMpio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodOrigenMpio(Integer value) {
        this.codOrigenMpio = value;
    }

    /**
     * Gets the value of the destinoMpio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoMpio() {
        return destinoMpio;
    }

    /**
     * Sets the value of the destinoMpio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoMpio(String value) {
        this.destinoMpio = value;
    }

    /**
     * Gets the value of the codDestinoMpio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDestinoMpio() {
        return codDestinoMpio;
    }

    /**
     * Sets the value of the codDestinoMpio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDestinoMpio(Integer value) {
        this.codDestinoMpio = value;
    }

    /**
     * Gets the value of the estadoRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoRemesa() {
        return estadoRemesa;
    }

    /**
     * Sets the value of the estadoRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoRemesa(String value) {
        this.estadoRemesa = value;
    }

    /**
     * Gets the value of the codEstadoRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodEstadoRemesa() {
        return codEstadoRemesa;
    }

    /**
     * Sets the value of the codEstadoRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodEstadoRemesa(Integer value) {
        this.codEstadoRemesa = value;
    }

    /**
     * Gets the value of the tieneImagen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieneImagen() {
        return tieneImagen;
    }

    /**
     * Sets the value of the tieneImagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieneImagen(Boolean value) {
        this.tieneImagen = value;
    }

    /**
     * Gets the value of the nombRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombRemitente() {
        return nombRemitente;
    }

    /**
     * Sets the value of the nombRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombRemitente(String value) {
        this.nombRemitente = value;
    }

    /**
     * Gets the value of the direccionRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    /**
     * Sets the value of the direccionRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionRemitente(String value) {
        this.direccionRemitente = value;
    }

    /**
     * Gets the value of the cuentaRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaRemitente() {
        return cuentaRemitente;
    }

    /**
     * Sets the value of the cuentaRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaRemitente(String value) {
        this.cuentaRemitente = value;
    }

    /**
     * Gets the value of the nombreDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    /**
     * Sets the value of the nombreDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDestinatario(String value) {
        this.nombreDestinatario = value;
    }

    /**
     * Gets the value of the direccionDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    /**
     * Sets the value of the direccionDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestinatario(String value) {
        this.direccionDestinatario = value;
    }

    /**
     * Gets the value of the fechaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Sets the value of the fechaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEntrega(XMLGregorianCalendar value) {
        this.fechaEntrega = value;
    }

    /**
     * Gets the value of the unidades property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnidades() {
        return unidades;
    }

    /**
     * Sets the value of the unidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnidades(Integer value) {
        this.unidades = value;
    }

    /**
     * Gets the value of the pesoReal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoReal() {
        return pesoReal;
    }

    /**
     * Sets the value of the pesoReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoReal(BigDecimal value) {
        this.pesoReal = value;
    }

    /**
     * Gets the value of the codPostalRte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostalRte() {
        return codPostalRte;
    }

    /**
     * Sets the value of the codPostalRte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostalRte(String value) {
        this.codPostalRte = value;
    }

    /**
     * Gets the value of the fechaHoraInicialRecogida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraInicialRecogida() {
        return fechaHoraInicialRecogida;
    }

    /**
     * Sets the value of the fechaHoraInicialRecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraInicialRecogida(XMLGregorianCalendar value) {
        this.fechaHoraInicialRecogida = value;
    }

    /**
     * Gets the value of the fechaHoraFinalRecogida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraFinalRecogida() {
        return fechaHoraFinalRecogida;
    }

    /**
     * Sets the value of the fechaHoraFinalRecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraFinalRecogida(XMLGregorianCalendar value) {
        this.fechaHoraFinalRecogida = value;
    }

    /**
     * Gets the value of the fechaHoraBaseCumplimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraBaseCumplimiento() {
        return fechaHoraBaseCumplimiento;
    }

    /**
     * Sets the value of the fechaHoraBaseCumplimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraBaseCumplimiento(XMLGregorianCalendar value) {
        this.fechaHoraBaseCumplimiento = value;
    }

    /**
     * Gets the value of the fechaHoraEstimadaEntregaCumplimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraEstimadaEntregaCumplimiento() {
        return fechaHoraEstimadaEntregaCumplimiento;
    }

    /**
     * Sets the value of the fechaHoraEstimadaEntregaCumplimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraEstimadaEntregaCumplimiento(XMLGregorianCalendar value) {
        this.fechaHoraEstimadaEntregaCumplimiento = value;
    }

    /**
     * Gets the value of the cumplimiento property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCumplimiento() {
        return cumplimiento;
    }

    /**
     * Sets the value of the cumplimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCumplimiento(Boolean value) {
        this.cumplimiento = value;
    }

    /**
     * Gets the value of the codPostalDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostalDrio() {
        return codPostalDrio;
    }

    /**
     * Sets the value of the codPostalDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostalDrio(String value) {
        this.codPostalDrio = value;
    }

    /**
     * Gets the value of the horasParaCumplido property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorasParaCumplido() {
        return horasParaCumplido;
    }

    /**
     * Sets the value of the horasParaCumplido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorasParaCumplido(Integer value) {
        this.horasParaCumplido = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsTrackingRemesa }
     *     
     */
    public ArrayOfClsTrackingRemesa getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsTrackingRemesa }
     *     
     */
    public void setTracking(ArrayOfClsTrackingRemesa value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the novedades property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsNovedadRemesa }
     *     
     */
    public ArrayOfClsNovedadRemesa getNovedades() {
        return novedades;
    }

    /**
     * Sets the value of the novedades property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsNovedadRemesa }
     *     
     */
    public void setNovedades(ArrayOfClsNovedadRemesa value) {
        this.novedades = value;
    }

}
