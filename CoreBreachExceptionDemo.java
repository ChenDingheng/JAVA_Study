/**
 * Created by dell on 2017/3/15.
 */
public class CoreBreachExceptionDemo {
    public static void main(String[] args){
        try{
            throw new CoreBreachException();
        }
        catch (CoreBreachException e){
            System.out.println(e.getMessage());
        }
    }
}
