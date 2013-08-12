
package MenuItemRequest;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://local8080/soap/jwatson/lunch/restaurant}getAllMenuItems"/>
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
    "getAllMenuItems"
})
@XmlRootElement(name = "Body", namespace = "http://www.w3.org/2001/12/soap-envelope")
public class Body {

    @XmlElement(namespace = "http://local8080/soap/jwatson/lunch/restaurant", required = true)
    protected GetAllMenuItems getAllMenuItems;

    /**
     * Gets the value of the getAllMenuItems property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllMenuItems }
     *     
     */
    public GetAllMenuItems getGetAllMenuItems() {
        return getAllMenuItems;
    }

    /**
     * Sets the value of the getAllMenuItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllMenuItems }
     *     
     */
    public void setGetAllMenuItems(GetAllMenuItems value) {
        this.getAllMenuItems = value;
    }

}
