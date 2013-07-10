package firstdistpart1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
    public void run(){
        try{
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String userInput = reader.readLine();
            String[] splitString = userInput.split(",");
            if(splitString[0].equalsIgnoreCase("1")){
                System.out.println("Client is adding");
                writer.println(mathLogic.add(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2])));
            }
            else{
                System.out.println("Client is subbing");
                System.out.println(mathLogic.sub(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2])));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
