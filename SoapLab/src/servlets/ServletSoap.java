package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 8/12/13
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/ServletSoap")
public class ServletSoap extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Scanner scan;
        scan = null;
        try {
            URL test = (this.getClass().getClassLoader().getResource("Resources/restaurant-soap-response.xml"));
            scan = new Scanner(new File(this.getClass().getClassLoader().getResource("restaurant-soap-response.xml").toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        String xml ="";
        while(scan.hasNext()){
            xml+=scan.nextLine();
        }
        response.setContentLength(xml.length());
        response.setContentType("text/xml");
        response.getWriter().write(xml);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
