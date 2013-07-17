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
