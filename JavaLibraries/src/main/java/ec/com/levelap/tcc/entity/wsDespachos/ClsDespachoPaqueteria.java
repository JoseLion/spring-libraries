
package ec.com.levelap.tcc.entity.wsDespachos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsDespachoPaqueteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsDespachoPaqueteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDDespacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHoraLote" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaDespacho" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IDClienteRemitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDCiudadCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDSucursalRemitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoCuentaRemitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTipoIdentificacionRte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroIdentificacionRte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoRte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionRte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDaneOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDCDOrigen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTipoIdentificacionDrio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroIdentificacionDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDaneDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BarrioDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDCDDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPeso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalPesoFacturado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalValorMercancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TipoServicioTCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDEstadoDespacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaHoraCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHoraUltimaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UsuarioUltimaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComentarioAnulacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHoraAnulacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UsuarioAnulacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentosDevolver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentosEntregar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EsEntregaBodega" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CentroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CiudadOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartamentoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartamentoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detDespacho" type="{http://clientes.tcc.com.co/}ArrayOfClsDespachoPaqueteriaDetalle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsDespachoPaqueteria", propOrder = {
    "idDespacho",
    "codigoLote",
    "fechaHoraLote",
    "fechaHoraRecepcion",
    "fechaDespacho",
    "idClienteRemitente",
    "idCiudadCliente",
    "idSucursalRemitente",
    "codigoCuentaRemitente",
    "nombreRemitente",
    "idTipoIdentificacionRte",
    "numeroIdentificacionRte",
    "telefonoRte",
    "direccionRte",
    "codigoDaneOrigen",
    "idOrigen",
    "idcdOrigen",
    "nombreDestinatario",
    "idTipoIdentificacionDrio",
    "numeroIdentificacionDrio",
    "telefonoDrio",
    "direccionDrio",
    "codigoDaneDestino",
    "idDestino",
    "barrioDrio",
    "idcdDestino",
    "totalUnidades",
    "totalPeso",
    "totalPesoFacturado",
    "totalValorMercancia",
    "tipoServicioTCC",
    "comentarios",
    "numeroRemesa",
    "idEstadoDespacho",
    "fechaHoraCreacion",
    "usuarioCreacion",
    "fechaHoraUltimaModificacion",
    "usuarioUltimaModificacion",
    "comentarioAnulacion",
    "fechaHoraAnulacion",
    "usuarioAnulacion",
    "tipoDocumentoReferencia",
    "numeroDocumentoReferencia",
    "fechaDocumentoReferencia",
    "documentosDevolver",
    "documentosEntregar",
    "esEntregaBodega",
    "centroCosto",
    "ciudadOrigen",
    "departamentoOrigen",
    "ciudadDestino",
    "departamentoDestino",
    "detDespacho"
})
public class ClsDespachoPaqueteria {

    @XmlElement(name = "IDDespacho", required = true, type = Integer.class, nillable = true)
    protected Integer idDespacho;
    @XmlElement(name = "CodigoLote")
    protected String codigoLote;
    @XmlElement(name = "FechaHoraLote", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraLote;
    @XmlElement(name = "FechaHoraRecepcion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraRecepcion;
    @XmlElement(name = "FechaDespacho", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespacho;
    @XmlElement(name = "IDClienteRemitente", required = true, type = Integer.class, nillable = true)
    protected Integer idClienteRemitente;
    @XmlElement(name = "IDCiudadCliente", required = true, type = Integer.class, nillable = true)
    protected Integer idCiudadCliente;
    @XmlElement(name = "IDSucursalRemitente", required = true, type = Integer.class, nillable = true)
    protected Integer idSucursalRemitente;
    @XmlElement(name = "CodigoCuentaRemitente", required = true, type = Integer.class, nillable = true)
    protected Integer codigoCuentaRemitente;
    @XmlElement(name = "NombreRemitente")
    protected String nombreRemitente;
    @XmlElement(name = "IDTipoIdentificacionRte", required = true, type = Integer.class, nillable = true)
    protected Integer idTipoIdentificacionRte;
    @XmlElement(name = "NumeroIdentificacionRte")
    protected String numeroIdentificacionRte;
    @XmlElement(name = "TelefonoRte")
    protected String telefonoRte;
    @XmlElement(name = "DireccionRte")
    protected String direccionRte;
    @XmlElement(name = "CodigoDaneOrigen")
    protected String codigoDaneOrigen;
    @XmlElement(name = "IDOrigen", required = true, type = Integer.class, nillable = true)
    protected Integer idOrigen;
    @XmlElement(name = "IDCDOrigen", required = true, type = Integer.class, nillable = true)
    protected Integer idcdOrigen;
    @XmlElement(name = "NombreDestinatario")
    protected String nombreDestinatario;
    @XmlElement(name = "IDTipoIdentificacionDrio", required = true, type = Integer.class, nillable = true)
    protected Integer idTipoIdentificacionDrio;
    @XmlElement(name = "NumeroIdentificacionDrio")
    protected String numeroIdentificacionDrio;
    @XmlElement(name = "TelefonoDrio")
    protected String telefonoDrio;
    @XmlElement(name = "DireccionDrio")
    protected String direccionDrio;
    @XmlElement(name = "CodigoDaneDestino")
    protected String codigoDaneDestino;
    @XmlElement(name = "IDDestino", required = true, type = Integer.class, nillable = true)
    protected Integer idDestino;
    @XmlElement(name = "BarrioDrio")
    protected String barrioDrio;
    @XmlElement(name = "IDCDDestino", required = true, type = Integer.class, nillable = true)
    protected Integer idcdDestino;
    @XmlElement(name = "TotalUnidades", required = true, type = Integer.class, nillable = true)
    protected Integer totalUnidades;
    @XmlElement(name = "TotalPeso", required = true, type = Double.class, nillable = true)
    protected Double totalPeso;
    @XmlElement(name = "TotalPesoFacturado", required = true, type = Double.class, nillable = true)
    protected Double totalPesoFacturado;
    @XmlElement(name = "TotalValorMercancia", required = true, type = Double.class, nillable = true)
    protected Double totalValorMercancia;
    @XmlElement(name = "TipoServicioTCC")
    protected String tipoServicioTCC;
    @XmlElement(name = "Comentarios")
    protected String comentarios;
    @XmlElement(name = "NumeroRemesa")
    protected String numeroRemesa;
    @XmlElement(name = "IDEstadoDespacho", required = true, type = Integer.class, nillable = true)
    protected Integer idEstadoDespacho;
    @XmlElement(name = "FechaHoraCreacion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCreacion;
    @XmlElement(name = "UsuarioCreacion")
    protected String usuarioCreacion;
    @XmlElement(name = "FechaHoraUltimaModificacion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraUltimaModificacion;
    @XmlElement(name = "UsuarioUltimaModificacion")
    protected String usuarioUltimaModificacion;
    @XmlElement(name = "ComentarioAnulacion")
    protected String comentarioAnulacion;
    @XmlElement(name = "FechaHoraAnulacion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraAnulacion;
    @XmlElement(name = "UsuarioAnulacion")
    protected String usuarioAnulacion;
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
    @XmlElement(name = "CentroCosto")
    protected String centroCosto;
    @XmlElement(name = "CiudadOrigen")
    protected String ciudadOrigen;
    @XmlElement(name = "DepartamentoOrigen")
    protected String departamentoOrigen;
    @XmlElement(name = "CiudadDestino")
    protected String ciudadDestino;
    @XmlElement(name = "DepartamentoDestino")
    protected String departamentoDestino;
    protected ArrayOfClsDespachoPaqueteriaDetalle detDespacho;

    /**
     * Gets the value of the idDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDespacho() {
        return idDespacho;
    }

    /**
     * Sets the value of the idDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDespacho(Integer value) {
        this.idDespacho = value;
    }

    /**
     * Gets the value of the codigoLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLote() {
        return codigoLote;
    }

    /**
     * Sets the value of the codigoLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLote(String value) {
        this.codigoLote = value;
    }

    /**
     * Gets the value of the fechaHoraLote property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraLote() {
        return fechaHoraLote;
    }

    /**
     * Sets the value of the fechaHoraLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraLote(XMLGregorianCalendar value) {
        this.fechaHoraLote = value;
    }

    /**
     * Gets the value of the fechaHoraRecepcion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraRecepcion() {
        return fechaHoraRecepcion;
    }

    /**
     * Sets the value of the fechaHoraRecepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraRecepcion(XMLGregorianCalendar value) {
        this.fechaHoraRecepcion = value;
    }

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
     * Gets the value of the idClienteRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDClienteRemitente() {
        return idClienteRemitente;
    }

    /**
     * Sets the value of the idClienteRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDClienteRemitente(Integer value) {
        this.idClienteRemitente = value;
    }

    /**
     * Gets the value of the idCiudadCliente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCiudadCliente() {
        return idCiudadCliente;
    }

    /**
     * Sets the value of the idCiudadCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCiudadCliente(Integer value) {
        this.idCiudadCliente = value;
    }

    /**
     * Gets the value of the idSucursalRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDSucursalRemitente() {
        return idSucursalRemitente;
    }

    /**
     * Sets the value of the idSucursalRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDSucursalRemitente(Integer value) {
        this.idSucursalRemitente = value;
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
     * Gets the value of the nombreRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRemitente() {
        return nombreRemitente;
    }

    /**
     * Sets the value of the nombreRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRemitente(String value) {
        this.nombreRemitente = value;
    }

    /**
     * Gets the value of the idTipoIdentificacionRte property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDTipoIdentificacionRte() {
        return idTipoIdentificacionRte;
    }

    /**
     * Sets the value of the idTipoIdentificacionRte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDTipoIdentificacionRte(Integer value) {
        this.idTipoIdentificacionRte = value;
    }

    /**
     * Gets the value of the numeroIdentificacionRte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionRte() {
        return numeroIdentificacionRte;
    }

    /**
     * Sets the value of the numeroIdentificacionRte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionRte(String value) {
        this.numeroIdentificacionRte = value;
    }

    /**
     * Gets the value of the telefonoRte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoRte() {
        return telefonoRte;
    }

    /**
     * Sets the value of the telefonoRte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoRte(String value) {
        this.telefonoRte = value;
    }

    /**
     * Gets the value of the direccionRte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionRte() {
        return direccionRte;
    }

    /**
     * Sets the value of the direccionRte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionRte(String value) {
        this.direccionRte = value;
    }

    /**
     * Gets the value of the codigoDaneOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDaneOrigen() {
        return codigoDaneOrigen;
    }

    /**
     * Sets the value of the codigoDaneOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDaneOrigen(String value) {
        this.codigoDaneOrigen = value;
    }

    /**
     * Gets the value of the idOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDOrigen() {
        return idOrigen;
    }

    /**
     * Sets the value of the idOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDOrigen(Integer value) {
        this.idOrigen = value;
    }

    /**
     * Gets the value of the idcdOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCDOrigen() {
        return idcdOrigen;
    }

    /**
     * Sets the value of the idcdOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCDOrigen(Integer value) {
        this.idcdOrigen = value;
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
     * Gets the value of the idTipoIdentificacionDrio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDTipoIdentificacionDrio() {
        return idTipoIdentificacionDrio;
    }

    /**
     * Sets the value of the idTipoIdentificacionDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDTipoIdentificacionDrio(Integer value) {
        this.idTipoIdentificacionDrio = value;
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
     * Gets the value of the codigoDaneDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDaneDestino() {
        return codigoDaneDestino;
    }

    /**
     * Sets the value of the codigoDaneDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDaneDestino(String value) {
        this.codigoDaneDestino = value;
    }

    /**
     * Gets the value of the idDestino property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDestino() {
        return idDestino;
    }

    /**
     * Sets the value of the idDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDestino(Integer value) {
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
     * Gets the value of the idcdDestino property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCDDestino() {
        return idcdDestino;
    }

    /**
     * Sets the value of the idcdDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCDDestino(Integer value) {
        this.idcdDestino = value;
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
     * Gets the value of the totalPesoFacturado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPesoFacturado() {
        return totalPesoFacturado;
    }

    /**
     * Sets the value of the totalPesoFacturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPesoFacturado(Double value) {
        this.totalPesoFacturado = value;
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
     * Gets the value of the idEstadoDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDEstadoDespacho() {
        return idEstadoDespacho;
    }

    /**
     * Sets the value of the idEstadoDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDEstadoDespacho(Integer value) {
        this.idEstadoDespacho = value;
    }

    /**
     * Gets the value of the fechaHoraCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * Sets the value of the fechaHoraCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCreacion(XMLGregorianCalendar value) {
        this.fechaHoraCreacion = value;
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
     * Gets the value of the fechaHoraUltimaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraUltimaModificacion() {
        return fechaHoraUltimaModificacion;
    }

    /**
     * Sets the value of the fechaHoraUltimaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraUltimaModificacion(XMLGregorianCalendar value) {
        this.fechaHoraUltimaModificacion = value;
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
     * Gets the value of the comentarioAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioAnulacion() {
        return comentarioAnulacion;
    }

    /**
     * Sets the value of the comentarioAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioAnulacion(String value) {
        this.comentarioAnulacion = value;
    }

    /**
     * Gets the value of the fechaHoraAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraAnulacion() {
        return fechaHoraAnulacion;
    }

    /**
     * Sets the value of the fechaHoraAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraAnulacion(XMLGregorianCalendar value) {
        this.fechaHoraAnulacion = value;
    }

    /**
     * Gets the value of the usuarioAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioAnulacion() {
        return usuarioAnulacion;
    }

    /**
     * Sets the value of the usuarioAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioAnulacion(String value) {
        this.usuarioAnulacion = value;
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
     * Gets the value of the centroCosto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCosto() {
        return centroCosto;
    }

    /**
     * Sets the value of the centroCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCosto(String value) {
        this.centroCosto = value;
    }

    /**
     * Gets the value of the ciudadOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * Sets the value of the ciudadOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigen(String value) {
        this.ciudadOrigen = value;
    }

    /**
     * Gets the value of the departamentoOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoOrigen() {
        return departamentoOrigen;
    }

    /**
     * Sets the value of the departamentoOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoOrigen(String value) {
        this.departamentoOrigen = value;
    }

    /**
     * Gets the value of the ciudadDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * Sets the value of the ciudadDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestino(String value) {
        this.ciudadDestino = value;
    }

    /**
     * Gets the value of the departamentoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    /**
     * Sets the value of the departamentoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoDestino(String value) {
        this.departamentoDestino = value;
    }

    /**
     * Gets the value of the detDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsDespachoPaqueteriaDetalle }
     *     
     */
    public ArrayOfClsDespachoPaqueteriaDetalle getDetDespacho() {
        return detDespacho;
    }

    /**
     * Sets the value of the detDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsDespachoPaqueteriaDetalle }
     *     
     */
    public void setDetDespacho(ArrayOfClsDespachoPaqueteriaDetalle value) {
        this.detDespacho = value;
    }

}
