package servlets;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;
import service.RestaurantsServiceImp;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/11/13
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/service/*")
public class RestaurantsServlet extends CXFNonSpringServlet {
    @Override
    protected void loadBus(ServletConfig sc){
        super.loadBus(sc);
        Bus bus = getBus();
        BusFactory.setDefaultBus(bus);
        Endpoint.publish("/RestaurantsService", new RestaurantsServiceImp());
    }
}
