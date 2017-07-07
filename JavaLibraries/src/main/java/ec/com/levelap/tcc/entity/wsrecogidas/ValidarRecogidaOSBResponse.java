
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
 *         &lt;element name="validarRecogidaOSBResult" type="{http://clientes.tcc.com.co/}validacionsolicitudrespuesta" minOccurs="0"/>
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
    "validarRecogidaOSBResult"
})
@XmlRootElement(name = "validarRecogidaOSBResponse")
public class ValidarRecogidaOSBResponse {

    protected Validacionsolicitudrespuesta validarRecogidaOSBResult;

    /**
     * Gets the value of the validarRecogidaOSBResult property.
     * 
     * @return
     *     possible object is
     *     {@link Validacionsolicitudrespuesta }
     *     
     */
    public Validacionsolicitudrespuesta getValidarRecogidaOSBResult() {
        return validarRecogidaOSBResult;
    }

    /**
     * Sets the value of the validarRecogidaOSBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validacionsolicitudrespuesta }
     *     
     */
    public void setValidarRecogidaOSBResult(Validacionsolicitudrespuesta value) {
        this.validarRecogidaOSBResult = value;
    }

}
