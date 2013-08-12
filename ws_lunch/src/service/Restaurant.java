package service;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/11/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Restaurant {
    private Menu menu;
    private String name;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
