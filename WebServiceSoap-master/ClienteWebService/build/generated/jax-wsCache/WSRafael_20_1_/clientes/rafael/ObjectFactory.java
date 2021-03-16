
package clientes.rafael;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientes.rafael package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Correntista_QNAME = new QName("http://ws/", "correntista");
    private final static QName _Ted_QNAME = new QName("http://ws/", "ted");
    private final static QName _TedResponse_QNAME = new QName("http://ws/", "tedResponse");
    private final static QName _CorrentistaResponse_QNAME = new QName("http://ws/", "correntistaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientes.rafael
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Correntista }
     * 
     */
    public Correntista createCorrentista() {
        return new Correntista();
    }

    /**
     * Create an instance of {@link Ted }
     * 
     */
    public Ted createTed() {
        return new Ted();
    }

    /**
     * Create an instance of {@link TedResponse }
     * 
     */
    public TedResponse createTedResponse() {
        return new TedResponse();
    }

    /**
     * Create an instance of {@link CorrentistaResponse }
     * 
     */
    public CorrentistaResponse createCorrentistaResponse() {
        return new CorrentistaResponse();
    }

    /**
     * Create an instance of {@link Co }
     * 
     */
    public Co createCo() {
        return new Co();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Correntista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "correntista")
    public JAXBElement<Correntista> createCorrentista(Correntista value) {
        return new JAXBElement<Correntista>(_Correntista_QNAME, Correntista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ted")
    public JAXBElement<Ted> createTed(Ted value) {
        return new JAXBElement<Ted>(_Ted_QNAME, Ted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tedResponse")
    public JAXBElement<TedResponse> createTedResponse(TedResponse value) {
        return new JAXBElement<TedResponse>(_TedResponse_QNAME, TedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrentistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "correntistaResponse")
    public JAXBElement<CorrentistaResponse> createCorrentistaResponse(CorrentistaResponse value) {
        return new JAXBElement<CorrentistaResponse>(_CorrentistaResponse_QNAME, CorrentistaResponse.class, null, value);
    }

}
