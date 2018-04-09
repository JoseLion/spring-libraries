package ec.com.levelap.tcc.wsdl.clientes;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2018-04-06T18:53:47.739-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "InformacionRemesas", 
                  wsdlLocation = "http://clientes.tcc.com.co/servicios/InformacionRemesas.asmx?WSDL",
                  targetNamespace = "http://clientes.tcc.com.co/") 
public class InformacionRemesas extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://clientes.tcc.com.co/", "InformacionRemesas");
    public final static QName InformacionRemesasSoap = new QName("http://clientes.tcc.com.co/", "InformacionRemesasSoap");
    public final static QName InformacionRemesasSoap12 = new QName("http://clientes.tcc.com.co/", "InformacionRemesasSoap12");
    public final static QName InformacionRemesasHttpGet = new QName("http://clientes.tcc.com.co/", "InformacionRemesasHttpGet");
    static {
        URL url = null;
        try {
            url = new URL("http://clientes.tcc.com.co/servicios/InformacionRemesas.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InformacionRemesas.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://clientes.tcc.com.co/servicios/InformacionRemesas.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public InformacionRemesas(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InformacionRemesas(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InformacionRemesas() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InformacionRemesas(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InformacionRemesas(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InformacionRemesas(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns InformacionRemesasSoap
     */
    @WebEndpoint(name = "InformacionRemesasSoap")
    public InformacionRemesasSoap getInformacionRemesasSoap() {
        return super.getPort(InformacionRemesasSoap, InformacionRemesasSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InformacionRemesasSoap
     */
    @WebEndpoint(name = "InformacionRemesasSoap")
    public InformacionRemesasSoap getInformacionRemesasSoap(WebServiceFeature... features) {
        return super.getPort(InformacionRemesasSoap, InformacionRemesasSoap.class, features);
    }
    /**
     *
     * @return
     *     returns InformacionRemesasSoap
     */
    @WebEndpoint(name = "InformacionRemesasSoap12")
    public InformacionRemesasSoap getInformacionRemesasSoap12() {
        return super.getPort(InformacionRemesasSoap12, InformacionRemesasSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InformacionRemesasSoap
     */
    @WebEndpoint(name = "InformacionRemesasSoap12")
    public InformacionRemesasSoap getInformacionRemesasSoap12(WebServiceFeature... features) {
        return super.getPort(InformacionRemesasSoap12, InformacionRemesasSoap.class, features);
    }
    /**
     *
     * @return
     *     returns InformacionRemesasHttpGet
     */
    @WebEndpoint(name = "InformacionRemesasHttpGet")
    public InformacionRemesasHttpGet getInformacionRemesasHttpGet() {
        return super.getPort(InformacionRemesasHttpGet, InformacionRemesasHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InformacionRemesasHttpGet
     */
    @WebEndpoint(name = "InformacionRemesasHttpGet")
    public InformacionRemesasHttpGet getInformacionRemesasHttpGet(WebServiceFeature... features) {
        return super.getPort(InformacionRemesasHttpGet, InformacionRemesasHttpGet.class, features);
    }

}
