import javax.swing.*;
import java.awt.*;

/**
 * Created by dell on 2017/3/9.
 */
public class IconDemo extends JApplet {
    public void init(){
        Container contentPane=getContentPane();
        JLabel niceLabel=new JLabel("Java is fun!");
        ImageIcon dukeIcon = new ImageIcon("e:\\a.jpg" );
        niceLabel.setIcon(dukeIcon);
        contentPane.add(niceLabel);
        //contentPane.setLayout(new FlowLayout());
    }
}
