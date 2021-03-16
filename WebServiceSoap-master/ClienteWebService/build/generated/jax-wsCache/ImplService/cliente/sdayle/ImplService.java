
package cliente.sdayle;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImplService", targetNamespace = "http://inter.org/", wsdlLocation = "http://172.16.105.206:8080/WSWilliamSdayle/ImplService?wsdl")
public class ImplService
    extends Service
{

    private final static URL IMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMPLSERVICE_EXCEPTION;
    private final static QName IMPLSERVICE_QNAME = new QName("http://inter.org/", "ImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.16.105.206:8080/WSWilliamSdayle/ImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMPLSERVICE_WSDL_LOCATION = url;
        IMPLSERVICE_EXCEPTION = e;
    }

    public ImplService() {
        super(__getWsdlLocation(), IMPLSERVICE_QNAME);
    }

    public ImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMPLSERVICE_QNAME, features);
    }

    public ImplService(URL wsdlLocation) {
        super(wsdlLocation, IMPLSERVICE_QNAME);
    }

    public ImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMPLSERVICE_QNAME, features);
    }

    public ImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Servico
     */
    @WebEndpoint(name = "ImplPort")
    public Servico getImplPort() {
        return super.getPort(new QName("http://inter.org/", "ImplPort"), Servico.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Servico
     */
    @WebEndpoint(name = "ImplPort")
    public Servico getImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://inter.org/", "ImplPort"), Servico.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMPLSERVICE_EXCEPTION!= null) {
            throw IMPLSERVICE_EXCEPTION;
        }
        return IMPLSERVICE_WSDL_LOCATION;
    }

}