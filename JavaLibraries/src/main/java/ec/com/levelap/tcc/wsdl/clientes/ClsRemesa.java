
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsRemesa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsRemesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaReporte" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NroRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaRemesa" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodOrigen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuentaCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaNovedad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Novedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsRelacionEnvio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="URLImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TieneImagen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TieneNovedad" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsRemesa", propOrder = {
    "fechaReporte",
    "nroRemesa",
    "fechaRemesa",
    "origen",
    "codOrigen",
    "destino",
    "codDestino",
    "estado",
    "cuentaCliente",
    "codNovedad",
    "fechaNovedad",
    "novedad",
    "estadoNovedad",
    "tipoDocumento",
    "numeroDocumento",
    "esRelacionEnvio",
    "urlImagen",
    "tieneImagen",
    "tieneNovedad"
})
public class ClsRemesa {

    @XmlElement(name = "FechaReporte", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaReporte;
    @XmlElement(name = "NroRemesa")
    protected String nroRemesa;
    @XmlElement(name = "FechaRemesa", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRemesa;
    @XmlElement(name = "Origen")
    protected String origen;
    @XmlElement(name = "CodOrigen")
    protected int codOrigen;
    @XmlElement(name = "Destino")
    protected String destino;
    @XmlElement(name = "CodDestino")
    protected int codDestino;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "CuentaCliente")
    protected int cuentaCliente;
    @XmlElement(name = "CodNovedad")
    protected String codNovedad;
    @XmlElement(name = "FechaNovedad", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNovedad;
    @XmlElement(name = "Novedad")
    protected String novedad;
    @XmlElement(name = "EstadoNovedad")
    protected String estadoNovedad;
    @XmlElement(name = "TipoDocumento")
    protected String tipoDocumento;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;
    @XmlElement(name = "EsRelacionEnvio")
    protected boolean esRelacionEnvio;
    @XmlElement(name = "URLImagen")
    protected String urlImagen;
    @XmlElement(name = "TieneImagen")
    protected boolean tieneImagen;
    @XmlElement(name = "TieneNovedad")
    protected boolean tieneNovedad;

    /**
     * Gets the value of the fechaReporte property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaReporte() {
        return fechaReporte;
    }

    /**
     * Sets the value of the fechaReporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaReporte(XMLGregorianCalendar value) {
        this.fechaReporte = value;
    }

    /**
     * Gets the value of the nroRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroRemesa() {
        return nroRemesa;
    }

    /**
     * Sets the value of the nroRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroRemesa(String value) {
        this.nroRemesa = value;
    }

    /**
     * Gets the value of the fechaRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRemesa() {
        return fechaRemesa;
    }

    /**
     * Sets the value of the fechaRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRemesa(XMLGregorianCalendar value) {
        this.fechaRemesa = value;
    }

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the codOrigen property.
     * 
     */
    public int getCodOrigen() {
        return codOrigen;
    }

    /**
     * Sets the value of the codOrigen property.
     * 
     */
    public void setCodOrigen(int value) {
        this.codOrigen = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Gets the value of the codDestino property.
     * 
     */
    public int getCodDestino() {
        return codDestino;
    }

    /**
     * Sets the value of the codDestino property.
     * 
     */
    public void setCodDestino(int value) {
        this.codDestino = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the cuentaCliente property.
     * 
     */
    public int getCuentaCliente() {
        return cuentaCliente;
    }

    /**
     * Sets the value of the cuentaCliente property.
     * 
     */
    public void setCuentaCliente(int value) {
        this.cuentaCliente = value;
    }

    /**
     * Gets the value of the codNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNovedad() {
        return codNovedad;
    }

    /**
     * Sets the value of the codNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNovedad(String value) {
        this.codNovedad = value;
    }

    /**
     * Gets the value of the fechaNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNovedad() {
        return fechaNovedad;
    }

    /**
     * Sets the value of the fechaNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNovedad(XMLGregorianCalendar value) {
        this.fechaNovedad = value;
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
     * Gets the value of the estadoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNovedad() {
        return estadoNovedad;
    }

    /**
     * Sets the value of the estadoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNovedad(String value) {
        this.estadoNovedad = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the esRelacionEnvio property.
     * 
     */
    public boolean isEsRelacionEnvio() {
        return esRelacionEnvio;
    }

    /**
     * Sets the value of the esRelacionEnvio property.
     * 
     */
    public void setEsRelacionEnvio(boolean value) {
        this.esRelacionEnvio = value;
    }

    /**
     * Gets the value of the urlImagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLImagen() {
        return urlImagen;
    }

    /**
     * Sets the value of the urlImagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLImagen(String value) {
        this.urlImagen = value;
    }

    /**
     * Gets the value of the tieneImagen property.
     * 
     */
    public boolean isTieneImagen() {
        return tieneImagen;
    }

    /**
     * Sets the value of the tieneImagen property.
     * 
     */
    public void setTieneImagen(boolean value) {
        this.tieneImagen = value;
    }

    /**
     * Gets the value of the tieneNovedad property.
     * 
     */
    public boolean isTieneNovedad() {
        return tieneNovedad;
    }

    /**
     * Sets the value of the tieneNovedad property.
     * 
     */
    public void setTieneNovedad(boolean value) {
        this.tieneNovedad = value;
    }

}
