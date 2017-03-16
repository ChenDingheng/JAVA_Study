import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/16.
 */
public class SocketClient {
    public static void main(String[] args){
        String s;
        Scanner inputStream=null;
        PrintWriter outputStream=null;
        try{
            Socket clientSocket=new Socket("localhost",6789);
            inputStream=new Scanner(new InputStreamReader(clientSocket.getInputStream()));
            outputStream=new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));
            outputStream.println("Java");
            outputStream.flush();

            while(inputStream.hasNextLine()){
                s=inputStream.nextLine();
                System.out.println(s);
            }
            inputStream.close();
            outputStream.close();
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
