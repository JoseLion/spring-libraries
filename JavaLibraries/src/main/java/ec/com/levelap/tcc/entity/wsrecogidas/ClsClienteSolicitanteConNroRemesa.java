
package ec.com.levelap.tcc.entity.wsrecogidas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsClienteSolicitanteConNroRemesa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsClienteSolicitanteConNroRemesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonaSolicita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsClienteSolicitanteConNroRemesa", propOrder = {
    "cuenta",
    "telefono",
    "direccion",
    "ciudad",
    "nombreCliente",
    "personaSolicita",
    "tipoDocumento",
    "identificacion"
})
public class ClsClienteSolicitanteConNroRemesa {

    @XmlElement(name = "Cuenta")
    protected int cuenta;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Ciudad")
    protected int ciudad;
    @XmlElement(name = "NombreCliente")
    protected String nombreCliente;
    @XmlElement(name = "PersonaSolicita")
    protected String personaSolicita;
    @XmlElement(name = "TipoDocumento")
    protected int tipoDocumento;
    @XmlElement(name = "Identificacion", required = true)
    protected BigDecimal identificacion;

    /**
     * Gets the value of the cuenta property.
     * 
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     * 
     */
    public void setCuenta(int value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the ciudad property.
     * 
     */
    public int getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     * 
     */
    public void setCiudad(int value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the nombreCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Sets the value of the nombreCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Gets the value of the personaSolicita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaSolicita() {
        return personaSolicita;
    }

    /**
     * Sets the value of the personaSolicita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaSolicita(String value) {
        this.personaSolicita = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     */
    public void setTipoDocumento(int value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdentificacion(BigDecimal value) {
        this.identificacion = value;
    }

}
