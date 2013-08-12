package service;

import org.springframework.core.annotation.Order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/11/13
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(name = "RestaurantsService", targetNamespace = "http://localhost/jaxws/RestaurantsService")
public interface Restaurants {
    @WebMethod(operationName = "getRestaurants")
    public @WebResult(name= "Restaurants") List<Restaurant> getRestaurants();

    public void sendUserOrder(@WebParam(name="UserOrder") UserOrder order);
}
