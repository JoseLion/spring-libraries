
package ec.com.levelap.tcc.entity.wsDespachos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpGrabarRemesaCompleta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpGrabarRemesaCompleta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codigolote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fechahoralote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numeroremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numeroDepacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="unidadnegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fechadespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cuentaremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sederemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="primernombreremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="segundonombreremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="primerapellidoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="segundoapellidoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="razonsocialremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="naturalezaremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoidentificacionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="identificacionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="telefonoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="direccionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ciudadorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoidentificaciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="identificaciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sededestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="primernombredestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="segundonombredestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="primerapellidodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="segundoapellidodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="razonsocialdestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="naturalezadestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="direcciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="telefonodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ciudaddestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="barriodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="totalpeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="totalpesovolumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="totalvalormercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="formapago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="llevabodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="recogebodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="centrocostos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="totalvalorproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="unidad" type="{http://www.tcc.com.co/xsd}tpUnidad" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="documentoreferencia" type="{http://www.tcc.com.co/xsd}tpDocumentoReferencia" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numeroReferenciaCliente" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="generarDocumentos" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="tiposervicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpGrabarRemesaCompleta", namespace = "http://www.tcc.com.co/xsd", propOrder = {
    "clave",
    "codigolote",
    "fechahoralote",
    "numeroremesa",
    "numeroDepacho",
    "unidadnegocio",
    "fechadespacho",
    "cuentaremitente",
    "sederemitente",
    "primernombreremitente",
    "segundonombreremitente",
    "primerapellidoremitente",
    "segundoapellidoremitente",
    "razonsocialremitente",
    "naturalezaremitente",
    "tipoidentificacionremitente",
    "identificacionremitente",
    "telefonoremitente",
    "direccionremitente",
    "ciudadorigen",
    "tipoidentificaciondestinatario",
    "identificaciondestinatario",
    "sededestinatario",
    "primernombredestinatario",
    "segundonombredestinatario",
    "primerapellidodestinatario",
    "segundoapellidodestinatario",
    "razonsocialdestinatario",
    "naturalezadestinatario",
    "direcciondestinatario",
    "telefonodestinatario",
    "ciudaddestinatario",
    "barriodestinatario",
    "totalpeso",
    "totalpesovolumen",
    "totalvalormercancia",
    "formapago",
    "observaciones",
    "llevabodega",
    "recogebodega",
    "centrocostos",
    "totalvalorproducto",
    "unidad",
    "documentoreferencia",
    "numeroReferenciaCliente",
    "fuente",
    "generarDocumentos",
    "tiposervicio"
})
public class TpGrabarRemesaCompleta {

    @XmlElement(namespace = "")
    protected String clave;
    @XmlElement(namespace = "")
    protected String codigolote;
    @XmlElement(namespace = "")
    protected String fechahoralote;
    @XmlElement(namespace = "")
    protected String numeroremesa;
    @XmlElement(namespace = "")
    protected String numeroDepacho;
    @XmlElement(namespace = "")
    protected String unidadnegocio;
    @XmlElement(namespace = "")
    protected String fechadespacho;
    @XmlElement(namespace = "")
    protected String cuentaremitente;
    @XmlElement(namespace = "")
    protected String sederemitente;
    @XmlElement(namespace = "")
    protected String primernombreremitente;
    @XmlElement(namespace = "")
    protected String segundonombreremitente;
    @XmlElement(namespace = "")
    protected String primerapellidoremitente;
    @XmlElement(namespace = "")
    protected String segundoapellidoremitente;
    @XmlElement(namespace = "")
    protected String razonsocialremitente;
    @XmlElement(namespace = "")
    protected String naturalezaremitente;
    @XmlElement(namespace = "")
    protected String tipoidentificacionremitente;
    @XmlElement(namespace = "")
    protected String identificacionremitente;
    @XmlElement(namespace = "")
    protected String telefonoremitente;
    @XmlElement(namespace = "")
    protected String direccionremitente;
    @XmlElement(namespace = "")
    protected String ciudadorigen;
    @XmlElement(namespace = "")
    protected String tipoidentificaciondestinatario;
    @XmlElement(namespace = "")
    protected String identificaciondestinatario;
    @XmlElement(namespace = "")
    protected String sededestinatario;
    @XmlElement(namespace = "")
    protected String primernombredestinatario;
    @XmlElement(namespace = "")
    protected String segundonombredestinatario;
    @XmlElement(namespace = "")
    protected String primerapellidodestinatario;
    @XmlElement(namespace = "")
    protected String segundoapellidodestinatario;
    @XmlElement(namespace = "")
    protected String razonsocialdestinatario;
    @XmlElement(namespace = "")
    protected String naturalezadestinatario;
    @XmlElement(namespace = "")
    protected String direcciondestinatario;
    @XmlElement(namespace = "")
    protected String telefonodestinatario;
    @XmlElement(namespace = "")
    protected String ciudaddestinatario;
    @XmlElement(namespace = "")
    protected String barriodestinatario;
    @XmlElement(namespace = "")
    protected String totalpeso;
    @XmlElement(namespace = "")
    protected String totalpesovolumen;
    @XmlElement(namespace = "")
    protected String totalvalormercancia;
    @XmlElement(namespace = "")
    protected String formapago;
    @XmlElement(namespace = "")
    protected String observaciones;
    @XmlElement(namespace = "")
    protected String llevabodega;
    @XmlElement(namespace = "")
    protected String recogebodega;
    @XmlElement(namespace = "")
    protected String centrocostos;
    @XmlElement(namespace = "")
    protected String totalvalorproducto;
    @XmlElement(namespace = "")
    protected List<TpUnidad> unidad;
    @XmlElement(namespace = "", nillable = true)
    protected List<TpDocumentoReferencia> documentoreferencia;
    @XmlElement(namespace = "", required = true, nillable = true)
    protected String numeroReferenciaCliente;
    @XmlElement(namespace = "")
    protected String fuente;
    @XmlElement(namespace = "")
    protected boolean generarDocumentos;
    @XmlElement(namespace = "")
    protected String tiposervicio;

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Gets the value of the codigolote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigolote() {
        return codigolote;
    }

    /**
     * Sets the value of the codigolote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigolote(String value) {
        this.codigolote = value;
    }

    /**
     * Gets the value of the fechahoralote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechahoralote() {
        return fechahoralote;
    }

    /**
     * Sets the value of the fechahoralote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechahoralote(String value) {
        this.fechahoralote = value;
    }

    /**
     * Gets the value of the numeroremesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroremesa() {
        return numeroremesa;
    }

    /**
     * Sets the value of the numeroremesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroremesa(String value) {
        this.numeroremesa = value;
    }

    /**
     * Gets the value of the numeroDepacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDepacho() {
        return numeroDepacho;
    }

    /**
     * Sets the value of the numeroDepacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDepacho(String value) {
        this.numeroDepacho = value;
    }

    /**
     * Gets the value of the unidadnegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadnegocio() {
        return unidadnegocio;
    }

    /**
     * Sets the value of the unidadnegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadnegocio(String value) {
        this.unidadnegocio = value;
    }

    /**
     * Gets the value of the fechadespacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechadespacho() {
        return fechadespacho;
    }

    /**
     * Sets the value of the fechadespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechadespacho(String value) {
        this.fechadespacho = value;
    }

    /**
     * Gets the value of the cuentaremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaremitente() {
        return cuentaremitente;
    }

    /**
     * Sets the value of the cuentaremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaremitente(String value) {
        this.cuentaremitente = value;
    }

    /**
     * Gets the value of the sederemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSederemitente() {
        return sederemitente;
    }

    /**
     * Sets the value of the sederemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSederemitente(String value) {
        this.sederemitente = value;
    }

    /**
     * Gets the value of the primernombreremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimernombreremitente() {
        return primernombreremitente;
    }

    /**
     * Sets the value of the primernombreremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimernombreremitente(String value) {
        this.primernombreremitente = value;
    }

    /**
     * Gets the value of the segundonombreremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundonombreremitente() {
        return segundonombreremitente;
    }

    /**
     * Sets the value of the segundonombreremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundonombreremitente(String value) {
        this.segundonombreremitente = value;
    }

    /**
     * Gets the value of the primerapellidoremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerapellidoremitente() {
        return primerapellidoremitente;
    }

    /**
     * Sets the value of the primerapellidoremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerapellidoremitente(String value) {
        this.primerapellidoremitente = value;
    }

    /**
     * Gets the value of the segundoapellidoremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoapellidoremitente() {
        return segundoapellidoremitente;
    }

    /**
     * Sets the value of the segundoapellidoremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoapellidoremitente(String value) {
        this.segundoapellidoremitente = value;
    }

    /**
     * Gets the value of the razonsocialremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocialremitente() {
        return razonsocialremitente;
    }

    /**
     * Sets the value of the razonsocialremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocialremitente(String value) {
        this.razonsocialremitente = value;
    }

    /**
     * Gets the value of the naturalezaremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaremitente() {
        return naturalezaremitente;
    }

    /**
     * Sets the value of the naturalezaremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaremitente(String value) {
        this.naturalezaremitente = value;
    }

    /**
     * Gets the value of the tipoidentificacionremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoidentificacionremitente() {
        return tipoidentificacionremitente;
    }

    /**
     * Sets the value of the tipoidentificacionremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoidentificacionremitente(String value) {
        this.tipoidentificacionremitente = value;
    }

    /**
     * Gets the value of the identificacionremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionremitente() {
        return identificacionremitente;
    }

    /**
     * Sets the value of the identificacionremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionremitente(String value) {
        this.identificacionremitente = value;
    }

    /**
     * Gets the value of the telefonoremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoremitente() {
        return telefonoremitente;
    }

    /**
     * Sets the value of the telefonoremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoremitente(String value) {
        this.telefonoremitente = value;
    }

    /**
     * Gets the value of the direccionremitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionremitente() {
        return direccionremitente;
    }

    /**
     * Sets the value of the direccionremitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionremitente(String value) {
        this.direccionremitente = value;
    }

    /**
     * Gets the value of the ciudadorigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadorigen() {
        return ciudadorigen;
    }

    /**
     * Sets the value of the ciudadorigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadorigen(String value) {
        this.ciudadorigen = value;
    }

    /**
     * Gets the value of the tipoidentificaciondestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoidentificaciondestinatario() {
        return tipoidentificaciondestinatario;
    }

    /**
     * Sets the value of the tipoidentificaciondestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoidentificaciondestinatario(String value) {
        this.tipoidentificaciondestinatario = value;
    }

    /**
     * Gets the value of the identificaciondestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificaciondestinatario() {
        return identificaciondestinatario;
    }

    /**
     * Sets the value of the identificaciondestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificaciondestinatario(String value) {
        this.identificaciondestinatario = value;
    }

    /**
     * Gets the value of the sededestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSededestinatario() {
        return sededestinatario;
    }

    /**
     * Sets the value of the sededestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSededestinatario(String value) {
        this.sededestinatario = value;
    }

    /**
     * Gets the value of the primernombredestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimernombredestinatario() {
        return primernombredestinatario;
    }

    /**
     * Sets the value of the primernombredestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimernombredestinatario(String value) {
        this.primernombredestinatario = value;
    }

    /**
     * Gets the value of the segundonombredestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundonombredestinatario() {
        return segundonombredestinatario;
    }

    /**
     * Sets the value of the segundonombredestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundonombredestinatario(String value) {
        this.segundonombredestinatario = value;
    }

    /**
     * Gets the value of the primerapellidodestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerapellidodestinatario() {
        return primerapellidodestinatario;
    }

    /**
     * Sets the value of the primerapellidodestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerapellidodestinatario(String value) {
        this.primerapellidodestinatario = value;
    }

    /**
     * Gets the value of the segundoapellidodestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoapellidodestinatario() {
        return segundoapellidodestinatario;
    }

    /**
     * Sets the value of the segundoapellidodestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoapellidodestinatario(String value) {
        this.segundoapellidodestinatario = value;
    }

    /**
     * Gets the value of the razonsocialdestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocialdestinatario() {
        return razonsocialdestinatario;
    }

    /**
     * Sets the value of the razonsocialdestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocialdestinatario(String value) {
        this.razonsocialdestinatario = value;
    }

    /**
     * Gets the value of the naturalezadestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezadestinatario() {
        return naturalezadestinatario;
    }

    /**
     * Sets the value of the naturalezadestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezadestinatario(String value) {
        this.naturalezadestinatario = value;
    }

    /**
     * Gets the value of the direcciondestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirecciondestinatario() {
        return direcciondestinatario;
    }

    /**
     * Sets the value of the direcciondestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirecciondestinatario(String value) {
        this.direcciondestinatario = value;
    }

    /**
     * Gets the value of the telefonodestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonodestinatario() {
        return telefonodestinatario;
    }

    /**
     * Sets the value of the telefonodestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonodestinatario(String value) {
        this.telefonodestinatario = value;
    }

    /**
     * Gets the value of the ciudaddestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudaddestinatario() {
        return ciudaddestinatario;
    }

    /**
     * Sets the value of the ciudaddestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudaddestinatario(String value) {
        this.ciudaddestinatario = value;
    }

    /**
     * Gets the value of the barriodestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarriodestinatario() {
        return barriodestinatario;
    }

    /**
     * Sets the value of the barriodestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarriodestinatario(String value) {
        this.barriodestinatario = value;
    }

    /**
     * Gets the value of the totalpeso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalpeso() {
        return totalpeso;
    }

    /**
     * Sets the value of the totalpeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalpeso(String value) {
        this.totalpeso = value;
    }

    /**
     * Gets the value of the totalpesovolumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalpesovolumen() {
        return totalpesovolumen;
    }

    /**
     * Sets the value of the totalpesovolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalpesovolumen(String value) {
        this.totalpesovolumen = value;
    }

    /**
     * Gets the value of the totalvalormercancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalvalormercancia() {
        return totalvalormercancia;
    }

    /**
     * Sets the value of the totalvalormercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalvalormercancia(String value) {
        this.totalvalormercancia = value;
    }

    /**
     * Gets the value of the formapago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormapago() {
        return formapago;
    }

    /**
     * Sets the value of the formapago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormapago(String value) {
        this.formapago = value;
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
     * Gets the value of the llevabodega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlevabodega() {
        return llevabodega;
    }

    /**
     * Sets the value of the llevabodega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlevabodega(String value) {
        this.llevabodega = value;
    }

    /**
     * Gets the value of the recogebodega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecogebodega() {
        return recogebodega;
    }

    /**
     * Sets the value of the recogebodega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecogebodega(String value) {
        this.recogebodega = value;
    }

    /**
     * Gets the value of the centrocostos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentrocostos() {
        return centrocostos;
    }

    /**
     * Sets the value of the centrocostos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentrocostos(String value) {
        this.centrocostos = value;
    }

    /**
     * Gets the value of the totalvalorproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalvalorproducto() {
        return totalvalorproducto;
    }

    /**
     * Sets the value of the totalvalorproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalvalorproducto(String value) {
        this.totalvalorproducto = value;
    }

    /**
     * Gets the value of the unidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpUnidad }
     * 
     * 
     */
    public List<TpUnidad> getUnidad() {
        if (unidad == null) {
            unidad = new ArrayList<TpUnidad>();
        }
        return this.unidad;
    }

    /**
     * Gets the value of the documentoreferencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoreferencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoreferencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpDocumentoReferencia }
     * 
     * 
     */
    public List<TpDocumentoReferencia> getDocumentoreferencia() {
        if (documentoreferencia == null) {
            documentoreferencia = new ArrayList<TpDocumentoReferencia>();
        }
        return this.documentoreferencia;
    }

    /**
     * Gets the value of the numeroReferenciaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroReferenciaCliente() {
        return numeroReferenciaCliente;
    }

    /**
     * Sets the value of the numeroReferenciaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroReferenciaCliente(String value) {
        this.numeroReferenciaCliente = value;
    }

    /**
     * Gets the value of the fuente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuente() {
        return fuente;
    }

    /**
     * Sets the value of the fuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuente(String value) {
        this.fuente = value;
    }

    /**
     * Gets the value of the generarDocumentos property.
     * 
     */
    public boolean isGenerarDocumentos() {
        return generarDocumentos;
    }

    /**
     * Sets the value of the generarDocumentos property.
     * 
     */
    public void setGenerarDocumentos(boolean value) {
        this.generarDocumentos = value;
    }

    /**
     * Gets the value of the tiposervicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiposervicio() {
        return tiposervicio;
    }

    /**
     * Sets the value of the tiposervicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiposervicio(String value) {
        this.tiposervicio = value;
    }

}
