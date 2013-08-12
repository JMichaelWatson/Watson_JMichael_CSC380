package Models.generated.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-08-12T00:25:17.169-06:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "RestaurantsServiceImpService", 
                  wsdlLocation = "file:/C:/Users/Michael/School/Service Oriented Arc/Git/Watson_JMichael_CSC380/ws_lunch/src/Models/generated/client/RestaurantsService.wsdl",
                  targetNamespace = "http://service/") 
public class RestaurantsServiceImpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service/", "RestaurantsServiceImpService");
    public final static QName RestaurantsServiceImpPort = new QName("http://service/", "RestaurantsServiceImpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Michael/School/Service Oriented Arc/Git/Watson_JMichael_CSC380/ws_lunch/src/Models/generated/client/RestaurantsService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RestaurantsServiceImpService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Michael/School/Service Oriented Arc/Git/Watson_JMichael_CSC380/ws_lunch/src/Models/generated/client/RestaurantsService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RestaurantsServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RestaurantsServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantsServiceImpService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RestaurantsServiceImpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RestaurantsServiceImpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RestaurantsServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RestaurantsService
     */
    @WebEndpoint(name = "RestaurantsServiceImpPort")
    public RestaurantsService getRestaurantsServiceImpPort() {
        return super.getPort(RestaurantsServiceImpPort, RestaurantsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RestaurantsService
     */
    @WebEndpoint(name = "RestaurantsServiceImpPort")
    public RestaurantsService getRestaurantsServiceImpPort(WebServiceFeature... features) {
        return super.getPort(RestaurantsServiceImpPort, RestaurantsService.class, features);
    }

}