
package ec.com.levelap.tcc.wsdl.clientes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsDespachoPaqueteriaDetalle3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsDespachoPaqueteriaDetalle3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsDespachoPaqueteriaDetalle3" type="{http://clientes.tcc.com.co/}clsDespachoPaqueteriaDetalle3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsDespachoPaqueteriaDetalle3", propOrder = {
    "clsDespachoPaqueteriaDetalle3"
})
public class ArrayOfClsDespachoPaqueteriaDetalle3 {

    @XmlElement(nillable = true)
    protected List<ClsDespachoPaqueteriaDetalle3> clsDespachoPaqueteriaDetalle3;

    /**
     * Gets the value of the clsDespachoPaqueteriaDetalle3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsDespachoPaqueteriaDetalle3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsDespachoPaqueteriaDetalle3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsDespachoPaqueteriaDetalle3 }
     * 
     * 
     */
    public List<ClsDespachoPaqueteriaDetalle3> getClsDespachoPaqueteriaDetalle3() {
        if (clsDespachoPaqueteriaDetalle3 == null) {
            clsDespachoPaqueteriaDetalle3 = new ArrayList<ClsDespachoPaqueteriaDetalle3>();
        }
        return this.clsDespachoPaqueteriaDetalle3;
    }

}
