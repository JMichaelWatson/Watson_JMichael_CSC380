
package MenuItemRequest;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://local8080/soap/jwatson/lunch/restaurant}restaurantId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "restaurantId"
})
@XmlRootElement(name = "getAllMenuItems", namespace = "http://local8080/soap/jwatson/lunch/restaurant")
public class GetAllMenuItems {

    @XmlElement(namespace = "http://local8080/soap/jwatson/lunch/restaurant", required = true)
    protected BigInteger restaurantId;

    /**
     * Gets the value of the restaurantId property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getRestaurantId() {
        return restaurantId;
    }

    /**
     * Sets the value of the restaurantId property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setRestaurantId(BigInteger value) {
        this.restaurantId = value;
    }

}
