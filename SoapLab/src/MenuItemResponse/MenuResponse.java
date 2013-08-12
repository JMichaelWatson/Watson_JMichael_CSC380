
package MenuItemResponse;

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
 *         &lt;element ref="{http://local8080/soap/jwatson/lunch/restaurant}menu"/>
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
    "menu"
})
@XmlRootElement(name = "menuResponse", namespace = "http://local8080/soap/jwatson/lunch/restaurant")
public class MenuResponse {

    @XmlElement(namespace = "http://local8080/soap/jwatson/lunch/restaurant", required = true)
    protected Menu menu;

    /**
     * Gets the value of the menu property.
     * 
     * @return
     *     possible object is
     *     {@link Menu }
     *
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Sets the value of the menu property.
     *
     * @param value
     *     allowed object is
     *     {@link Menu }
     *     
     */
    public void setMenu(Menu value) {
        this.menu = value;
    }

}
