
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
 *         &lt;element name="ConsultarRemesasTrackingMensajeriaCRCResult" type="{http://clientes.tcc.com.co/}ArrayOfClsInfoRemesa" minOccurs="0"/>
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
    "consultarRemesasTrackingMensajeriaCRCResult",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarRemesasTrackingMensajeriaCRCResponse")
public class ConsultarRemesasTrackingMensajeriaCRCResponse {

    @XmlElement(name = "ConsultarRemesasTrackingMensajeriaCRCResult")
    protected ArrayOfClsInfoRemesa consultarRemesasTrackingMensajeriaCRCResult;
    @XmlElement(name = "Respuesta")
    protected int respuesta;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

    /**
     * Gets the value of the consultarRemesasTrackingMensajeriaCRCResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsInfoRemesa }
     *     
     */
    public ArrayOfClsInfoRemesa getConsultarRemesasTrackingMensajeriaCRCResult() {
        return consultarRemesasTrackingMensajeriaCRCResult;
    }

    /**
     * Sets the value of the consultarRemesasTrackingMensajeriaCRCResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsInfoRemesa }
     *     
     */
    public void setConsultarRemesasTrackingMensajeriaCRCResult(ArrayOfClsInfoRemesa value) {
        this.consultarRemesasTrackingMensajeriaCRCResult = value;
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
