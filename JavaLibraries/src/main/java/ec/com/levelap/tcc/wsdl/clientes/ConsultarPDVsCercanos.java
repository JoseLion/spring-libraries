
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
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CercaniaKMS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PDVs" type="{http://clientes.tcc.com.co/}ArrayOfClsPuntoDeVenta" minOccurs="0"/>
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
    "latitud",
    "longitud",
    "cercaniaKMS",
    "pdVs",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarPDVsCercanos")
public class ConsultarPDVsCercanos {

    @XmlElement(name = "Clave")
    protected String clave;
    @XmlElement(name = "Latitud")
    protected double latitud;
    @XmlElement(name = "Longitud")
    protected double longitud;
    @XmlElement(name = "CercaniaKMS")
    protected double cercaniaKMS;
    @XmlElement(name = "PDVs")
    protected ArrayOfClsPuntoDeVenta pdVs;
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
     * Gets the value of the latitud property.
     * 
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     */
    public void setLatitud(double value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     */
    public void setLongitud(double value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the cercaniaKMS property.
     * 
     */
    public double getCercaniaKMS() {
        return cercaniaKMS;
    }

    /**
     * Sets the value of the cercaniaKMS property.
     * 
     */
    public void setCercaniaKMS(double value) {
        this.cercaniaKMS = value;
    }

    /**
     * Gets the value of the pdVs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsPuntoDeVenta }
     *     
     */
    public ArrayOfClsPuntoDeVenta getPDVs() {
        return pdVs;
    }

    /**
     * Sets the value of the pdVs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsPuntoDeVenta }
     *     
     */
    public void setPDVs(ArrayOfClsPuntoDeVenta value) {
        this.pdVs = value;
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
