
package ec.com.levelap.tcc.entity.wsDespachos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clsDespachoPaqueteriaDetalle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsDespachoPaqueteriaDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDDespacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Consecutivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoDeEmpaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenciaCte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PesoKilosTotalDetalle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoKilosFacturadosTotalDetalle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoKilosUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoKilosFacturadosUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LargoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnchoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AltoCmsUnitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PesoVolumenUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoVolumenTotalDetalle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorMercanciaUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorMercanciaTotalDetalle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoInfUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnidadMedidaPesoInf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LargoInfUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AnchoInfUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AltoInfUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnidadMedidaLongitudInf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaHoraCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHoraUltimaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UsuarioUltimaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsDespachoPaqueteriaDetalle", propOrder = {
    "idDespacho",
    "consecutivo",
    "tipoDeEmpaque",
    "referenciaCte",
    "descripcion",
    "cantidadUnidades",
    "pesoKilosTotalDetalle",
    "pesoKilosFacturadosTotalDetalle",
    "pesoKilosUnitario",
    "pesoKilosFacturadosUnitario",
    "largoCmsUnitario",
    "anchoCmsUnitario",
    "altoCmsUnitario",
    "pesoVolumenUnitario",
    "pesoVolumenTotalDetalle",
    "valorMercanciaUnitario",
    "valorMercanciaTotalDetalle",
    "pesoInfUnitario",
    "unidadMedidaPesoInf",
    "largoInfUnitario",
    "anchoInfUnitario",
    "altoInfUnitario",
    "unidadMedidaLongitudInf",
    "fechaHoraCreacion",
    "usuarioCreacion",
    "fechaHoraUltimaModificacion",
    "usuarioUltimaModificacion"
})
public class ClsDespachoPaqueteriaDetalle {

    @XmlElement(name = "IDDespacho", required = true, type = Integer.class, nillable = true)
    protected Integer idDespacho;
    @XmlElement(name = "Consecutivo", required = true, type = Integer.class, nillable = true)
    protected Integer consecutivo;
    @XmlElement(name = "TipoDeEmpaque")
    protected String tipoDeEmpaque;
    @XmlElement(name = "ReferenciaCte")
    protected String referenciaCte;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "CantidadUnidades", required = true, type = Integer.class, nillable = true)
    protected Integer cantidadUnidades;
    @XmlElement(name = "PesoKilosTotalDetalle", required = true, type = Double.class, nillable = true)
    protected Double pesoKilosTotalDetalle;
    @XmlElement(name = "PesoKilosFacturadosTotalDetalle", required = true, type = Double.class, nillable = true)
    protected Double pesoKilosFacturadosTotalDetalle;
    @XmlElement(name = "PesoKilosUnitario", required = true, type = Double.class, nillable = true)
    protected Double pesoKilosUnitario;
    @XmlElement(name = "PesoKilosFacturadosUnitario", required = true, type = Double.class, nillable = true)
    protected Double pesoKilosFacturadosUnitario;
    @XmlElement(name = "LargoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer largoCmsUnitario;
    @XmlElement(name = "AnchoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer anchoCmsUnitario;
    @XmlElement(name = "AltoCmsUnitario", required = true, type = Integer.class, nillable = true)
    protected Integer altoCmsUnitario;
    @XmlElement(name = "PesoVolumenUnitario", required = true, type = Double.class, nillable = true)
    protected Double pesoVolumenUnitario;
    @XmlElement(name = "PesoVolumenTotalDetalle", required = true, type = Double.class, nillable = true)
    protected Double pesoVolumenTotalDetalle;
    @XmlElement(name = "ValorMercanciaUnitario", required = true, type = Double.class, nillable = true)
    protected Double valorMercanciaUnitario;
    @XmlElement(name = "ValorMercanciaTotalDetalle", required = true, type = Double.class, nillable = true)
    protected Double valorMercanciaTotalDetalle;
    @XmlElement(name = "PesoInfUnitario", required = true, type = Double.class, nillable = true)
    protected Double pesoInfUnitario;
    @XmlElement(name = "UnidadMedidaPesoInf", required = true, type = Integer.class, nillable = true)
    protected Integer unidadMedidaPesoInf;
    @XmlElement(name = "LargoInfUnitario", required = true, type = Double.class, nillable = true)
    protected Double largoInfUnitario;
    @XmlElement(name = "AnchoInfUnitario", required = true, type = Double.class, nillable = true)
    protected Double anchoInfUnitario;
    @XmlElement(name = "AltoInfUnitario", required = true, type = Double.class, nillable = true)
    protected Double altoInfUnitario;
    @XmlElement(name = "UnidadMedidaLongitudInf", required = true, type = Integer.class, nillable = true)
    protected Integer unidadMedidaLongitudInf;
    @XmlElement(name = "FechaHoraCreacion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCreacion;
    @XmlElement(name = "UsuarioCreacion")
    protected String usuarioCreacion;
    @XmlElement(name = "FechaHoraUltimaModificacion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraUltimaModificacion;
    @XmlElement(name = "UsuarioUltimaModificacion")
    protected String usuarioUltimaModificacion;

    /**
     * Gets the value of the idDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDespacho() {
        return idDespacho;
    }

    /**
     * Sets the value of the idDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDespacho(Integer value) {
        this.idDespacho = value;
    }

    /**
     * Gets the value of the consecutivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Sets the value of the consecutivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
    }

    /**
     * Gets the value of the tipoDeEmpaque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeEmpaque() {
        return tipoDeEmpaque;
    }

    /**
     * Sets the value of the tipoDeEmpaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeEmpaque(String value) {
        this.tipoDeEmpaque = value;
    }

    /**
     * Gets the value of the referenciaCte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCte() {
        return referenciaCte;
    }

    /**
     * Sets the value of the referenciaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCte(String value) {
        this.referenciaCte = value;
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
     * Gets the value of the cantidadUnidades property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadUnidades() {
        return cantidadUnidades;
    }

    /**
     * Sets the value of the cantidadUnidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadUnidades(Integer value) {
        this.cantidadUnidades = value;
    }

    /**
     * Gets the value of the pesoKilosTotalDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoKilosTotalDetalle() {
        return pesoKilosTotalDetalle;
    }

    /**
     * Sets the value of the pesoKilosTotalDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoKilosTotalDetalle(Double value) {
        this.pesoKilosTotalDetalle = value;
    }

    /**
     * Gets the value of the pesoKilosFacturadosTotalDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoKilosFacturadosTotalDetalle() {
        return pesoKilosFacturadosTotalDetalle;
    }

    /**
     * Sets the value of the pesoKilosFacturadosTotalDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoKilosFacturadosTotalDetalle(Double value) {
        this.pesoKilosFacturadosTotalDetalle = value;
    }

    /**
     * Gets the value of the pesoKilosUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoKilosUnitario() {
        return pesoKilosUnitario;
    }

    /**
     * Sets the value of the pesoKilosUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoKilosUnitario(Double value) {
        this.pesoKilosUnitario = value;
    }

    /**
     * Gets the value of the pesoKilosFacturadosUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoKilosFacturadosUnitario() {
        return pesoKilosFacturadosUnitario;
    }

    /**
     * Sets the value of the pesoKilosFacturadosUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoKilosFacturadosUnitario(Double value) {
        this.pesoKilosFacturadosUnitario = value;
    }

    /**
     * Gets the value of the largoCmsUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLargoCmsUnitario() {
        return largoCmsUnitario;
    }

    /**
     * Sets the value of the largoCmsUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLargoCmsUnitario(Integer value) {
        this.largoCmsUnitario = value;
    }

    /**
     * Gets the value of the anchoCmsUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchoCmsUnitario() {
        return anchoCmsUnitario;
    }

    /**
     * Sets the value of the anchoCmsUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchoCmsUnitario(Integer value) {
        this.anchoCmsUnitario = value;
    }

    /**
     * Gets the value of the altoCmsUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAltoCmsUnitario() {
        return altoCmsUnitario;
    }

    /**
     * Sets the value of the altoCmsUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAltoCmsUnitario(Integer value) {
        this.altoCmsUnitario = value;
    }

    /**
     * Gets the value of the pesoVolumenUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoVolumenUnitario() {
        return pesoVolumenUnitario;
    }

    /**
     * Sets the value of the pesoVolumenUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoVolumenUnitario(Double value) {
        this.pesoVolumenUnitario = value;
    }

    /**
     * Gets the value of the pesoVolumenTotalDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoVolumenTotalDetalle() {
        return pesoVolumenTotalDetalle;
    }

    /**
     * Sets the value of the pesoVolumenTotalDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoVolumenTotalDetalle(Double value) {
        this.pesoVolumenTotalDetalle = value;
    }

    /**
     * Gets the value of the valorMercanciaUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMercanciaUnitario() {
        return valorMercanciaUnitario;
    }

    /**
     * Sets the value of the valorMercanciaUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMercanciaUnitario(Double value) {
        this.valorMercanciaUnitario = value;
    }

    /**
     * Gets the value of the valorMercanciaTotalDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMercanciaTotalDetalle() {
        return valorMercanciaTotalDetalle;
    }

    /**
     * Sets the value of the valorMercanciaTotalDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMercanciaTotalDetalle(Double value) {
        this.valorMercanciaTotalDetalle = value;
    }

    /**
     * Gets the value of the pesoInfUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoInfUnitario() {
        return pesoInfUnitario;
    }

    /**
     * Sets the value of the pesoInfUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoInfUnitario(Double value) {
        this.pesoInfUnitario = value;
    }

    /**
     * Gets the value of the unidadMedidaPesoInf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnidadMedidaPesoInf() {
        return unidadMedidaPesoInf;
    }

    /**
     * Sets the value of the unidadMedidaPesoInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnidadMedidaPesoInf(Integer value) {
        this.unidadMedidaPesoInf = value;
    }

    /**
     * Gets the value of the largoInfUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLargoInfUnitario() {
        return largoInfUnitario;
    }

    /**
     * Sets the value of the largoInfUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLargoInfUnitario(Double value) {
        this.largoInfUnitario = value;
    }

    /**
     * Gets the value of the anchoInfUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnchoInfUnitario() {
        return anchoInfUnitario;
    }

    /**
     * Sets the value of the anchoInfUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnchoInfUnitario(Double value) {
        this.anchoInfUnitario = value;
    }

    /**
     * Gets the value of the altoInfUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltoInfUnitario() {
        return altoInfUnitario;
    }

    /**
     * Sets the value of the altoInfUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltoInfUnitario(Double value) {
        this.altoInfUnitario = value;
    }

    /**
     * Gets the value of the unidadMedidaLongitudInf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnidadMedidaLongitudInf() {
        return unidadMedidaLongitudInf;
    }

    /**
     * Sets the value of the unidadMedidaLongitudInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnidadMedidaLongitudInf(Integer value) {
        this.unidadMedidaLongitudInf = value;
    }

    /**
     * Gets the value of the fechaHoraCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * Sets the value of the fechaHoraCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCreacion(XMLGregorianCalendar value) {
        this.fechaHoraCreacion = value;
    }

    /**
     * Gets the value of the usuarioCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * Sets the value of the usuarioCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCreacion(String value) {
        this.usuarioCreacion = value;
    }

    /**
     * Gets the value of the fechaHoraUltimaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraUltimaModificacion() {
        return fechaHoraUltimaModificacion;
    }

    /**
     * Sets the value of the fechaHoraUltimaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraUltimaModificacion(XMLGregorianCalendar value) {
        this.fechaHoraUltimaModificacion = value;
    }

    /**
     * Gets the value of the usuarioUltimaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioUltimaModificacion() {
        return usuarioUltimaModificacion;
    }

    /**
     * Sets the value of the usuarioUltimaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioUltimaModificacion(String value) {
        this.usuarioUltimaModificacion = value;
    }

}
