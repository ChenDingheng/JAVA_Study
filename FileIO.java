import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by dell on 2017/3/16.
 */
public class FileIO {
    public static void main(String[] args){
        String filename="E:\\out.txt";
        PrintWriter outputStream=null;
        try{
            outputStream=new PrintWriter(filename);
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file "+filename);
            System.exit(0);
        }
        outputStream.println("This is line 1.");
        outputStream.close();
    }
}
