import javax.swing.*;
import java.awt.*;

/**
 * Created by dell on 2017/3/9.
 */
public class PreliminaryButtonDemo extends JApplet {
    public void init(){
        Container contentPane=getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new FlowLayout());

        JButton sunnyButton=new JButton("Sunny");
        contentPane.add(sunnyButton);

        JButton cloudyButton=new JButton("Cloudy");
        contentPane.add(cloudyButton);
    }
}
