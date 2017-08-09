
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsDespachoPaqueteria3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsDespachoPaqueteria3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaDespacho" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodigoCuentaRemitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroIdentificacionDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BarrioDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPeso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalValorMercancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TipoServicioTCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsuarioUltimaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentosDevolver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentosEntregar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EsEntregaBodega" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="detDespacho" type="{http://clientes.tcc.com.co/}ArrayOfClsDespachoPaqueteriaDetalle3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsDespachoPaqueteria3", propOrder = {
    "fechaDespacho",
    "codigoCuentaRemitente",
    "nombreDestinatario",
    "numeroIdentificacionDrio",
    "telefonoDrio",
    "direccionDrio",
    "idDestino",
    "barrioDrio",
    "totalUnidades",
    "totalPeso",
    "totalValorMercancia",
    "tipoServicioTCC",
    "comentarios",
    "numeroRemesa",
    "usuarioCreacion",
    "usuarioUltimaModificacion",
    "tipoDocumentoReferencia",
    "numeroDocumentoReferencia",
    "fechaDocumentoReferencia",
    "documentosDevolver",
    "documentosEntregar",
    "esEntregaBodega",
    "detDespacho"
})
public class ClsDespachoPaqueteria3 {

    @XmlElement(name = "FechaDespacho", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespacho;
    @XmlElement(name = "CodigoCuentaRemitente", required = true, type = Integer.class, nillable = true)
    protected Integer codigoCuentaRemitente;
    @XmlElement(name = "NombreDestinatario")
    protected String nombreDestinatario;
    @XmlElement(name = "NumeroIdentificacionDrio")
    protected String numeroIdentificacionDrio;
    @XmlElement(name = "TelefonoDrio")
    protected String telefonoDrio;
    @XmlElement(name = "DireccionDrio")
    protected String direccionDrio;
    @XmlElement(name = "IDDestino")
    protected int idDestino;
    @XmlElement(name = "BarrioDrio")
    protected String barrioDrio;
    @XmlElement(name = "TotalUnidades", required = true, type = Integer.class, nillable = true)
    protected Integer totalUnidades;
    @XmlElement(name = "TotalPeso", required = true, type = Double.class, nillable = true)
    protected Double totalPeso;
    @XmlElement(name = "TotalValorMercancia", required = true, type = Double.class, nillable = true)
    protected Double totalValorMercancia;
    @XmlElement(name = "TipoServicioTCC")
    protected String tipoServicioTCC;
    @XmlElement(name = "Comentarios")
    protected String comentarios;
    @XmlElement(name = "NumeroRemesa")
    protected String numeroRemesa;
    @XmlElement(name = "UsuarioCreacion")
    protected String usuarioCreacion;
    @XmlElement(name = "UsuarioUltimaModificacion")
    protected String usuarioUltimaModificacion;
    @XmlElement(name = "TipoDocumentoReferencia")
    protected String tipoDocumentoReferencia;
    @XmlElement(name = "NumeroDocumentoReferencia")
    protected String numeroDocumentoReferencia;
    @XmlElement(name = "FechaDocumentoReferencia", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumentoReferencia;
    @XmlElement(name = "DocumentosDevolver", required = true, type = Integer.class, nillable = true)
    protected Integer documentosDevolver;
    @XmlElement(name = "DocumentosEntregar", required = true, type = Integer.class, nillable = true)
    protected Integer documentosEntregar;
    @XmlElement(name = "EsEntregaBodega")
    protected boolean esEntregaBodega;
    protected ArrayOfClsDespachoPaqueteriaDetalle3 detDespacho;

    /**
     * Gets the value of the fechaDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespacho() {
        return fechaDespacho;
    }

    /**
     * Sets the value of the fechaDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespacho(XMLGregorianCalendar value) {
        this.fechaDespacho = value;
    }

    /**
     * Gets the value of the codigoCuentaRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoCuentaRemitente() {
        return codigoCuentaRemitente;
    }

    /**
     * Sets the value of the codigoCuentaRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoCuentaRemitente(Integer value) {
        this.codigoCuentaRemitente = value;
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
     * Gets the value of the numeroIdentificacionDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionDrio() {
        return numeroIdentificacionDrio;
    }

    /**
     * Sets the value of the numeroIdentificacionDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionDrio(String value) {
        this.numeroIdentificacionDrio = value;
    }

    /**
     * Gets the value of the telefonoDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoDrio() {
        return telefonoDrio;
    }

    /**
     * Sets the value of the telefonoDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoDrio(String value) {
        this.telefonoDrio = value;
    }

    /**
     * Gets the value of the direccionDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDrio() {
        return direccionDrio;
    }

    /**
     * Sets the value of the direccionDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDrio(String value) {
        this.direccionDrio = value;
    }

    /**
     * Gets the value of the idDestino property.
     * 
     */
    public int getIDDestino() {
        return idDestino;
    }

    /**
     * Sets the value of the idDestino property.
     * 
     */
    public void setIDDestino(int value) {
        this.idDestino = value;
    }

    /**
     * Gets the value of the barrioDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrioDrio() {
        return barrioDrio;
    }

    /**
     * Sets the value of the barrioDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrioDrio(String value) {
        this.barrioDrio = value;
    }

    /**
     * Gets the value of the totalUnidades property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalUnidades() {
        return totalUnidades;
    }

    /**
     * Sets the value of the totalUnidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalUnidades(Integer value) {
        this.totalUnidades = value;
    }

    /**
     * Gets the value of the totalPeso property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPeso() {
        return totalPeso;
    }

    /**
     * Sets the value of the totalPeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPeso(Double value) {
        this.totalPeso = value;
    }

    /**
     * Gets the value of the totalValorMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValorMercancia() {
        return totalValorMercancia;
    }

    /**
     * Sets the value of the totalValorMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValorMercancia(Double value) {
        this.totalValorMercancia = value;
    }

    /**
     * Gets the value of the tipoServicioTCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServicioTCC() {
        return tipoServicioTCC;
    }

    /**
     * Sets the value of the tipoServicioTCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServicioTCC(String value) {
        this.tipoServicioTCC = value;
    }

    /**
     * Gets the value of the comentarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Sets the value of the comentarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Gets the value of the numeroRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRemesa() {
        return numeroRemesa;
    }

    /**
     * Sets the value of the numeroRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRemesa(String value) {
        this.numeroRemesa = value;
    }

    /**
     * Gets the value of the usuarioCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * Sets the value of the usuarioCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCreacion(String value) {
        this.usuarioCreacion = value;
    }

    /**
     * Gets the value of the usuarioUltimaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioUltimaModificacion() {
        return usuarioUltimaModificacion;
    }

    /**
     * Sets the value of the usuarioUltimaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioUltimaModificacion(String value) {
        this.usuarioUltimaModificacion = value;
    }

    /**
     * Gets the value of the tipoDocumentoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoReferencia() {
        return tipoDocumentoReferencia;
    }

    /**
     * Sets the value of the tipoDocumentoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoReferencia(String value) {
        this.tipoDocumentoReferencia = value;
    }

    /**
     * Gets the value of the numeroDocumentoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumentoReferencia() {
        return numeroDocumentoReferencia;
    }

    /**
     * Sets the value of the numeroDocumentoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumentoReferencia(String value) {
        this.numeroDocumentoReferencia = value;
    }

    /**
     * Gets the value of the fechaDocumentoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDocumentoReferencia() {
        return fechaDocumentoReferencia;
    }

    /**
     * Sets the value of the fechaDocumentoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDocumentoReferencia(XMLGregorianCalendar value) {
        this.fechaDocumentoReferencia = value;
    }

    /**
     * Gets the value of the documentosDevolver property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentosDevolver() {
        return documentosDevolver;
    }

    /**
     * Sets the value of the documentosDevolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentosDevolver(Integer value) {
        this.documentosDevolver = value;
    }

    /**
     * Gets the value of the documentosEntregar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentosEntregar() {
        return documentosEntregar;
    }

    /**
     * Sets the value of the documentosEntregar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentosEntregar(Integer value) {
        this.documentosEntregar = value;
    }

    /**
     * Gets the value of the esEntregaBodega property.
     * 
     */
    public boolean isEsEntregaBodega() {
        return esEntregaBodega;
    }

    /**
     * Sets the value of the esEntregaBodega property.
     * 
     */
    public void setEsEntregaBodega(boolean value) {
        this.esEntregaBodega = value;
    }

    /**
     * Gets the value of the detDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsDespachoPaqueteriaDetalle3 }
     *     
     */
    public ArrayOfClsDespachoPaqueteriaDetalle3 getDetDespacho() {
        return detDespacho;
    }

    /**
     * Sets the value of the detDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsDespachoPaqueteriaDetalle3 }
     *     
     */
    public void setDetDespacho(ArrayOfClsDespachoPaqueteriaDetalle3 value) {
        this.detDespacho = value;
    }

}
