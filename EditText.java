import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/17.
 */
public class EditText extends JFrame implements ActionListener{
    private JTextArea fileText;
    public EditText(){
        setSize(1000,1000);
        WindowDestroyer listener=new WindowDestroyer();
        addWindowListener(listener);

        Container contentPane=getContentPane();
        contentPane.setLayout(new FlowLayout());

        fileText=new JTextArea(50,50);
        contentPane.add(fileText);

        JButton saveButton=new JButton("Save");
        saveButton.addActionListener(this);
        contentPane.add(saveButton);

        JButton getTextButton=new JButton("Get text");
        getTextButton.addActionListener(this);
        contentPane.add(getTextButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand=e.getActionCommand();
        if(actionCommand.equals("Save"))
            saveText();
        else if(actionCommand.equals("Get text"))
            inputText();
        else
            System.out.println("Error");
    }

    private void saveText(){
        try{
            Scanner saveStream=new Scanner(fileText.getText());
            PrintWriter outputStream=new PrintWriter("E:\\save.txt");
            while(saveStream.hasNextLine()){
                outputStream.println(saveStream.nextLine());
            }
            saveStream.close();
            outputStream.close();
        }
        catch(FileNotFoundException e){
            System.out.println("saveText exception");
        }
    }

    private void inputText(){
        try{
            Scanner inputStream=new Scanner(new File("E:\\save.txt"));
            while(inputStream.hasNextLine()){
                fileText.append(inputStream.nextLine()+"\n");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("inputText exception");
        }
    }

    public static void main(String[] args){
        EditText gui=new EditText();
        gui.setVisible(true);
    }

}
