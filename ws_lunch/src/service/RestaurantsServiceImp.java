package service;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/11/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class RestaurantsServiceImp implements Restaurants {

    private static final List<Restaurant> RESTAURANTS;

    static {
        RESTAURANTS = new ArrayList<Restaurant>();
        Restaurant rest1 = new Restaurant();
        rest1.setName("Happy Place");
        Menu menu1 = new Menu();
        Item item1 = new Item();
        item1.setName("Pizza");
        item1.setPrice("$5.00");
        item1.setDescription("Yummy Pizza.");
        Item item2 = new Item();
        item2.setName("Hot Dog");
        item2.setPrice("$2.50");
        item2.setDescription("Get your HOTDOGS!");
        List<Item> items1 = new ArrayList<Item>();
        items1.add(item1);
        items1.add(item2);
        menu1.setItems(items1);
        rest1.setMenu(menu1);
        RESTAURANTS.add(rest1);
        Restaurant rest2 = new Restaurant();
        rest2.setName("Go-Go-Farm");
        Menu menu2 = new Menu();
        Item item3 = new Item();
        item3.setName("Steak");
        item3.setPrice("$25.00");
        item3.setDescription("The best Steak in the WORLD.");
        Item item4 = new Item();
        item4.setName("Raw Chicken");
        item4.setPrice("$55.00");
        item4.setDescription("Still clucking when you take that first bite.");
        List<Item> items2 = new ArrayList<Item>();
        items2.add(item3);
        items2.add(item4);
        menu2.setItems(items2);
        rest2.setMenu(menu2);
        RESTAURANTS.add(rest2);


    }

    @Override
    public List<Restaurant> getRestaurants() {
        return RESTAURANTS;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendUserOrder(@WebParam(name = "UserOrder") UserOrder order) {
        System.out.println("Order Form.....");
        System.out.println(order.getName());
        System.out.println(order.getRestaurant());
        System.out.println(order.getItem());

    }
}
