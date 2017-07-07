
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
 *         &lt;element name="objDespacho" type="{http://www.tcc.com.co/xsd}tpGrabarRemesaCompleta" minOccurs="0"/>
 *         &lt;element name="remesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLRelacionEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLRotulos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMGRelacionEnvio" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="IMGRotulos" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="IMGRemesa" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "objDespacho",
    "remesa",
    "urlRelacionEnvio",
    "urlRotulos",
    "urlRemesa",
    "imgRelacionEnvio",
    "imgRotulos",
    "imgRemesa",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "GrabarDespacho4")
public class GrabarDespacho4 {

    protected TpGrabarRemesaCompleta objDespacho;
    protected String remesa;
    @XmlElement(name = "URLRelacionEnvio")
    protected String urlRelacionEnvio;
    @XmlElement(name = "URLRotulos")
    protected String urlRotulos;
    @XmlElement(name = "URLRemesa")
    protected String urlRemesa;
    @XmlElement(name = "IMGRelacionEnvio")
    protected byte[] imgRelacionEnvio;
    @XmlElement(name = "IMGRotulos")
    protected byte[] imgRotulos;
    @XmlElement(name = "IMGRemesa")
    protected byte[] imgRemesa;
    protected int respuesta;
    protected String mensaje;

    /**
     * Gets the value of the objDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link TpGrabarRemesaCompleta }
     *     
     */
    public TpGrabarRemesaCompleta getObjDespacho() {
        return objDespacho;
    }

    /**
     * Sets the value of the objDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpGrabarRemesaCompleta }
     *     
     */
    public void setObjDespacho(TpGrabarRemesaCompleta value) {
        this.objDespacho = value;
    }

    /**
     * Gets the value of the remesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemesa() {
        return remesa;
    }

    /**
     * Sets the value of the remesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemesa(String value) {
        this.remesa = value;
    }

    /**
     * Gets the value of the urlRelacionEnvio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLRelacionEnvio() {
        return urlRelacionEnvio;
    }

    /**
     * Sets the value of the urlRelacionEnvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLRelacionEnvio(String value) {
        this.urlRelacionEnvio = value;
    }

    /**
     * Gets the value of the urlRotulos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLRotulos() {
        return urlRotulos;
    }

    /**
     * Sets the value of the urlRotulos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLRotulos(String value) {
        this.urlRotulos = value;
    }

    /**
     * Gets the value of the urlRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLRemesa() {
        return urlRemesa;
    }

    /**
     * Sets the value of the urlRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLRemesa(String value) {
        this.urlRemesa = value;
    }

    /**
     * Gets the value of the imgRelacionEnvio property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIMGRelacionEnvio() {
        return imgRelacionEnvio;
    }

    /**
     * Sets the value of the imgRelacionEnvio property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIMGRelacionEnvio(byte[] value) {
        this.imgRelacionEnvio = ((byte[]) value);
    }

    /**
     * Gets the value of the imgRotulos property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIMGRotulos() {
        return imgRotulos;
    }

    /**
     * Sets the value of the imgRotulos property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIMGRotulos(byte[] value) {
        this.imgRotulos = ((byte[]) value);
    }

    /**
     * Gets the value of the imgRemesa property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIMGRemesa() {
        return imgRemesa;
    }

    /**
     * Sets the value of the imgRemesa property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIMGRemesa(byte[] value) {
        this.imgRemesa = ((byte[]) value);
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
