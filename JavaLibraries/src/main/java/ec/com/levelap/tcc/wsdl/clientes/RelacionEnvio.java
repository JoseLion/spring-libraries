
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelacionEnvio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelacionEnvio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numerodespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechadespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solicitudrecogida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadnegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuentaremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sederemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primernombreremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundonombreremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerapellidoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoapellidoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonsocialremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturalezaremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoidentificacionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatarios" type="{http://clientes.tcc.com.co/}ArrayOfDestinatario" minOccurs="0"/>
 *         &lt;element name="notificadespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelacionEnvio", propOrder = {
    "clave",
    "numerodespacho",
    "fechadespacho",
    "solicitudrecogida",
    "unidadnegocio",
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
    "destinatarios",
    "notificadespacho"
})
public class RelacionEnvio {

    protected String clave;
    protected String numerodespacho;
    protected String fechadespacho;
    protected String solicitudrecogida;
    protected String unidadnegocio;
    protected String cuentaremitente;
    protected String sederemitente;
    protected String primernombreremitente;
    protected String segundonombreremitente;
    protected String primerapellidoremitente;
    protected String segundoapellidoremitente;
    protected String razonsocialremitente;
    protected String naturalezaremitente;
    protected String tipoidentificacionremitente;
    protected String identificacionremitente;
    protected String telefonoremitente;
    protected String direccionremitente;
    protected String ciudadorigen;
    protected ArrayOfDestinatario destinatarios;
    protected String notificadespacho;

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
     * Gets the value of the numerodespacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerodespacho() {
        return numerodespacho;
    }

    /**
     * Sets the value of the numerodespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerodespacho(String value) {
        this.numerodespacho = value;
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
     * Gets the value of the solicitudrecogida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitudrecogida() {
        return solicitudrecogida;
    }

    /**
     * Sets the value of the solicitudrecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitudrecogida(String value) {
        this.solicitudrecogida = value;
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
     * Gets the value of the destinatarios property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatario }
     *     
     */
    public ArrayOfDestinatario getDestinatarios() {
        return destinatarios;
    }

    /**
     * Sets the value of the destinatarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatario }
     *     
     */
    public void setDestinatarios(ArrayOfDestinatario value) {
        this.destinatarios = value;
    }

    /**
     * Gets the value of the notificadespacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificadespacho() {
        return notificadespacho;
    }

    /**
     * Sets the value of the notificadespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificadespacho(String value) {
        this.notificadespacho = value;
    }

}
