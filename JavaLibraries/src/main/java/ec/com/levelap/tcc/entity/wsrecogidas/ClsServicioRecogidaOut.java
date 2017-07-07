
package ec.com.levelap.tcc.entity.wsrecogidas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsServicioRecogidaOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsServicioRecogidaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HoraInicio" type="{http://clientes.tcc.com.co/}TimeSpan"/>
 *         &lt;element name="HoraFin" type="{http://clientes.tcc.com.co/}TimeSpan"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Solicita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClienteSolicita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentSolicitante" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RemitenteContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentRemitente" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CodCiudadRecogida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsServicioRecogidaOut", propOrder = {
    "numero",
    "fecha",
    "horaInicio",
    "horaFin",
    "ciudad",
    "direccion",
    "cliente",
    "solicita",
    "observaciones",
    "estado",
    "resultado",
    "tipo",
    "clienteSolicita",
    "tipoDocSolicitante",
    "identSolicitante",
    "remitenteContacto",
    "tipoDocRemitente",
    "identRemitente",
    "unidades",
    "valor",
    "codCiudadRecogida"
})
public class ClsServicioRecogidaOut {

    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "HoraInicio", required = true)
    protected TimeSpan horaInicio;
    @XmlElement(name = "HoraFin", required = true)
    protected TimeSpan horaFin;
    @XmlElement(name = "Ciudad")
    protected String ciudad;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Cliente")
    protected String cliente;
    @XmlElement(name = "Solicita")
    protected String solicita;
    @XmlElement(name = "Observaciones")
    protected String observaciones;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Resultado")
    protected String resultado;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "ClienteSolicita")
    protected String clienteSolicita;
    @XmlElement(name = "TipoDocSolicitante")
    protected String tipoDocSolicitante;
    @XmlElement(name = "IdentSolicitante")
    protected double identSolicitante;
    @XmlElement(name = "RemitenteContacto")
    protected String remitenteContacto;
    @XmlElement(name = "TipoDocRemitente")
    protected String tipoDocRemitente;
    @XmlElement(name = "IdentRemitente")
    protected double identRemitente;
    @XmlElement(name = "Unidades")
    protected int unidades;
    @XmlElement(name = "Valor")
    protected double valor;
    @XmlElement(name = "CodCiudadRecogida")
    protected int codCiudadRecogida;

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
     * Gets the value of the horaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getHoraInicio() {
        return horaInicio;
    }

    /**
     * Sets the value of the horaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setHoraInicio(TimeSpan value) {
        this.horaInicio = value;
    }

    /**
     * Gets the value of the horaFin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getHoraFin() {
        return horaFin;
    }

    /**
     * Sets the value of the horaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setHoraFin(TimeSpan value) {
        this.horaFin = value;
    }

    /**
     * Gets the value of the ciudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the solicita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicita() {
        return solicita;
    }

    /**
     * Sets the value of the solicita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicita(String value) {
        this.solicita = value;
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
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the clienteSolicita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteSolicita() {
        return clienteSolicita;
    }

    /**
     * Sets the value of the clienteSolicita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteSolicita(String value) {
        this.clienteSolicita = value;
    }

    /**
     * Gets the value of the tipoDocSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocSolicitante() {
        return tipoDocSolicitante;
    }

    /**
     * Sets the value of the tipoDocSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocSolicitante(String value) {
        this.tipoDocSolicitante = value;
    }

    /**
     * Gets the value of the identSolicitante property.
     * 
     */
    public double getIdentSolicitante() {
        return identSolicitante;
    }

    /**
     * Sets the value of the identSolicitante property.
     * 
     */
    public void setIdentSolicitante(double value) {
        this.identSolicitante = value;
    }

    /**
     * Gets the value of the remitenteContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitenteContacto() {
        return remitenteContacto;
    }

    /**
     * Sets the value of the remitenteContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitenteContacto(String value) {
        this.remitenteContacto = value;
    }

    /**
     * Gets the value of the tipoDocRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocRemitente() {
        return tipoDocRemitente;
    }

    /**
     * Sets the value of the tipoDocRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocRemitente(String value) {
        this.tipoDocRemitente = value;
    }

    /**
     * Gets the value of the identRemitente property.
     * 
     */
    public double getIdentRemitente() {
        return identRemitente;
    }

    /**
     * Sets the value of the identRemitente property.
     * 
     */
    public void setIdentRemitente(double value) {
        this.identRemitente = value;
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
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the codCiudadRecogida property.
     * 
     */
    public int getCodCiudadRecogida() {
        return codCiudadRecogida;
    }

    /**
     * Sets the value of the codCiudadRecogida property.
     * 
     */
    public void setCodCiudadRecogida(int value) {
        this.codCiudadRecogida = value;
    }

}
