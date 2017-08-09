
package ec.com.levelap.tcc.wsdl.clientes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpSalida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remesa" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fecharemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nombremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direccionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefonoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ciudadorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nombredestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direcciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefonodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ciudaddestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totalunidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="entregaenbodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fechaestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="digitalizada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numeroReferenciaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unidadnegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="codigocuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unidad" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tipounidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tipoempaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dicecontener" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="kilosreales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pesovolumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="codigobarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="documentosreferencia" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tipodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numerodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechadocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="repuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tpSalida", propOrder = {
    "remesa",
    "repuesta",
    "mensaje"
})
public class TpSalida {

    protected List<TpSalida.Remesa> remesa;
    protected String repuesta;
    protected String mensaje;

    /**
     * Gets the value of the remesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpSalida.Remesa }
     * 
     * 
     */
    public List<TpSalida.Remesa> getRemesa() {
        if (remesa == null) {
            remesa = new ArrayList<TpSalida.Remesa>();
        }
        return this.remesa;
    }

    /**
     * Gets the value of the repuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepuesta() {
        return repuesta;
    }

    /**
     * Sets the value of the repuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepuesta(String value) {
        this.repuesta = value;
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
     *         &lt;element name="numeroremesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fecharemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nombremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direccionremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefonoremitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ciudadorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nombredestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direcciondestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefonodestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ciudaddestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totalunidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="entregaenbodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fechaestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="digitalizada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numeroReferenciaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unidadnegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="codigocuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unidad" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tipounidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tipoempaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dicecontener" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="kilosreales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pesovolumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="codigobarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="documentosreferencia" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tipodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numerodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fechadocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "numeroremesa",
        "fecharemesa",
        "nombremitente",
        "direccionremitente",
        "telefonoremitente",
        "ciudadorigen",
        "nombredestinatario",
        "direcciondestinatario",
        "telefonodestinatario",
        "ciudaddestino",
        "totalunidades",
        "producto",
        "entregaenbodega",
        "estado",
        "fechaestado",
        "observaciones",
        "digitalizada",
        "numeroReferenciaCliente",
        "unidadnegocio",
        "codigocuenta",
        "unidad",
        "documentosreferencia"
    })
    public static class Remesa {

        protected String numeroremesa;
        protected String fecharemesa;
        protected String nombremitente;
        protected String direccionremitente;
        protected String telefonoremitente;
        protected String ciudadorigen;
        protected String nombredestinatario;
        protected String direcciondestinatario;
        protected String telefonodestinatario;
        protected String ciudaddestino;
        protected String totalunidades;
        protected String producto;
        protected String entregaenbodega;
        protected String estado;
        protected String fechaestado;
        protected String observaciones;
        protected String digitalizada;
        protected String numeroReferenciaCliente;
        protected String unidadnegocio;
        protected String codigocuenta;
        protected List<TpSalida.Remesa.Unidad> unidad;
        protected List<TpSalida.Remesa.Documentosreferencia> documentosreferencia;

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
         * Gets the value of the fecharemesa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecharemesa() {
            return fecharemesa;
        }

        /**
         * Sets the value of the fecharemesa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecharemesa(String value) {
            this.fecharemesa = value;
        }

        /**
         * Gets the value of the nombremitente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombremitente() {
            return nombremitente;
        }

        /**
         * Sets the value of the nombremitente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombremitente(String value) {
            this.nombremitente = value;
        }

        /**
         * Gets the value of the direccionremitente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccionremitente() {
            return direccionremitente;
        }

        /**
         * Sets the value of the direccionremitente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccionremitente(String value) {
            this.direccionremitente = value;
        }

        /**
         * Gets the value of the telefonoremitente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefonoremitente() {
            return telefonoremitente;
        }

        /**
         * Sets the value of the telefonoremitente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefonoremitente(String value) {
            this.telefonoremitente = value;
        }

        /**
         * Gets the value of the ciudadorigen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiudadorigen() {
            return ciudadorigen;
        }

        /**
         * Sets the value of the ciudadorigen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiudadorigen(String value) {
            this.ciudadorigen = value;
        }

        /**
         * Gets the value of the nombredestinatario property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombredestinatario() {
            return nombredestinatario;
        }

        /**
         * Sets the value of the nombredestinatario property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombredestinatario(String value) {
            this.nombredestinatario = value;
        }

        /**
         * Gets the value of the direcciondestinatario property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirecciondestinatario() {
            return direcciondestinatario;
        }

        /**
         * Sets the value of the direcciondestinatario property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirecciondestinatario(String value) {
            this.direcciondestinatario = value;
        }

        /**
         * Gets the value of the telefonodestinatario property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefonodestinatario() {
            return telefonodestinatario;
        }

        /**
         * Sets the value of the telefonodestinatario property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefonodestinatario(String value) {
            this.telefonodestinatario = value;
        }

        /**
         * Gets the value of the ciudaddestino property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiudaddestino() {
            return ciudaddestino;
        }

        /**
         * Sets the value of the ciudaddestino property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiudaddestino(String value) {
            this.ciudaddestino = value;
        }

        /**
         * Gets the value of the totalunidades property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalunidades() {
            return totalunidades;
        }

        /**
         * Sets the value of the totalunidades property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalunidades(String value) {
            this.totalunidades = value;
        }

        /**
         * Gets the value of the producto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProducto() {
            return producto;
        }

        /**
         * Sets the value of the producto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProducto(String value) {
            this.producto = value;
        }

        /**
         * Gets the value of the entregaenbodega property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntregaenbodega() {
            return entregaenbodega;
        }

        /**
         * Sets the value of the entregaenbodega property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntregaenbodega(String value) {
            this.entregaenbodega = value;
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
         * Gets the value of the fechaestado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaestado() {
            return fechaestado;
        }

        /**
         * Sets the value of the fechaestado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaestado(String value) {
            this.fechaestado = value;
        }

        /**
         * Gets the value of the observaciones property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObservaciones() {
            return observaciones;
        }

        /**
         * Sets the value of the observaciones property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObservaciones(String value) {
            this.observaciones = value;
        }

        /**
         * Gets the value of the digitalizada property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDigitalizada() {
            return digitalizada;
        }

        /**
         * Sets the value of the digitalizada property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDigitalizada(String value) {
            this.digitalizada = value;
        }

        /**
         * Gets the value of the numeroReferenciaCliente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroReferenciaCliente() {
            return numeroReferenciaCliente;
        }

        /**
         * Sets the value of the numeroReferenciaCliente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroReferenciaCliente(String value) {
            this.numeroReferenciaCliente = value;
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

        /**
         * Gets the value of the codigocuenta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigocuenta() {
            return codigocuenta;
        }

        /**
         * Sets the value of the codigocuenta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigocuenta(String value) {
            this.codigocuenta = value;
        }

        /**
         * Gets the value of the unidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TpSalida.Remesa.Unidad }
         * 
         * 
         */
        public List<TpSalida.Remesa.Unidad> getUnidad() {
            if (unidad == null) {
                unidad = new ArrayList<TpSalida.Remesa.Unidad>();
            }
            return this.unidad;
        }

        /**
         * Gets the value of the documentosreferencia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentosreferencia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentosreferencia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TpSalida.Remesa.Documentosreferencia }
         * 
         * 
         */
        public List<TpSalida.Remesa.Documentosreferencia> getDocumentosreferencia() {
            if (documentosreferencia == null) {
                documentosreferencia = new ArrayList<TpSalida.Remesa.Documentosreferencia>();
            }
            return this.documentosreferencia;
        }


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
         *         &lt;element name="tipodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numerodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fechadocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "tipodocumento",
            "numerodocumento",
            "fechadocumento"
        })
        public static class Documentosreferencia {

            protected String tipodocumento;
            protected String numerodocumento;
            protected String fechadocumento;

            /**
             * Gets the value of the tipodocumento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipodocumento() {
                return tipodocumento;
            }

            /**
             * Sets the value of the tipodocumento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipodocumento(String value) {
                this.tipodocumento = value;
            }

            /**
             * Gets the value of the numerodocumento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumerodocumento() {
                return numerodocumento;
            }

            /**
             * Sets the value of the numerodocumento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumerodocumento(String value) {
                this.numerodocumento = value;
            }

            /**
             * Gets the value of the fechadocumento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechadocumento() {
                return fechadocumento;
            }

            /**
             * Sets the value of the fechadocumento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechadocumento(String value) {
                this.fechadocumento = value;
            }

        }


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
         *         &lt;element name="tipounidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tipoempaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dicecontener" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="kilosreales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pesovolumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="codigobarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "tipounidad",
            "tipoempaque",
            "dicecontener",
            "kilosreales",
            "pesovolumen",
            "codigobarras"
        })
        public static class Unidad {

            protected String tipounidad;
            protected String tipoempaque;
            protected String dicecontener;
            protected String kilosreales;
            protected String pesovolumen;
            protected String codigobarras;

            /**
             * Gets the value of the tipounidad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipounidad() {
                return tipounidad;
            }

            /**
             * Sets the value of the tipounidad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipounidad(String value) {
                this.tipounidad = value;
            }

            /**
             * Gets the value of the tipoempaque property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoempaque() {
                return tipoempaque;
            }

            /**
             * Sets the value of the tipoempaque property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoempaque(String value) {
                this.tipoempaque = value;
            }

            /**
             * Gets the value of the dicecontener property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDicecontener() {
                return dicecontener;
            }

            /**
             * Sets the value of the dicecontener property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDicecontener(String value) {
                this.dicecontener = value;
            }

            /**
             * Gets the value of the kilosreales property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKilosreales() {
                return kilosreales;
            }

            /**
             * Sets the value of the kilosreales property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKilosreales(String value) {
                this.kilosreales = value;
            }

            /**
             * Gets the value of the pesovolumen property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPesovolumen() {
                return pesovolumen;
            }

            /**
             * Sets the value of the pesovolumen property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPesovolumen(String value) {
                this.pesovolumen = value;
            }

            /**
             * Gets the value of the codigobarras property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigobarras() {
                return codigobarras;
            }

            /**
             * Sets the value of the codigobarras property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigobarras(String value) {
                this.codigobarras = value;
            }

        }

    }

}
