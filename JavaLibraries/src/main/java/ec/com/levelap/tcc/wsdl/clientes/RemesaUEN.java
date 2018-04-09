
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemesaUEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemesaUEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadnegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemesaUEN", propOrder = {
    "numeroremesa",
    "unidadnegocio"
})
public class RemesaUEN {

    protected String numeroremesa;
    protected String unidadnegocio;

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
     * Gets the value of the unidadnegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadnegocio() {
        return unidadnegocio;
    }

    /**
     * Sets the value of the unidadnegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadnegocio(String value) {
        this.unidadnegocio = value;
    }

}
