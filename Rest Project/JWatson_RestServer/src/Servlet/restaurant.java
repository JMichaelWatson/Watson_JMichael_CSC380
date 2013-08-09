package Servlet;

import Models.Item;
import Models.Menu;
import Models.Restaurant;
import Models.Restaurants;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/1/13
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/restaurants")
public class restaurant extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Order Received.......");
        JAXBContext jc = null;
        String path = "Models";
        try {
            jc = JAXBContext.newInstance(path);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            InputStream inputStream = request.getInputStream();
            Restaurants restaurant = (Restaurants) unmarshaller.unmarshal(inputStream);
            if(restaurant != null){
                System.out.println("Name: " + restaurant.getRestaurant().get(0).getName());
                System.out.println("Meal: " + restaurant.getRestaurant().get(0).getMenu().getItem().get(0).getName());
            }

        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Client Connecting to server................................");
        OutputStream outputStream = response.getOutputStream();
        JAXBContext jc = null;
        System.out.println("Creating information requested");
        String path = "Models";
        try {
            jc = JAXBContext.newInstance(path);
            System.out.println("Generating Restaurants");
            Restaurants restaurants = generateRestaurants();
            Marshaller marshaller = jc.createMarshaller();
            System.out.println("Sending xml file for restaurants");
            marshaller.marshal(restaurants,outputStream);
            System.out.println("File sent");
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private Restaurants generateRestaurants(){
        Restaurants restaurants = new Restaurants();
        //Restaurant 1
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Joe's Place");
        Menu menu = new Menu();
        Item item = new Item();
        item.setName("Pizza");
        item.setPrice("$10.50");
        item.setDescription("Yummy Pizza.");
        menu.getItem().add(item);
        Item item2 = new Item();
        item2.setName("Candy Canes");
        item2.setPrice("$0.50");
        item2.setDescription("Yeah for X-mas.");
        menu.getItem().add(item2);
        restaurant.setMenu(menu);

        //Restaurant 2
        Restaurant restaurant2 = new Restaurant();
        restaurant2.setName("Rich Fancy Bar");
        Menu menu2 = new Menu();
        Item item3 = new Item();
        item3.setName("Caviar");
        item3.setPrice("$100.50");
        item3.setDescription("Stinky fish eggs.");
        menu2.getItem().add(item3);
        Item item4 = new Item();
        item4.setName("Fancy Stake");
        item4.setPrice("$1123.50");
        item4.setDescription("It is the best stake in the world.");
        menu2.getItem().add(item4);
        restaurant2.setMenu(menu2);

        //Restaurant 3
        Restaurant restaurant3 = new Restaurant();
        restaurant3.setName("Hobo's Dinner");
        Menu menu3 = new Menu();
        Item item5 = new Item();
        item5.setName("Cat Food");
        item5.setPrice("$1.03");
        item5.setDescription("If cats like it, it must be good.");
        menu3.getItem().add(item5);
        Item item6 = new Item();
        item6.setName("Trashcan Bag Food");
        item6.setPrice("$1.50");
        item6.setDescription("It is a mystery ");
        menu3.getItem().add(item6);
        restaurant3.setMenu(menu3);


        restaurants.getRestaurant().add(restaurant2);
        restaurants.getRestaurant().add(restaurant);
        restaurants.getRestaurant().add(restaurant3);
        return restaurants;


    }
}
