package firstdistpart1;

import java.io.*;
import java.lang.reflect.Method;
import java.net.Socket;
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
            toServer = new ObjectOutputStream(server.getOutputStream());
           //writer = new PrintWriter(server.getOutputStream(), true);
            //reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
            System.out.println("The Classes:");
            Class<?>[] classes =  (Class<?>[])fromServer.readObject();
            for(Class<?> c : classes){
                System.out.println(counter + "..." + c.getName());
            }
//            System.out.println(counter + "..." + reader.readLine());
//            counter +=1;
//            while (reader.ready()){
//
//                System.out.println(counter + "..." + reader.readLine());
//                ++counter;
//            }
            System.out.println("Enter in the number of the class to use");
            toServer.writeObject(scan.nextLine());

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
//            Thread.sleep(1000);
//            counter = 1;
//            System.out.println(counter + "..." + reader.readLine());
//            counter +=1;
//            while (reader.ready()){
//
//                System.out.println(counter + "..." + reader.readLine());
//                ++counter;
//            }

            System.out.println("What method do you want?(Type the method name as it appears above with a comma between each parameter)");
            System.out.println("Example to call the add method: 1, 1, 1");
            String input = scan.nextLine();
            toServer.writeObject(input);
            System.out.println("Getting Result...");
            System.out.println("The result is: " + fromServer.readObject());


            server.close();
        }
        catch (Exception e){
            System.out.println("Server Error");
            System.exit(-1);
        }
    }
}
