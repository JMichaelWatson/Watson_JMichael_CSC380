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

        try{
            server = new Socket("LocalHost",10080);
            writer = new PrintWriter(server.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
            Thread.sleep(1000);
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
            System.out.println("What method do you want?(Type the method name as it appears above)");
            String input = scan.nextLine();
            writer.println(input);
            //System.out.println(reader.readLine());


            server.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
//System.out.println("Enter in '1' for add and '2' for sub:");
//String userInput = scan.next() + ",";
//System.out.println("Enter in the first number:");
//userInput += scan.next() + ",";
//System.out.println("Enter in the second number:");
//userInput += scan.next();
//writer.println(userInput);
//System.out.println("The answer is:");
//System.out.println(reader.readLine());