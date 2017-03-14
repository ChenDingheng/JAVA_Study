/**
 * Created by dell on 2017/3/14.
 */
public class Circle implements Measurable {
    private double myRadius;
    private static final double PI=3.14159;
    public Circle(double radius){
        this.myRadius=radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0*PI*myRadius;
    }

    @Override
    public double getArea() {
        return PI*myRadius*myRadius;
    }
}
