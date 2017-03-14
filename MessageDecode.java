import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dell on 2017/3/14.
 */
public class MessageDecode extends JFrame implements ActionListener{


    private static final int SHIFTNUM=3;
    private JTextField theText;
    private String inputMessage;
    private String decodeMessage;
    private String encodeMessage;
    public MessageDecode(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane=getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new FlowLayout());

        JButton inputButton=new JButton("Input");
        JButton outputDecodeButton=new JButton("OutputDecode");
        JButton outputEncodeButton=new JButton("OutputEncode");
        JButton decodeButton=new JButton("Decode");
        JButton encodeButton=new JButton("Encode");

        inputButton.addActionListener(this);
        contentPane.add(inputButton);

        outputDecodeButton.addActionListener(this);
        contentPane.add(outputDecodeButton);

        outputEncodeButton.addActionListener(this);
        contentPane.add(outputEncodeButton);

        decodeButton.addActionListener(this);
        contentPane.add(decodeButton);

        encodeButton.addActionListener(this);
        contentPane.add(encodeButton);

        theText=new JTextField(30);
        contentPane.add(theText);
    }

    public void input(){
        inputMessage=theText.getText();
    }

    private char replaceChar(char c, int shiftNum){
        return (char)(c+shiftNum);
    }

    public String decode(String str, int shiftNum){

        String s="";
        for(int i=0;i<str.length();i++){
            s=s+replaceChar(str.charAt(i),shiftNum);
        }
        return s;
    }

    public String encode(String str, int shiftNum){
        String s="";
        for(int i=0;i<str.length();i++){
            s=s+replaceChar(str.charAt(i),shiftNum);
        }
        return s;
    }

    public void output(String str){
        System.out.println(str);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container contentPane=getContentPane();
        if(e.getActionCommand().equals("Input")){
            input();
        }
        else if(e.getActionCommand().equals("Decode")){
            decodeMessage=decode(inputMessage,SHIFTNUM);
        }
        else if(e.getActionCommand().equals("Encode")){
            encodeMessage=encode(decodeMessage,-SHIFTNUM);
        }
        else if(e.getActionCommand().equals("OutputDecode")){
            output(decodeMessage);
        }
        else if(e.getActionCommand().equals("OutputEncode")){
            output(encodeMessage);
        }
    }
}
