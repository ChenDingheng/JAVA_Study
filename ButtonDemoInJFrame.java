import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

/**
 * Created by dell on 2017/3/14.
 */
public class ButtonDemo extends JFrame implements ActionListener{
    public ButtonDemo(){
        setSize(400,300);
        WindowDestroyer listener=new WindowDestroyer();
        addWindowListener(listener);

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

    @Override
    public void actionPerformed(ActionEvent e) {

        Container contentPane=getContentPane();
        if(e.getActionCommand().equals("Sunny"))
            contentPane.setBackground(Color.blue);
        else if(e.getActionCommand().equals("Cloudy"))
            contentPane.setBackground(Color.gray);
        else
            System.out.println("Error in button interface.");
    }
}
