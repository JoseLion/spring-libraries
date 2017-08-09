
package ec.com.levelap.tcc.wsdl.clientes;

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
 *         &lt;element name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remesas" type="{http://clientes.tcc.com.co/}ArrayOfRemesa" minOccurs="0"/>
 *         &lt;element name="remesasrespuesta" type="{http://clientes.tcc.com.co/}ArrayOfRemesaEstados" minOccurs="0"/>
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "remesas",
    "remesasrespuesta",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarInformacionRemesasEstados")
public class ConsultarInformacionRemesasEstados {

    @XmlElement(name = "Clave")
    protected String clave;
    protected ArrayOfRemesa remesas;
    protected ArrayOfRemesaEstados remesasrespuesta;
    @XmlElement(name = "Respuesta")
    protected int respuesta;
    @XmlElement(name = "Mensaje")
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
     * Gets the value of the remesas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRemesa }
     *     
     */
    public ArrayOfRemesa getRemesas() {
        return remesas;
    }

    /**
     * Sets the value of the remesas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRemesa }
     *     
     */
    public void setRemesas(ArrayOfRemesa value) {
        this.remesas = value;
    }

    /**
     * Gets the value of the remesasrespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRemesaEstados }
     *     
     */
    public ArrayOfRemesaEstados getRemesasrespuesta() {
        return remesasrespuesta;
    }

    /**
     * Sets the value of the remesasrespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRemesaEstados }
     *     
     */
    public void setRemesasrespuesta(ArrayOfRemesaEstados value) {
        this.remesasrespuesta = value;
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
