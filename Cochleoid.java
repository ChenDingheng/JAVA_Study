import javax.swing.*;
import java.awt.*;

/**
 * Created by dell on 2017/3/14.
 */
public class Cochleoid extends JFrame{

    private static final int K=15;
    private int[] x=new int[150];
    private int[] y=new int[150];

    public Cochleoid(){
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void calculateCoor(){
        double theta=0;
        for(int i=0;i<150;i++){
            x[i]=(int)(250+K*theta*Math.sin(theta));
            y[i]=(int)(250+K*theta*Math.cos(theta));
            theta+=0.1;
        }
    }
    @Override
    public void paint(Graphics g) {
        calculateCoor();
        g.drawPolyline(x,y,150);
    }
}
