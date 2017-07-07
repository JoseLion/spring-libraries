
package ec.com.levelap.tcc.entity.wsrecogidas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="recogidas" type="{http://clientes.tcc.com.co/}ArrayOfClsRecogida" minOccurs="0"/>
 *         &lt;element name="estRecogida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "recogidas",
    "estRecogida",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "EstadoRecogida")
public class EstadoRecogida {

    protected String clave;
    protected ArrayOfClsRecogida recogidas;
    protected String estRecogida;
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
     * Gets the value of the recogidas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsRecogida }
     *     
     */
    public ArrayOfClsRecogida getRecogidas() {
        return recogidas;
    }

    /**
     * Sets the value of the recogidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsRecogida }
     *     
     */
    public void setRecogidas(ArrayOfClsRecogida value) {
        this.recogidas = value;
    }

    /**
     * Gets the value of the estRecogida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstRecogida() {
        return estRecogida;
    }

    /**
     * Sets the value of the estRecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstRecogida(String value) {
        this.estRecogida = value;
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
