
package clientes.rafael;

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
@WebServiceClient(name = "WSRafael", targetNamespace = "http://ws/", wsdlLocation = "file:/home/junior/Downloads/WSRafael%20(1).xml")
public class WSRafael_Service
    extends Service
{

    private final static URL WSRAFAEL_WSDL_LOCATION;
    private final static WebServiceException WSRAFAEL_EXCEPTION;
    private final static QName WSRAFAEL_QNAME = new QName("http://ws/", "WSRafael");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/junior/Downloads/WSRafael%20(1).xml");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSRAFAEL_WSDL_LOCATION = url;
        WSRAFAEL_EXCEPTION = e;
    }

    public WSRafael_Service() {
        super(__getWsdlLocation(), WSRAFAEL_QNAME);
    }

    public WSRafael_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSRAFAEL_QNAME, features);
    }

    public WSRafael_Service(URL wsdlLocation) {
        super(wsdlLocation, WSRAFAEL_QNAME);
    }

    public WSRafael_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSRAFAEL_QNAME, features);
    }

    public WSRafael_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSRafael_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSRafael
     */
    @WebEndpoint(name = "WSRafaelPort")
    public WSRafael getWSRafaelPort() {
        return super.getPort(new QName("http://ws/", "WSRafaelPort"), WSRafael.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSRafael
     */
    @WebEndpoint(name = "WSRafaelPort")
    public WSRafael getWSRafaelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WSRafaelPort"), WSRafael.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSRAFAEL_EXCEPTION!= null) {
            throw WSRAFAEL_EXCEPTION;
        }
        return WSRAFAEL_WSDL_LOCATION;
    }

}
