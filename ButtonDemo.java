import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dell on 2017/3/9.
 */
public class ButtonDemo extends JApplet implements ActionListener {
    public void init(){
        Container contentPane=getContentPane();
        contentPane.setBackground(Color.white);

        contentPane.setLayout(new FlowLayout());

        JButton sunnyButton=new JButton("Sunny");
        contentPane.add(sunnyButton);
        sunnyButton.addActionListener(this);

        JButton cloudyButton=new JButton("Cloudy");
        contentPane.add(cloudyButton);
        cloudyButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Container contentPane=getContentPane();
        if(e.getActionCommand().equals("Sunny"))
            contentPane.setBackground(Color.blue);
        else if(e.getActionCommand().equals("Cloudy"))
            contentPane.setBackground(Color.gray);
        else
            System.out.println("Error in button interface.");
    }
}
