import javax.swing.*;
import java.awt.*;

/**
 * Created by dell on 2017/3/23.
 */
public class DOMTreeTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame=new DOMTreeFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
