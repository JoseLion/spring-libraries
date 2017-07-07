
package ec.com.levelap.tcc.entity.wsrecogidas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsSolicitudRecogida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsSolicitudRecogida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Solicitante" type="{http://clientes.tcc.com.co/}clsClienteSolicitante" minOccurs="0"/>
 *         &lt;element name="Remitente" type="{http://clientes.tcc.com.co/}clsClienteRemitente" minOccurs="0"/>
 *         &lt;element name="Servicio" type="{http://clientes.tcc.com.co/}clsServicio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsSolicitudRecogida", propOrder = {
    "solicitante",
    "remitente",
    "servicio"
})
public class ClsSolicitudRecogida {

    @XmlElement(name = "Solicitante")
    protected ClsClienteSolicitante solicitante;
    @XmlElement(name = "Remitente")
    protected ClsClienteRemitente remitente;
    @XmlElement(name = "Servicio")
    protected ClsServicio servicio;

    /**
     * Gets the value of the solicitante property.
     * 
     * @return
     *     possible object is
     *     {@link ClsClienteSolicitante }
     *     
     */
    public ClsClienteSolicitante getSolicitante() {
        return solicitante;
    }

    /**
     * Sets the value of the solicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsClienteSolicitante }
     *     
     */
    public void setSolicitante(ClsClienteSolicitante value) {
        this.solicitante = value;
    }

    /**
     * Gets the value of the remitente property.
     * 
     * @return
     *     possible object is
     *     {@link ClsClienteRemitente }
     *     
     */
    public ClsClienteRemitente getRemitente() {
        return remitente;
    }

    /**
     * Sets the value of the remitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsClienteRemitente }
     *     
     */
    public void setRemitente(ClsClienteRemitente value) {
        this.remitente = value;
    }

    /**
     * Gets the value of the servicio property.
     * 
     * @return
     *     possible object is
     *     {@link ClsServicio }
     *     
     */
    public ClsServicio getServicio() {
        return servicio;
    }

    /**
     * Sets the value of the servicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsServicio }
     *     
     */
    public void setServicio(ClsServicio value) {
        this.servicio = value;
    }

}
