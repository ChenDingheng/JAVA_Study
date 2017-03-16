import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/16.
 */
public class SocketServer {
    public static void main(String[] args){
        String s;
        Scanner inputStream=null;
        PrintWriter outputStream=null;
        ServerSocket serverSocket=null;
        try{
            System.out.println("Waiting for a connection.");
            serverSocket=new ServerSocket(6789);
            Socket socket=serverSocket.accept();
            inputStream=new Scanner(new InputStreamReader(socket.getInputStream()));
            outputStream=new PrintWriter(new DataOutputStream(socket.getOutputStream()));

            s=inputStream.nextLine();

            outputStream.println("Well, ");
            outputStream.println(s+" is a fine programming language!");
            outputStream.flush();

            System.out.println("Closing connection from "+s);
            inputStream.close();
            outputStream.close();
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
