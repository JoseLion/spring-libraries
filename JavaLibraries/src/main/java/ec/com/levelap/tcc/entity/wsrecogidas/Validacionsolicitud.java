
package ec.com.levelap.tcc.entity.wsrecogidas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validacionsolicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validacionsolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DireccionRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonaContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorMercancia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CiudadRemitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiudadSolicitante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validacionsolicitud", propOrder = {
    "idCliente",
    "direccionRemitente",
    "personaContacto",
    "fechaServicio",
    "horaInicial",
    "horaFinal",
    "unidades",
    "peso",
    "valorMercancia",
    "ciudadRemitente",
    "ciudadSolicitante"
})
public class Validacionsolicitud {

    @XmlElement(name = "IDCliente")
    protected int idCliente;
    @XmlElement(name = "DireccionRemitente")
    protected String direccionRemitente;
    @XmlElement(name = "PersonaContacto")
    protected String personaContacto;
    @XmlElement(name = "FechaServicio")
    protected String fechaServicio;
    @XmlElement(name = "HoraInicial")
    protected String horaInicial;
    @XmlElement(name = "HoraFinal")
    protected String horaFinal;
    @XmlElement(name = "Unidades")
    protected int unidades;
    @XmlElement(name = "Peso", required = true)
    protected BigDecimal peso;
    @XmlElement(name = "ValorMercancia", required = true)
    protected BigDecimal valorMercancia;
    @XmlElement(name = "CiudadRemitente")
    protected int ciudadRemitente;
    @XmlElement(name = "CiudadSolicitante")
    protected int ciudadSolicitante;

    /**
     * Gets the value of the idCliente property.
     * 
     */
    public int getIDCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     */
    public void setIDCliente(int value) {
        this.idCliente = value;
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
     * Gets the value of the personaContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaContacto() {
        return personaContacto;
    }

    /**
     * Sets the value of the personaContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaContacto(String value) {
        this.personaContacto = value;
    }

    /**
     * Gets the value of the fechaServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaServicio() {
        return fechaServicio;
    }

    /**
     * Sets the value of the fechaServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaServicio(String value) {
        this.fechaServicio = value;
    }

    /**
     * Gets the value of the horaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicial() {
        return horaInicial;
    }

    /**
     * Sets the value of the horaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicial(String value) {
        this.horaInicial = value;
    }

    /**
     * Gets the value of the horaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Sets the value of the horaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinal(String value) {
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
     * Gets the value of the ciudadRemitente property.
     * 
     */
    public int getCiudadRemitente() {
        return ciudadRemitente;
    }

    /**
     * Sets the value of the ciudadRemitente property.
     * 
     */
    public void setCiudadRemitente(int value) {
        this.ciudadRemitente = value;
    }

    /**
     * Gets the value of the ciudadSolicitante property.
     * 
     */
    public int getCiudadSolicitante() {
        return ciudadSolicitante;
    }

    /**
     * Sets the value of the ciudadSolicitante property.
     * 
     */
    public void setCiudadSolicitante(int value) {
        this.ciudadSolicitante = value;
    }

}
