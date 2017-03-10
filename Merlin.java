/**
 * Created by dell on 2017/3/10.
 */
public class Merlin {
    public static Merlin theWizard;


    private Merlin(){
    }

    public static Merlin summon(){
        if(theWizard==null){
            Merlin t=new Merlin();
            theWizard=t;
        }
        return theWizard;
    }

    public String consult(){
        return "Pull the sword from the stone";
    }
}
