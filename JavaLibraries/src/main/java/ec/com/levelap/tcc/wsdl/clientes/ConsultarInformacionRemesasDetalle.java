
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
 *         &lt;element name="consultar" type="{http://clientes.tcc.com.co/}tpEntrada" minOccurs="0"/>
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
    "consultar"
})
@XmlRootElement(name = "ConsultarInformacionRemesasDetalle")
public class ConsultarInformacionRemesasDetalle {

    protected TpEntrada consultar;

    /**
     * Gets the value of the consultar property.
     * 
     * @return
     *     possible object is
     *     {@link TpEntrada }
     *     
     */
    public TpEntrada getConsultar() {
        return consultar;
    }

    /**
     * Sets the value of the consultar property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpEntrada }
     *     
     */
    public void setConsultar(TpEntrada value) {
        this.consultar = value;
    }

}
