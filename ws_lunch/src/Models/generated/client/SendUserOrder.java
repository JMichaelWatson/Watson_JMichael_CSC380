
package Models.generated.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendUserOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendUserOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserOrder" type="{http://localhost/jaxws/RestaurantsService}userOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendUserOrder", propOrder = {
    "userOrder"
})
public class SendUserOrder {

    @XmlElement(name = "UserOrder")
    protected UserOrder userOrder;

    /**
     * Gets the value of the userOrder property.
     * 
     * @return
     *     possible object is
     *     {@link UserOrder }
     *     
     */
    public UserOrder getUserOrder() {
        return userOrder;
    }

    /**
     * Sets the value of the userOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOrder }
     *     
     */
    public void setUserOrder(UserOrder value) {
        this.userOrder = value;
    }

}
