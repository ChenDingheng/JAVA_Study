import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/16.
 */
public class FileRead {
    public static void main(String[] args){
        String fileName="E:\\dobedo.txt";
        Scanner inputStream=null;
        try{
            inputStream=new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file "+fileName);
        }
        for(int i=0;inputStream.hasNextLine();i++){
            System.out.println("Line "+i+":"+" "+inputStream.nextLine());
        }
        inputStream.close();
        System.out.println(fileName+" is close");
    }
}
