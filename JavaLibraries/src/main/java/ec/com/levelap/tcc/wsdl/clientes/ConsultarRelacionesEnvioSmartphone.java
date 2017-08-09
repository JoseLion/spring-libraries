
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
 *         &lt;element name="Relacion1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Relacion2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Relacion3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrRemesas" type="{http://clientes.tcc.com.co/}ArrayOfClsRemesa" minOccurs="0"/>
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
    "relacion1",
    "relacion2",
    "relacion3",
    "arrRemesas",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarRelacionesEnvioSmartphone")
public class ConsultarRelacionesEnvioSmartphone {

    @XmlElement(name = "Clave")
    protected String clave;
    @XmlElement(name = "Relacion1")
    protected int relacion1;
    @XmlElement(name = "Relacion2")
    protected int relacion2;
    @XmlElement(name = "Relacion3")
    protected int relacion3;
    protected ArrayOfClsRemesa arrRemesas;
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
     * Gets the value of the relacion1 property.
     * 
     */
    public int getRelacion1() {
        return relacion1;
    }

    /**
     * Sets the value of the relacion1 property.
     * 
     */
    public void setRelacion1(int value) {
        this.relacion1 = value;
    }

    /**
     * Gets the value of the relacion2 property.
     * 
     */
    public int getRelacion2() {
        return relacion2;
    }

    /**
     * Sets the value of the relacion2 property.
     * 
     */
    public void setRelacion2(int value) {
        this.relacion2 = value;
    }

    /**
     * Gets the value of the relacion3 property.
     * 
     */
    public int getRelacion3() {
        return relacion3;
    }

    /**
     * Sets the value of the relacion3 property.
     * 
     */
    public void setRelacion3(int value) {
        this.relacion3 = value;
    }

    /**
     * Gets the value of the arrRemesas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsRemesa }
     *     
     */
    public ArrayOfClsRemesa getArrRemesas() {
        return arrRemesas;
    }

    /**
     * Sets the value of the arrRemesas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsRemesa }
     *     
     */
    public void setArrRemesas(ArrayOfClsRemesa value) {
        this.arrRemesas = value;
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
