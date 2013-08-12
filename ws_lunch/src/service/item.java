package service;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/11/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private String name;
    private String price;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
