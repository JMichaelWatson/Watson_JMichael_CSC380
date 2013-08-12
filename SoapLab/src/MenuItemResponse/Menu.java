
package MenuItemResponse;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://local8080/soap/jwatson/lunch/restaurant}id"/>
 *         &lt;element ref="{http://local8080/soap/jwatson/lunch/restaurant}name"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idOrName"
})
@XmlRootElement(name = "menu", namespace = "http://local8080/soap/jwatson/lunch/restaurant")
public class Menu {

    @XmlElements({
        @XmlElement(name = "id", namespace = "http://local8080/soap/jwatson/lunch/restaurant", type = BigInteger.class),
        @XmlElement(name = "name", namespace = "http://local8080/soap/jwatson/lunch/restaurant", type = String.class)
    })
    protected List<Serializable> idOrName;

    /**
     * Gets the value of the idOrName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idOrName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdOrName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.math.BigInteger }
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getIdOrName() {
        if (idOrName == null) {
            idOrName = new ArrayList<Serializable>();
        }
        return this.idOrName;
    }

}
