import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/19.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> toDoList=new ArrayList<>();
        System.out.println("Enter items for the list, when prompted.");
        boolean done=false;
        Scanner keyboard=new Scanner(System.in);

        while(!done){
            System.out.println("Type an entry:");
            String entry=keyboard.nextLine();
            toDoList.add(entry);
            System.out.print("More items for the list? ");

            String ans=keyboard.nextLine();
            if(!ans.equalsIgnoreCase("yes"))
                done=true;
        }

        System.out.println("The list contains:");
        int listSize=toDoList.size();
        for(int i=0;i<listSize;i++)
            System.out.println(toDoList.get(i));
    }
}
