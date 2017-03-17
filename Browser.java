import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/17.
 */
public class Browser {
    public static void main(String[] args){
        String s;
        Scanner inputStream=null;
        PrintWriter outputStream=null;
        PrintWriter outputStreamToHtml=null;
        try{
            Socket clientSocket=new Socket("www.bing.com",80);
            inputStream=new Scanner(new InputStreamReader(clientSocket.getInputStream()));
            outputStream=new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));
            outputStream.println("GET / HTTP/1.1");
            outputStream.println("Host: www.bing.com");
            outputStream.println();
            outputStream.flush();

            outputStreamToHtml=new PrintWriter("E:\\wikipedia.html");
            while(inputStream.hasNextLine()){
                s=inputStream.nextLine();
                outputStreamToHtml.println(s);
                System.out.println(s);
                //if(s.charAt(0)=='<')
                    //break;
            }
            /*
            while(inputStream.hasNextLine()){
                s=inputStream.nextLine();
                outputStreamToHtml.println(s);

                System.out.println(s);
            }
            */
            inputStream.close();
            outputStream.close();
            outputStreamToHtml.close();
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
