package Models.generated.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-08-12T00:25:17.160-06:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://localhost/jaxws/RestaurantsService", name = "RestaurantsService")
@XmlSeeAlso({ObjectFactory.class})
public interface RestaurantsService {

    @WebResult(name = "Restaurants", targetNamespace = "")
    @RequestWrapper(localName = "getRestaurants", targetNamespace = "http://localhost/jaxws/RestaurantsService", className = "Models.generated.client.GetRestaurants")
    @WebMethod
    @ResponseWrapper(localName = "getRestaurantsResponse", targetNamespace = "http://localhost/jaxws/RestaurantsService", className = "Models.generated.client.GetRestaurantsResponse")
    public java.util.List<Models.generated.client.Restaurant> getRestaurants();

    @RequestWrapper(localName = "sendUserOrder", targetNamespace = "http://localhost/jaxws/RestaurantsService", className = "Models.generated.client.SendUserOrder")
    @WebMethod
    @ResponseWrapper(localName = "sendUserOrderResponse", targetNamespace = "http://localhost/jaxws/RestaurantsService", className = "Models.generated.client.SendUserOrderResponse")
    public void sendUserOrder(
        @WebParam(name = "UserOrder", targetNamespace = "")
        Models.generated.client.UserOrder userOrder
    );
}
