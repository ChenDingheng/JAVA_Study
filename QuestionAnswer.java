import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by dell on 2017/3/13.
 */
public class QuestionAnswer extends JApplet implements ActionListener{
    private JTextField theText;
    //private String answer;
    public void init(){
        Container contentPane=getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setSize(1000,1000);
        JLabel instructions=new JLabel("I will ask you some questions, and get answers from you.");
        contentPane.add(instructions);
        JButton inputAnswer=new JButton("InputAnswer");
        contentPane.add(inputAnswer);
        inputAnswer.addActionListener(this);
        theText=new JTextField(30);
        contentPane.add(theText);
        theText.setText("What would you like to talk about?");
    }

    public void askMore(String answer){
        int maxLengthOfWords=0;
        String maxWord=null;
        Scanner keyBoard=new Scanner(answer);
        //System.out.println(keyBoard.next());
        //System.out.println(keyBoard.next());
        String curWord;
        while(true){
            curWord=keyBoard.next();
            //System.out.println(keyBoard.next());

            if(curWord.length()>maxLengthOfWords){
                maxLengthOfWords=curWord.length();
                maxWord=curWord;
            }
            if(curWord.charAt(curWord.length()-1)=='?'){//如何优化结束条件？？？
                break;
            }
        }
        if(maxLengthOfWords==4){
            System.out.println("Tell me more about "+maxWord);
        }
        else if(maxLengthOfWords==5){
            System.out.println("Why do you think "+maxWord+" is important?");
        }
        else if(maxLengthOfWords>=6){
            System.out.println("Now we are getting somewhere. How does "+maxWord+" affect you the most?");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("InputAnswer")){
            askMore(theText.getText());
        }
    }
}
