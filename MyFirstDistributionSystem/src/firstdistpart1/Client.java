package firstdistpart1;

import java.io.*;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 7/9/13
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args) {
        Socket server = null;
        //PrintWriter writer = null;
        //BufferedReader reader = null;
        Scanner scan = new Scanner(System.in);
        ObjectInputStream fromServer = null;
        ObjectOutputStream toServer = null;
        int counter = 1;

        try{
            server = new Socket("LocalHost",10080);
            fromServer = new ObjectInputStream(server.getInputStream()) ;

            //Input from server
            System.out.println("The Classes:");
            List<Class<?>> classes =  (List<Class<?>>)fromServer.readObject();
            for(Class<?> c : classes){
                System.out.println(counter + "..." + c.getName());
                counter++;
            }

            //Input to server
            System.out.println("Enter in the number of the class to use");
	        toServer = new ObjectOutputStream(server.getOutputStream());
            toServer.writeObject(scan.nextLine());
            toServer.flush();

            //Input from server
            counter = 1;
            Class<?> calledClass = (Class<?>)fromServer.readObject();
            System.out.println(calledClass.getName() + " Methods: (0...name: parameter(s)...)");
            for(Method m1 : (Method[])calledClass.getDeclaredMethods() ) {
                String methodInfo = m1.getName() + "( ";
                for(Class<?> f1 : m1.getParameterTypes())  {
                    methodInfo += f1.getName() + " ";
                }
                methodInfo += ")";
                System.out.println(counter + "..." + methodInfo);
                counter++;
            }

            //Input to server
            System.out.println("What method do you want?(Type the method name as it appears above with a comma between each parameter)");
            System.out.println("Example to call the add method: 1, 1, 1");
            String input = scan.nextLine();
            toServer.writeObject(input);
            //Look at identifying between objects and primitives. Try to change the way of sending data to the server from a string.

            //Input from server
            System.out.println("Getting Result...");
            System.out.println("The result is: " + fromServer.readObject());
            server.close();
            System.out.println("Connection Ended");
        }
        catch (Exception e){
            System.out.println("Server Error");
            System.exit(-1);
        }
    }
}
