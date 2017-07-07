
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
 *         &lt;element name="SolicitudRecogida" type="{http://clientes.tcc.com.co/}validacionsolicitud" minOccurs="0"/>
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
    "solicitudRecogida"
})
@XmlRootElement(name = "validarRecogidaOSB")
public class ValidarRecogidaOSB {

    protected String clave;
    @XmlElement(name = "SolicitudRecogida")
    protected Validacionsolicitud solicitudRecogida;

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
     *     {@link Validacionsolicitud }
     *     
     */
    public Validacionsolicitud getSolicitudRecogida() {
        return solicitudRecogida;
    }

    /**
     * Sets the value of the solicitudRecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validacionsolicitud }
     *     
     */
    public void setSolicitudRecogida(Validacionsolicitud value) {
        this.solicitudRecogida = value;
    }

}
