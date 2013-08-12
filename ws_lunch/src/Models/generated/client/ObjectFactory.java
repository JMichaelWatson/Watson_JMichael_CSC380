
package Models.generated.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Models.generated.client package. 
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

    private final static QName _GetRestaurantsResponse_QNAME = new QName("http://localhost/jaxws/RestaurantsService", "getRestaurantsResponse");
    private final static QName _SendUserOrder_QNAME = new QName("http://localhost/jaxws/RestaurantsService", "sendUserOrder");
    private final static QName _SendUserOrderResponse_QNAME = new QName("http://localhost/jaxws/RestaurantsService", "sendUserOrderResponse");
    private final static QName _GetRestaurants_QNAME = new QName("http://localhost/jaxws/RestaurantsService", "getRestaurants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Models.generated.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendUserOrderResponse }
     * 
     */
    public SendUserOrderResponse createSendUserOrderResponse() {
        return new SendUserOrderResponse();
    }

    /**
     * Create an instance of {@link GetRestaurants }
     * 
     */
    public GetRestaurants createGetRestaurants() {
        return new GetRestaurants();
    }

    /**
     * Create an instance of {@link GetRestaurantsResponse }
     * 
     */
    public GetRestaurantsResponse createGetRestaurantsResponse() {
        return new GetRestaurantsResponse();
    }

    /**
     * Create an instance of {@link SendUserOrder }
     * 
     */
    public SendUserOrder createSendUserOrder() {
        return new SendUserOrder();
    }

    /**
     * Create an instance of {@link UserOrder }
     * 
     */
    public UserOrder createUserOrder() {
        return new UserOrder();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Menu }
     * 
     */
    public Menu createMenu() {
        return new Menu();
    }

    /**
     * Create an instance of {@link Restaurant }
     * 
     */
    public Restaurant createRestaurant() {
        return new Restaurant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestaurantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/jaxws/RestaurantsService", name = "getRestaurantsResponse")
    public JAXBElement<GetRestaurantsResponse> createGetRestaurantsResponse(GetRestaurantsResponse value) {
        return new JAXBElement<GetRestaurantsResponse>(_GetRestaurantsResponse_QNAME, GetRestaurantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendUserOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/jaxws/RestaurantsService", name = "sendUserOrder")
    public JAXBElement<SendUserOrder> createSendUserOrder(SendUserOrder value) {
        return new JAXBElement<SendUserOrder>(_SendUserOrder_QNAME, SendUserOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendUserOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/jaxws/RestaurantsService", name = "sendUserOrderResponse")
    public JAXBElement<SendUserOrderResponse> createSendUserOrderResponse(SendUserOrderResponse value) {
        return new JAXBElement<SendUserOrderResponse>(_SendUserOrderResponse_QNAME, SendUserOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestaurants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/jaxws/RestaurantsService", name = "getRestaurants")
    public JAXBElement<GetRestaurants> createGetRestaurants(GetRestaurants value) {
        return new JAXBElement<GetRestaurants>(_GetRestaurants_QNAME, GetRestaurants.class, null, value);
    }

}
