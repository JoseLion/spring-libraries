
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for destinatario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="destinatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerocontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroreferenciacliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoidentificaciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificaciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sededestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primernombredestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundonombredestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerapellidodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoapellidodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonsocialdestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturalezadestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudaddestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="barriodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalpeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalpesovolumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalvalormercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalvalorproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formapago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llevabodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recogebodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centrocostos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiposervicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidades" type="{http://clientes.tcc.com.co/}ArrayOfUnidad" minOccurs="0"/>
 *         &lt;element name="documentos" type="{http://clientes.tcc.com.co/}ArrayOfDocumento" minOccurs="0"/>
 *         &lt;element name="notificaremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificarotulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinatario", propOrder = {
    "numerocontrol",
    "numeroremesa",
    "numeroreferenciacliente",
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
    "totalvalorproducto",
    "formapago",
    "llevabodega",
    "recogebodega",
    "centrocostos",
    "tiposervicio",
    "observaciones",
    "unidades",
    "documentos",
    "notificaremesa",
    "notificarotulo"
})
public class Destinatario {

    protected String numerocontrol;
    protected String numeroremesa;
    protected String numeroreferenciacliente;
    protected String tipoidentificaciondestinatario;
    protected String identificaciondestinatario;
    protected String sededestinatario;
    protected String primernombredestinatario;
    protected String segundonombredestinatario;
    protected String primerapellidodestinatario;
    protected String segundoapellidodestinatario;
    protected String razonsocialdestinatario;
    protected String naturalezadestinatario;
    protected String direcciondestinatario;
    protected String telefonodestinatario;
    protected String ciudaddestinatario;
    protected String barriodestinatario;
    protected String totalpeso;
    protected String totalpesovolumen;
    protected String totalvalormercancia;
    protected String totalvalorproducto;
    protected String formapago;
    protected String llevabodega;
    protected String recogebodega;
    protected String centrocostos;
    protected String tiposervicio;
    protected String observaciones;
    protected ArrayOfUnidad unidades;
    protected ArrayOfDocumento documentos;
    protected String notificaremesa;
    protected String notificarotulo;

    /**
     * Gets the value of the numerocontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerocontrol() {
        return numerocontrol;
    }

    /**
     * Sets the value of the numerocontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerocontrol(String value) {
        this.numerocontrol = value;
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
     * Gets the value of the numeroreferenciacliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroreferenciacliente() {
        return numeroreferenciacliente;
    }

    /**
     * Sets the value of the numeroreferenciacliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroreferenciacliente(String value) {
        this.numeroreferenciacliente = value;
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
     * Gets the value of the unidades property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidad }
     *     
     */
    public ArrayOfUnidad getUnidades() {
        return unidades;
    }

    /**
     * Sets the value of the unidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidad }
     *     
     */
    public void setUnidades(ArrayOfUnidad value) {
        this.unidades = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumento }
     *     
     */
    public ArrayOfDocumento getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumento }
     *     
     */
    public void setDocumentos(ArrayOfDocumento value) {
        this.documentos = value;
    }

    /**
     * Gets the value of the notificaremesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificaremesa() {
        return notificaremesa;
    }

    /**
     * Sets the value of the notificaremesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificaremesa(String value) {
        this.notificaremesa = value;
    }

    /**
     * Gets the value of the notificarotulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificarotulo() {
        return notificarotulo;
    }

    /**
     * Sets the value of the notificarotulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificarotulo(String value) {
        this.notificarotulo = value;
    }

}
