
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
 *         &lt;element name="ConsultarInformacionRemesasDetalleResult" type="{http://clientes.tcc.com.co/}tpSalida" minOccurs="0"/>
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
    "consultarInformacionRemesasDetalleResult"
})
@XmlRootElement(name = "ConsultarInformacionRemesasDetalleResponse")
public class ConsultarInformacionRemesasDetalleResponse {

    @XmlElement(name = "ConsultarInformacionRemesasDetalleResult")
    protected TpSalida consultarInformacionRemesasDetalleResult;

    /**
     * Gets the value of the consultarInformacionRemesasDetalleResult property.
     * 
     * @return
     *     possible object is
     *     {@link TpSalida }
     *     
     */
    public TpSalida getConsultarInformacionRemesasDetalleResult() {
        return consultarInformacionRemesasDetalleResult;
    }

    /**
     * Sets the value of the consultarInformacionRemesasDetalleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpSalida }
     *     
     */
    public void setConsultarInformacionRemesasDetalleResult(TpSalida value) {
        this.consultarInformacionRemesasDetalleResult = value;
    }

}
