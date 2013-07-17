package firstdistpart1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        PrintWriter writer = null;
        BufferedReader reader = null;
        Scanner scan = new Scanner(System.in);
        int counter = 1;

        try{
            server = new Socket("LocalHost",10080);
            writer = new PrintWriter(server.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
            //System.out.println("Methods: (0...name: parameter...)");
            System.out.println("The Classes:");
            Thread.sleep(1000);
            System.out.println(counter + "..." + reader.readLine());
            counter +=1;
            while (reader.ready()){

                System.out.println(counter + "..." + reader.readLine());
                ++counter;
            }
            System.out.println("Enter in the number of the class to use");
            writer.println(scan.nextLine());
            Thread.sleep(1000);
            counter = 1;
            System.out.println(counter + "..." + reader.readLine());
            counter +=1;
            while (reader.ready()){

                System.out.println(counter + "..." + reader.readLine());
                ++counter;
            }
            System.out.println("What method do you want?(Type the method name as it appears above with a comma between each parameter)");
            System.out.println("Example to call the add method: 1, 1, 1");
            String input = scan.nextLine();
            writer.println(input);
            System.out.println("Getting Result...");
            System.out.println("The result is: " + reader.readLine());


            server.close();
        }
        catch (Exception e){
            System.out.println("Server Error");
            System.exit(-1);
        }
    }
}
