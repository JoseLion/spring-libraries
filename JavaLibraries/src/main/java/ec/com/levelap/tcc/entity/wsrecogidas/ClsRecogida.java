
package ec.com.levelap.tcc.entity.wsrecogidas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsRecogida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsRecogida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdRecogida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Oficina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsRecogida", propOrder = {
    "idRecogida",
    "oficina"
})
public class ClsRecogida {

    @XmlElement(name = "IdRecogida")
    protected int idRecogida;
    @XmlElement(name = "Oficina", required = true, type = Integer.class, nillable = true)
    protected Integer oficina;

    /**
     * Gets the value of the idRecogida property.
     * 
     */
    public int getIdRecogida() {
        return idRecogida;
    }

    /**
     * Sets the value of the idRecogida property.
     * 
     */
    public void setIdRecogida(int value) {
        this.idRecogida = value;
    }

    /**
     * Gets the value of the oficina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOficina() {
        return oficina;
    }

    /**
     * Sets the value of the oficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOficina(Integer value) {
        this.oficina = value;
    }

}
