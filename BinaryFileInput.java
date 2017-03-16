import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * Created by dell on 2017/3/16.
 */
public class BinaryFileInput {
    public static void main(String[] args){
        try{
            ObjectOutputStream toFile=new ObjectOutputStream(new FileOutputStream("E:\\stuff.dat"));
            toFile.writeDouble(0.01);
            toFile.writeDouble(0.02);
            toFile.writeDouble(0.03);
            toFile.writeInt(10);
            toFile.close();
            ObjectInputStream fromFile=new ObjectInputStream(new FileInputStream("E:\\stuff.dat"));
            double[] anDouble=new double[3];
            for(int i=0;i<3;i++) {
                anDouble[i] = fromFile.readDouble();
                System.out.println(anDouble[i]);
            }
            long anLong;
            anLong=fromFile.readLong();
            System.out.println(anLong);
            fromFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }
        catch (EOFException e){
            System.out.println("EOFException");
        }
        catch (IOException e){
            System.out.println("IOException");
        }
    }
}
