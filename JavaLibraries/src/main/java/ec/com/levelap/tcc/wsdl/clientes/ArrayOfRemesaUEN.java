
package ec.com.levelap.tcc.wsdl.clientes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRemesaUEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRemesaUEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemesaUEN" type="{http://clientes.tcc.com.co/}RemesaUEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRemesaUEN", propOrder = {
    "remesaUEN"
})
public class ArrayOfRemesaUEN {

    @XmlElement(name = "RemesaUEN", nillable = true)
    protected List<RemesaUEN> remesaUEN;

    /**
     * Gets the value of the remesaUEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remesaUEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemesaUEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemesaUEN }
     * 
     * 
     */
    public List<RemesaUEN> getRemesaUEN() {
        if (remesaUEN == null) {
            remesaUEN = new ArrayList<RemesaUEN>();
        }
        return this.remesaUEN;
    }

}
