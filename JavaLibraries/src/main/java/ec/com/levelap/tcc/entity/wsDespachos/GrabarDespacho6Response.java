
package ec.com.levelap.tcc.entity.wsDespachos;

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
 *         &lt;element name="GrabarDespacho6Result" type="{http://clientes.tcc.com.co/}RelacionEnvioRespuesta" minOccurs="0"/>
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
    "grabarDespacho6Result"
})
@XmlRootElement(name = "GrabarDespacho6Response")
public class GrabarDespacho6Response {

    @XmlElement(name = "GrabarDespacho6Result")
    protected RelacionEnvioRespuesta grabarDespacho6Result;

    /**
     * Gets the value of the grabarDespacho6Result property.
     * 
     * @return
     *     possible object is
     *     {@link RelacionEnvioRespuesta }
     *     
     */
    public RelacionEnvioRespuesta getGrabarDespacho6Result() {
        return grabarDespacho6Result;
    }

    /**
     * Sets the value of the grabarDespacho6Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelacionEnvioRespuesta }
     *     
     */
    public void setGrabarDespacho6Result(RelacionEnvioRespuesta value) {
        this.grabarDespacho6Result = value;
    }

}
