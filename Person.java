/**
 * Created by dell on 2017/3/14.
 */
public class Person  {
    private String name;
    public Person(){
        name="No name yet";
    }

    public Person(String initialName){
        name=initialName;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public String getName(){
        return this.name;
    }

    public void writeOutput(){
        System.out.println("Name: "+this.name);
    }

    public boolean hasSameName(Person otherPerson){
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
