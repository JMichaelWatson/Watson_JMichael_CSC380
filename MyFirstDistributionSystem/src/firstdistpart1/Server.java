package firstdistpart1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 7/9/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Server{
    public static void main(String[] args) {
        ServerSocket serverSock = null;
        Socket clientSocket = null;
        //BufferedReader reader = null;
        //PrintWriter writer = null;

        MathLogic mathLogic = new MathLogic();
        try{
            serverSock = new ServerSocket(10080);
            System.out.println("Starting Server");
            while(true){
                clientSocket = serverSock.accept();
                System.out.println("Connection Made");
                ClientThread thread = new ClientThread(clientSocket);
                thread.run();
            }
        }
        catch(Exception e){
          System.out.println("Error on port 10080");
          System.exit(-1);
        }
    }
}
//            writer = new PrintWriter(clientSocket.getOutputStream(), true);
//            System.out.println("Creating Server Writer");
//            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//            System.out.println("Creating Server Reader");
//            String userInput = reader.readLine();
//            System.out.println("User input read");
//            String[] splitString = userInput.split(",");
//            if(splitString[0].equalsIgnoreCase("1")){
//               writer.println(mathLogic.add(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2])));
//            }
//            else{
//                System.out.println(mathLogic.sub(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2])));
//            }