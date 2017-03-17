import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/17.
 */
public class NameRepair {
    public static void main(String[] args){
        String fileName="E:\\name.txt";
        Scanner inputStream=null;
        PrintWriter outputStream=null;
        try{
            inputStream=new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file "+fileName);
            System.exit(0);
        }
        String[] str=new String[10];
        int i=0;
        //str[i]="";
        while(inputStream.hasNext()){
            str[i]="";
            str[i]+=inputStream.next();
            str[i]+=" ";
            str[i]+=inputStream.next();
            i++;
        }
        for(int j=0;j<i;j++){
            System.out.println(str[j]);
        }
        inputStream.close();
        try{
            outputStream=new PrintWriter("E:\\newname.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Error");
        }
        for(int j=0;j<i;j++){
            outputStream.println(str[j]);
        }
        outputStream.close();
    }
}
