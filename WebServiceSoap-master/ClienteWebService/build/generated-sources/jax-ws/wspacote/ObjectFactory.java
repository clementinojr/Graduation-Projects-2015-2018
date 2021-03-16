
package wspacote;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wspacote package. 
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

    private final static QName _ClassNotFoundException_QNAME = new QName("http://wsPacote/", "ClassNotFoundException");
    private final static QName _CorrentistaOp_QNAME = new QName("http://wsPacote/", "correntistaOp");
    private final static QName _Hello_QNAME = new QName("http://wsPacote/", "hello");
    private final static QName _SQLException_QNAME = new QName("http://wsPacote/", "SQLException");
    private final static QName _CorrentistaOpResponse_QNAME = new QName("http://wsPacote/", "correntistaOpResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://wsPacote/", "helloResponse");
    private final static QName _Ted_QNAME = new QName("http://wsPacote/", "ted");
    private final static QName _TedResponse_QNAME = new QName("http://wsPacote/", "tedResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wspacote
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link CorrentistaOpResponse }
     * 
     */
    public CorrentistaOpResponse createCorrentistaOpResponse() {
        return new CorrentistaOpResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link CorrentistaOp }
     * 
     */
    public CorrentistaOp createCorrentistaOp() {
        return new CorrentistaOp();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link ObjetoC }
     * 
     */
    public ObjetoC createObjetoC() {
        return new ObjetoC();
    }

    /**
     * Create an instance of {@link SqlException }
     * 
     */
    public SqlException createSqlException() {
        return new SqlException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrentistaOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "correntistaOp")
    public JAXBElement<CorrentistaOp> createCorrentistaOp(CorrentistaOp value) {
        return new JAXBElement<CorrentistaOp>(_CorrentistaOp_QNAME, CorrentistaOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrentistaOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "correntistaOpResponse")
    public JAXBElement<CorrentistaOpResponse> createCorrentistaOpResponse(CorrentistaOpResponse value) {
        return new JAXBElement<CorrentistaOpResponse>(_CorrentistaOpResponse_QNAME, CorrentistaOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "ted")
    public JAXBElement<Ted> createTed(Ted value) {
        return new JAXBElement<Ted>(_Ted_QNAME, Ted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPacote/", name = "tedResponse")
    public JAXBElement<TedResponse> createTedResponse(TedResponse value) {
        return new JAXBElement<TedResponse>(_TedResponse_QNAME, TedResponse.class, null, value);
    }

}
