
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsDespachoPaqueteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsDespachoPaqueteria2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="CiudadOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartamentoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTipoIdentificacionDrio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroIdentificacionDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPostalDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDaneDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartamentoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorreoElectronicoDrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPeso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalVolumen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalValorMercancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoServicioTCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaDespacho" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodigoLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaDocumentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantDocumentosDevolver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CantDocumentosEntregar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EsEntregaBodega" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CentroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detDespacho" type="{http://clientes.tcc.com.co/}ArrayOfClsDespachoPaqueteria2_Detalle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsDespachoPaqueteria2", propOrder = {
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
    "ciudadOrigen",
    "departamentoOrigen",
    "nombreDestinatario",
    "idTipoIdentificacionDrio",
    "numeroIdentificacionDrio",
    "telefonoDrio",
    "direccionDrio",
    "codigoPostalDrio",
    "codigoDaneDestino",
    "ciudadDestino",
    "departamentoDestino",
    "codigoDestinatario",
    "correoElectronicoDrio",
    "totalUnidades",
    "totalPeso",
    "totalVolumen",
    "totalValorMercancia",
    "comentarios",
    "numeroRemesa",
    "tipoServicioTCC",
    "fechaDespacho",
    "codigoLote",
    "fechaLote",
    "usuarioCreacion",
    "tipoDocumentoReferencia",
    "numeroDocumentoReferencia",
    "fechaDocumentoReferencia",
    "cantDocumentosDevolver",
    "cantDocumentosEntregar",
    "esEntregaBodega",
    "centroCosto",
    "detDespacho"
})
public class ClsDespachoPaqueteria2 {

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
    @XmlElement(name = "CiudadOrigen")
    protected String ciudadOrigen;
    @XmlElement(name = "DepartamentoOrigen")
    protected String departamentoOrigen;
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
    @XmlElement(name = "CodigoPostalDrio")
    protected String codigoPostalDrio;
    @XmlElement(name = "CodigoDaneDestino")
    protected String codigoDaneDestino;
    @XmlElement(name = "CiudadDestino")
    protected String ciudadDestino;
    @XmlElement(name = "DepartamentoDestino")
    protected String departamentoDestino;
    @XmlElement(name = "CodigoDestinatario")
    protected String codigoDestinatario;
    @XmlElement(name = "CorreoElectronicoDrio")
    protected String correoElectronicoDrio;
    @XmlElement(name = "TotalUnidades", required = true, type = Integer.class, nillable = true)
    protected Integer totalUnidades;
    @XmlElement(name = "TotalPeso", required = true, type = Double.class, nillable = true)
    protected Double totalPeso;
    @XmlElement(name = "TotalVolumen", required = true, type = Double.class, nillable = true)
    protected Double totalVolumen;
    @XmlElement(name = "TotalValorMercancia", required = true, type = Double.class, nillable = true)
    protected Double totalValorMercancia;
    @XmlElement(name = "Comentarios")
    protected String comentarios;
    @XmlElement(name = "NumeroRemesa")
    protected String numeroRemesa;
    @XmlElement(name = "TipoServicioTCC")
    protected String tipoServicioTCC;
    @XmlElement(name = "FechaDespacho", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespacho;
    @XmlElement(name = "CodigoLote")
    protected String codigoLote;
    @XmlElement(name = "FechaLote")
    protected String fechaLote;
    @XmlElement(name = "UsuarioCreacion")
    protected String usuarioCreacion;
    @XmlElement(name = "TipoDocumentoReferencia")
    protected String tipoDocumentoReferencia;
    @XmlElement(name = "NumeroDocumentoReferencia")
    protected String numeroDocumentoReferencia;
    @XmlElement(name = "FechaDocumentoReferencia")
    protected String fechaDocumentoReferencia;
    @XmlElement(name = "CantDocumentosDevolver", required = true, type = Integer.class, nillable = true)
    protected Integer cantDocumentosDevolver;
    @XmlElement(name = "CantDocumentosEntregar", required = true, type = Integer.class, nillable = true)
    protected Integer cantDocumentosEntregar;
    @XmlElement(name = "EsEntregaBodega", required = true, type = Boolean.class, nillable = true)
    protected Boolean esEntregaBodega;
    @XmlElement(name = "CentroCosto")
    protected String centroCosto;
    protected ArrayOfClsDespachoPaqueteria2Detalle detDespacho;

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
     * Gets the value of the codigoPostalDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostalDrio() {
        return codigoPostalDrio;
    }

    /**
     * Sets the value of the codigoPostalDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostalDrio(String value) {
        this.codigoPostalDrio = value;
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
     * Gets the value of the codigoDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDestinatario() {
        return codigoDestinatario;
    }

    /**
     * Sets the value of the codigoDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDestinatario(String value) {
        this.codigoDestinatario = value;
    }

    /**
     * Gets the value of the correoElectronicoDrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronicoDrio() {
        return correoElectronicoDrio;
    }

    /**
     * Sets the value of the correoElectronicoDrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronicoDrio(String value) {
        this.correoElectronicoDrio = value;
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
     * Gets the value of the totalVolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalVolumen() {
        return totalVolumen;
    }

    /**
     * Sets the value of the totalVolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalVolumen(Double value) {
        this.totalVolumen = value;
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
     * Gets the value of the fechaLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaLote() {
        return fechaLote;
    }

    /**
     * Sets the value of the fechaLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaLote(String value) {
        this.fechaLote = value;
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
     *     {@link String }
     *     
     */
    public String getFechaDocumentoReferencia() {
        return fechaDocumentoReferencia;
    }

    /**
     * Sets the value of the fechaDocumentoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDocumentoReferencia(String value) {
        this.fechaDocumentoReferencia = value;
    }

    /**
     * Gets the value of the cantDocumentosDevolver property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantDocumentosDevolver() {
        return cantDocumentosDevolver;
    }

    /**
     * Sets the value of the cantDocumentosDevolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantDocumentosDevolver(Integer value) {
        this.cantDocumentosDevolver = value;
    }

    /**
     * Gets the value of the cantDocumentosEntregar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantDocumentosEntregar() {
        return cantDocumentosEntregar;
    }

    /**
     * Sets the value of the cantDocumentosEntregar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantDocumentosEntregar(Integer value) {
        this.cantDocumentosEntregar = value;
    }

    /**
     * Gets the value of the esEntregaBodega property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsEntregaBodega() {
        return esEntregaBodega;
    }

    /**
     * Sets the value of the esEntregaBodega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsEntregaBodega(Boolean value) {
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
     * Gets the value of the detDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsDespachoPaqueteria2Detalle }
     *     
     */
    public ArrayOfClsDespachoPaqueteria2Detalle getDetDespacho() {
        return detDespacho;
    }

    /**
     * Sets the value of the detDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsDespachoPaqueteria2Detalle }
     *     
     */
    public void setDetDespacho(ArrayOfClsDespachoPaqueteria2Detalle value) {
        this.detDespacho = value;
    }

}
