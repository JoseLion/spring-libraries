
package ec.com.levelap.tcc.wsdl.clientes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelacionEnvioRespuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelacionEnvioRespuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerodespacho" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="solicitudrecogida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remesas" type="{http://clientes.tcc.com.co/}ArrayOfRemesa" minOccurs="0"/>
 *         &lt;element name="urlrelacionenvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RelacionEnvioRespuesta", propOrder = {
    "numerodespacho",
    "solicitudrecogida",
    "remesas",
    "urlrelacionenvio",
    "respuesta"
})
public class RelacionEnvioRespuesta {

    @XmlElement(required = true)
    protected BigDecimal numerodespacho;
    protected String solicitudrecogida;
    protected ArrayOfRemesa remesas;
    protected String urlrelacionenvio;
    protected Respuesta respuesta;

    /**
     * Gets the value of the numerodespacho property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumerodespacho() {
        return numerodespacho;
    }

    /**
     * Sets the value of the numerodespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumerodespacho(BigDecimal value) {
        this.numerodespacho = value;
    }

    /**
     * Gets the value of the solicitudrecogida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitudrecogida() {
        return solicitudrecogida;
    }

    /**
     * Sets the value of the solicitudrecogida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitudrecogida(String value) {
        this.solicitudrecogida = value;
    }

    /**
     * Gets the value of the remesas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRemesa }
     *     
     */
    public ArrayOfRemesa getRemesas() {
        return remesas;
    }

    /**
     * Sets the value of the remesas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRemesa }
     *     
     */
    public void setRemesas(ArrayOfRemesa value) {
        this.remesas = value;
    }

    /**
     * Gets the value of the urlrelacionenvio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlrelacionenvio() {
        return urlrelacionenvio;
    }

    /**
     * Sets the value of the urlrelacionenvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlrelacionenvio(String value) {
        this.urlrelacionenvio = value;
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
