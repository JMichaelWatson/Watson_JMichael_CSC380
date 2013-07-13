package firstdistpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 7/9/13
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientThread extends Thread {
    private MathLogic mathLogic = new MathLogic();
    private Socket clientSocket = null;
    private  BufferedReader reader = null;
    private PrintWriter writer = null;

    public ClientThread(Socket client){
        this.clientSocket = client;
    }

    public void Oldrun(){
        try{
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String userInput = reader.readLine();
            String[] splitString = userInput.split(",");
            if(splitString[0].equalsIgnoreCase("1")){
                System.out.println("Client is adding" + splitString[1] + " and " + splitString[2]);
                writer.println(mathLogic.add(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2])));
            }
            else{
                System.out.println("Client is subbing" + splitString[1] + " and " + splitString[2]);
                writer.println(mathLogic.sub(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2])));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private Class<?> ref = null;

    public void run(){
        try {
            System.out.println("Getting methods....");
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            ref = Class.forName("firstdistpart1.MathLogic");
            for(Method s1 : ref.getDeclaredMethods()){
                String method = s1.getName() + ": ";
                for(Class<?> p1 : s1.getParameterTypes()){
                   method += p1 + " ";
                }
                System.out.println(method);
                writer.println(method);
            }
                String inputMehtod = reader.readLine();
                System.out.println(inputMehtod);
            Method[] methods = ref.getDeclaredMethods();

            String[] userinput = inputMehtod.split(",");

            System.out.println("Invoking " + methods[Integer.parseInt(userinput[0])-1].getName());
            Object theClass = ref.getConstructor().newInstance();
            Object[] objects = new Object[userinput.length-1];
            for(int counter = 1; counter < userinput.length; counter++){
               objects[counter-1] = Integer.parseInt(userinput[counter]);
            }
            for (Object o : objects){
                System.out.println(o);
            }
            System.out.println("Server Getting result...");
            writer.println(methods[Integer.parseInt(userinput[0])-1].invoke(theClass,objects));
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on the server");
            System.exit(-1);
        }
    }

}
