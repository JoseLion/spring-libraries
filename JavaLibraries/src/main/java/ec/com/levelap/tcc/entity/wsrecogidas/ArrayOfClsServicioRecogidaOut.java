
package ec.com.levelap.tcc.entity.wsrecogidas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsServicioRecogidaOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsServicioRecogidaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsServicioRecogidaOut" type="{http://clientes.tcc.com.co/}clsServicioRecogidaOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsServicioRecogidaOut", propOrder = {
    "clsServicioRecogidaOut"
})
public class ArrayOfClsServicioRecogidaOut {

    @XmlElement(nillable = true)
    protected List<ClsServicioRecogidaOut> clsServicioRecogidaOut;

    /**
     * Gets the value of the clsServicioRecogidaOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsServicioRecogidaOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsServicioRecogidaOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsServicioRecogidaOut }
     * 
     * 
     */
    public List<ClsServicioRecogidaOut> getClsServicioRecogidaOut() {
        if (clsServicioRecogidaOut == null) {
            clsServicioRecogidaOut = new ArrayList<ClsServicioRecogidaOut>();
        }
        return this.clsServicioRecogidaOut;
    }

}
