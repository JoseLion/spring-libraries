
package ec.com.levelap.tcc.entity.wsrecogidas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SolicitudRecogida" type="{http://clientes.tcc.com.co/}clsSolicitudRecogida" minOccurs="0"/>
 *         &lt;element name="recogida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clave",
    "solicitudRecogida",
    "recogida",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "SolicitarRecogida")
public class SolicitarRecogida {

    protected String clave;
    @XmlElement(name = "SolicitudRecogida")
    protected ClsSolicitudRecogida solicitudRecogida;
    protected int recogida;
    protected int respuesta;
    protected String mensaje;

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
     * Gets the value of the solicitudRecogida property.
     * 
     * @return
     *     possible object is
     *     {@link ClsSolicitudRecogida }
     *     
     */
    public ClsSolicitudRecogida getSolicitudRecogida() {
        return solicitudRecogida;
    }

    /**
     * Sets the value of the solicitudRecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsSolicitudRecogida }
     *     
     */
    public void setSolicitudRecogida(ClsSolicitudRecogida value) {
        this.solicitudRecogida = value;
    }

    /**
     * Gets the value of the recogida property.
     * 
     */
    public int getRecogida() {
        return recogida;
    }

    /**
     * Sets the value of the recogida property.
     * 
     */
    public void setRecogida(int value) {
        this.recogida = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     */
    public int getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     */
    public void setRespuesta(int value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
