/**
 * Created by dell on 2017/3/14.
 */
public class MeasurableDemo {
    public static void display(Measurable obj){
        System.out.println(obj.getPerimeter());
        System.out.println(obj.getArea());
    }
    public static void main(String[] args){
        Measurable rec=new Rectangle(5.0,5.0);
        Measurable cir=new Circle(5.0);
        MeasurableDemo.display(rec);
        MeasurableDemo.display(cir);
    }
}
