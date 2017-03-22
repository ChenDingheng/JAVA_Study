import java.io.*;

/**
 * A class whose clone method uses serialization
 * Created by dell on 2017/3/22.
 */
public class SerialCloneable implements Cloneable,Serializable{
    public Object clone(){
        try{
            //save the object to a byte array
            ByteArrayOutputStream bOut=new ByteArrayOutputStream();
            ObjectOutputStream out=new ObjectOutputStream(bOut);
            out.writeObject(this);
            out.close();

            //read a clone of the object from the byte array
            ByteArrayInputStream bIn=new ByteArrayInputStream(bOut.toByteArray());
            ObjectInputStream in=new ObjectInputStream(bIn);
            Object ret=in.readObject();
            in.close();

            return ret;
        }
        catch(Exception e){
            return null;
        }
    }
}
