import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The familiar Employee class, redefine to extend the
 * SerialCloneable class.
 * Created by dell on 2017/3/22.
 */
public class Employee extends SerialCloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name,double salary,int year,int month, int day){
        this.name=name;
        this.salary=salary;
        GregorianCalendar calendar=new GregorianCalendar(year,month,day);
        hireDay=calendar.getTime();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public String toString() {
        return getClass().getName()+"[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}
