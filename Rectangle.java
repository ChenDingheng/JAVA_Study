/**
 * Created by dell on 2017/3/14.
 */
public class Rectangle implements Measurable{
    private double myWidth;
    private double myHeight;
    public Rectangle(double width, double height){
        this.myWidth=width;
        this.myHeight=height;
    }

    @Override
    public double getPerimeter() {
        return 2.0*(myHeight+myWidth);
    }

    @Override
    public double getArea() {
        return myHeight*myWidth;
    }
}
