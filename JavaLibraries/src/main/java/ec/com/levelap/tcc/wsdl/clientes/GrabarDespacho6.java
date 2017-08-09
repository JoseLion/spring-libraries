
package ec.com.levelap.tcc.wsdl.clientes;

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
 *         &lt;element name="objDespacho" type="{http://clientes.tcc.com.co/}RelacionEnvio" minOccurs="0"/>
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
    "objDespacho"
})
@XmlRootElement(name = "GrabarDespacho6")
public class GrabarDespacho6 {

    protected RelacionEnvio objDespacho;

    /**
     * Gets the value of the objDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link RelacionEnvio }
     *     
     */
    public RelacionEnvio getObjDespacho() {
        return objDespacho;
    }

    /**
     * Sets the value of the objDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelacionEnvio }
     *     
     */
    public void setObjDespacho(RelacionEnvio value) {
        this.objDespacho = value;
    }

}
