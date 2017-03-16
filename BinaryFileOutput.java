import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by dell on 2017/3/16.
 */
public class BinaryFileOutput {
    public static void main(String[] args){
        double x1,x2,x3;
        x1=0.01;
        x2=0.02;
        x3=0.03;
        try{
            ObjectOutputStream toFile=new ObjectOutputStream(new FileOutputStream("E:\\stuff.data"));
            toFile.writeDouble(x1);
            toFile.writeDouble(x2);
            toFile.writeDouble(x3);
            toFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch(IOException e){
            System.out.println("IO exception!");
        }
    }
}
