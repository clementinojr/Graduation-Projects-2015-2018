
package clientes.eduardo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientes.eduardo package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientes.eduardo
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
     * Create an instance of {@link Correntista }
     * 
     */
    public Correntista createCorrentista() {
        return new Correntista();
    }

    /**
     * Create an instance of {@link CorrentistaResponse }
     * 
     */
    public CorrentistaResponse createCorrentistaResponse() {
        return new CorrentistaResponse();
    }

    /**
     * Create an instance of {@link ObjectC }
     * 
     */
    public ObjectC createObjectC() {
        return new ObjectC();
    }

}
