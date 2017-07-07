
package ec.com.levelap.tcc.entity.wsrecogidas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsSolicitudRecogidaConNroRemesa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsSolicitudRecogidaConNroRemesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Solicitante" type="{http://clientes.tcc.com.co/}clsClienteSolicitanteConNroRemesa" minOccurs="0"/>
 *         &lt;element name="Remitente" type="{http://clientes.tcc.com.co/}clsClienteRemitenteConNroRemesa" minOccurs="0"/>
 *         &lt;element name="Servicio" type="{http://clientes.tcc.com.co/}clsServicioConNroRemesa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsSolicitudRecogidaConNroRemesa", propOrder = {
    "solicitante",
    "remitente",
    "servicio"
})
public class ClsSolicitudRecogidaConNroRemesa {

    @XmlElement(name = "Solicitante")
    protected ClsClienteSolicitanteConNroRemesa solicitante;
    @XmlElement(name = "Remitente")
    protected ClsClienteRemitenteConNroRemesa remitente;
    @XmlElement(name = "Servicio")
    protected ClsServicioConNroRemesa servicio;

    /**
     * Gets the value of the solicitante property.
     * 
     * @return
     *     possible object is
     *     {@link ClsClienteSolicitanteConNroRemesa }
     *     
     */
    public ClsClienteSolicitanteConNroRemesa getSolicitante() {
        return solicitante;
    }

    /**
     * Sets the value of the solicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsClienteSolicitanteConNroRemesa }
     *     
     */
    public void setSolicitante(ClsClienteSolicitanteConNroRemesa value) {
        this.solicitante = value;
    }

    /**
     * Gets the value of the remitente property.
     * 
     * @return
     *     possible object is
     *     {@link ClsClienteRemitenteConNroRemesa }
     *     
     */
    public ClsClienteRemitenteConNroRemesa getRemitente() {
        return remitente;
    }

    /**
     * Sets the value of the remitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsClienteRemitenteConNroRemesa }
     *     
     */
    public void setRemitente(ClsClienteRemitenteConNroRemesa value) {
        this.remitente = value;
    }

    /**
     * Gets the value of the servicio property.
     * 
     * @return
     *     possible object is
     *     {@link ClsServicioConNroRemesa }
     *     
     */
    public ClsServicioConNroRemesa getServicio() {
        return servicio;
    }

    /**
     * Sets the value of the servicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsServicioConNroRemesa }
     *     
     */
    public void setServicio(ClsServicioConNroRemesa value) {
        this.servicio = value;
    }

}
