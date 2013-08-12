
package MenuItemResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the MenuItemResponse package. 
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

    private final static QName _Id_QNAME = new QName("http://local8080/soap/jwatson/lunch/restaurant", "id");
    private final static QName _Name_QNAME = new QName("http://local8080/soap/jwatson/lunch/restaurant", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: MenuItemResponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link MenuResponse }
     * 
     */
    public MenuResponse createMenuResponse() {
        return new MenuResponse();
    }

    /**
     * Create an instance of {@link Menu }
     *
     */
    public Menu createMenu() {
        return new Menu();
    }

    /**
     * Create an instance of {@link Envelope }
     *
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://local8080/soap/jwatson/lunch/restaurant", name = "id")
    public JAXBElement<BigInteger> createId(BigInteger value) {
        return new JAXBElement<BigInteger>(_Id_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local8080/soap/jwatson/lunch/restaurant", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

}
