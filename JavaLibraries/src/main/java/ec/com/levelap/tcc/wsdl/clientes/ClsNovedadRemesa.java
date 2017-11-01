
package ec.com.levelap.tcc.wsdl.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsNovedadRemesa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsNovedadRemesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoComplementario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCiudadPlantea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiudadPlantea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodciudadSoluciona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiudadSoluciona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seguimientos" type="{http://clientes.tcc.com.co/}ArrayOfClsSeguimientoNovedad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsNovedadRemesa", propOrder = {
    "id",
    "codigo",
    "codigoComplementario",
    "codCiudadPlantea",
    "ciudadPlantea",
    "codciudadSoluciona",
    "ciudadSoluciona",
    "fecha",
    "descripcion",
    "comentarios",
    "estado",
    "seguimientos"
})
public class ClsNovedadRemesa {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "CodigoComplementario")
    protected String codigoComplementario;
    @XmlElement(name = "CodCiudadPlantea")
    protected int codCiudadPlantea;
    @XmlElement(name = "CiudadPlantea")
    protected String ciudadPlantea;
    @XmlElement(name = "CodciudadSoluciona")
    protected int codciudadSoluciona;
    @XmlElement(name = "CiudadSoluciona")
    protected String ciudadSoluciona;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Comentarios")
    protected String comentarios;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Seguimientos")
    protected ArrayOfClsSeguimientoNovedad seguimientos;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the codigoComplementario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComplementario() {
        return codigoComplementario;
    }

    /**
     * Sets the value of the codigoComplementario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComplementario(String value) {
        this.codigoComplementario = value;
    }

    /**
     * Gets the value of the codCiudadPlantea property.
     * 
     */
    public int getCodCiudadPlantea() {
        return codCiudadPlantea;
    }

    /**
     * Sets the value of the codCiudadPlantea property.
     * 
     */
    public void setCodCiudadPlantea(int value) {
        this.codCiudadPlantea = value;
    }

    /**
     * Gets the value of the ciudadPlantea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadPlantea() {
        return ciudadPlantea;
    }

    /**
     * Sets the value of the ciudadPlantea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadPlantea(String value) {
        this.ciudadPlantea = value;
    }

    /**
     * Gets the value of the codciudadSoluciona property.
     * 
     */
    public int getCodciudadSoluciona() {
        return codciudadSoluciona;
    }

    /**
     * Sets the value of the codciudadSoluciona property.
     * 
     */
    public void setCodciudadSoluciona(int value) {
        this.codciudadSoluciona = value;
    }

    /**
     * Gets the value of the ciudadSoluciona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadSoluciona() {
        return ciudadSoluciona;
    }

    /**
     * Sets the value of the ciudadSoluciona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadSoluciona(String value) {
        this.ciudadSoluciona = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the comentarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Sets the value of the comentarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the seguimientos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsSeguimientoNovedad }
     *     
     */
    public ArrayOfClsSeguimientoNovedad getSeguimientos() {
        return seguimientos;
    }

    /**
     * Sets the value of the seguimientos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsSeguimientoNovedad }
     *     
     */
    public void setSeguimientos(ArrayOfClsSeguimientoNovedad value) {
        this.seguimientos = value;
    }

}
