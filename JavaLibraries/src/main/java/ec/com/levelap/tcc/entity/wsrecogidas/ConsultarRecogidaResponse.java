
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
 *         &lt;element name="ConsultarRecogidaResult" type="{http://clientes.tcc.com.co/}ArrayOfClsServicioRecogidaOut" minOccurs="0"/>
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
    "consultarRecogidaResult",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarRecogidaResponse")
public class ConsultarRecogidaResponse {

    @XmlElement(name = "ConsultarRecogidaResult")
    protected ArrayOfClsServicioRecogidaOut consultarRecogidaResult;
    protected int respuesta;
    protected String mensaje;

    /**
     * Gets the value of the consultarRecogidaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsServicioRecogidaOut }
     *     
     */
    public ArrayOfClsServicioRecogidaOut getConsultarRecogidaResult() {
        return consultarRecogidaResult;
    }

    /**
     * Sets the value of the consultarRecogidaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsServicioRecogidaOut }
     *     
     */
    public void setConsultarRecogidaResult(ArrayOfClsServicioRecogidaOut value) {
        this.consultarRecogidaResult = value;
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
