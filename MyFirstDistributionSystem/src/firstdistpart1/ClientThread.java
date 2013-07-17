package firstdistpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

    private Class<?> ref = null;

    public void run(){
        try {
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Getting Classes...");
            List<Class<?>> allClasses = getClassesInPackage("firstdistpart1");
            for(Class<?> aClass : allClasses){
                System.out.println(aClass.getName());
                writer.println(aClass.getName());
            }
            String className = allClasses.get(Integer.parseInt(reader.readLine())-1).getName();
            System.out.println("The user selected class:   " + className);
            System.out.println("Getting methods....");
            ref = Class.forName(className);
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
    private List getClassesInPackage(String packageName) throws Exception {
        URL packageUrl = this.getClass().getClassLoader().getResource(packageName.replace(".", "/"));
        List allClasses = new ArrayList<>();
        if(packageUrl != null) {
            Path packagePath = Paths.get(packageUrl.toURI());
            if(Files.isDirectory(packagePath)) {
                try(DirectoryStream<Path> ds = Files.newDirectoryStream(packagePath, "*.class")) {
                    for(Path d : ds) {
                        allClasses.add(Class.forName(packageName + "." + d.getFileName().toString().replace(".class", "")));
                    }
                }
            }
            return allClasses;
        }
        return null;
    }
}
