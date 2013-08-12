
package MenuItemRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the MenuItemRequest package.
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

    private final static QName _RestaurantId_QNAME = new QName("http://local8080/soap/jwatson/lunch/restaurant", "restaurantId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: MenuItemRequest
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
     * Create an instance of {@link GetAllMenuItems }
     *
     */
    public GetAllMenuItems createGetAllMenuItems() {
        return new GetAllMenuItems();
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
    @XmlElementDecl(namespace = "http://local8080/soap/jwatson/lunch/restaurant", name = "restaurantId")
    public JAXBElement<BigInteger> createRestaurantId(BigInteger value) {
        return new JAXBElement<BigInteger>(_RestaurantId_QNAME, BigInteger.class, null, value);
    }

}
