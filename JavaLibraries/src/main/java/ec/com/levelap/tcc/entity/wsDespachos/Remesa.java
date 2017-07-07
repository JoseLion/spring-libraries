
package ec.com.levelap.tcc.entity.wsDespachos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Remesa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Remesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerocontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlrotulos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://clientes.tcc.com.co/}Respuesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remesa", propOrder = {
    "numerocontrol",
    "numeroremesa",
    "urlremesa",
    "urlrotulos",
    "respuesta"
})
public class Remesa {

    protected String numerocontrol;
    protected String numeroremesa;
    protected String urlremesa;
    protected String urlrotulos;
    protected Respuesta respuesta;

    /**
     * Gets the value of the numerocontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerocontrol() {
        return numerocontrol;
    }

    /**
     * Sets the value of the numerocontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerocontrol(String value) {
        this.numerocontrol = value;
    }

    /**
     * Gets the value of the numeroremesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroremesa() {
        return numeroremesa;
    }

    /**
     * Sets the value of the numeroremesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroremesa(String value) {
        this.numeroremesa = value;
    }

    /**
     * Gets the value of the urlremesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlremesa() {
        return urlremesa;
    }

    /**
     * Sets the value of the urlremesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlremesa(String value) {
        this.urlremesa = value;
    }

    /**
     * Gets the value of the urlrotulos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlrotulos() {
        return urlrotulos;
    }

    /**
     * Sets the value of the urlrotulos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlrotulos(String value) {
        this.urlrotulos = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setRespuesta(Respuesta value) {
        this.respuesta = value;
    }

}
