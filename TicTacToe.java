import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Created by dell on 2017/3/13.
 */
public class TicTacToe extends JFrame implements ActionListener{

    private char[][] chessTable;

    public TicTacToe(){
        Container contentPane=getContentPane();
        //contentPane.setBackground(Color.BLACK);
        JButton startButton=new JButton("Start");
        JButton restartButton=new JButton("Restart");
        JButton showTableButton=new JButton("ShowTable");
        //restartButton.setVisible(true);
        //showTableButton.setVisible(true);
        startButton.addActionListener(this);
        restartButton.addActionListener(this);
        showTableButton.addActionListener(this);
        contentPane.add(startButton);
        contentPane.add(restartButton);
        contentPane.add(showTableButton);
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        //Container contentPane=getContentPane();
        if(e.getActionCommand().equals("Restart"))
            start();
        else if(e.getActionCommand().equals("ShowTable"))
            showTable(chessTable);
        else if(e.getActionCommand().equals("Start"))
            start();
        else
            System.out.println("Error in button interface.");
    }


    public void start(){
        init();
        int i=0;
        while(!isWin(chessTable)&&!gameOver(chessTable)){
            System.out.println("You are player "+(i%2));
            input(i%2);
            i++;
        }
    }

    public void init(){
        chessTable=new char[3][3];
    }
    public void input(int player){
        //int chessType;
        int x,y;
        Scanner keyBoard=new Scanner(System.in);
        System.out.println("You are player "+(player));
        //chessType=keyBoard.nextInt();
        System.out.println("Where you put the chess?");
        x=keyBoard.nextInt();
        y=keyBoard.nextInt();
        if(player==0)
            chessTable[x][y]='X';
        if(player==1)
            chessTable[x][y]='O';

    }
    public void showTable(char[][] table){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean isWin(char[][] table){
        for(int i=0;i<3;i++){
            if((table[i][0]==table[i][1]&&table[i][2]==table[i][1])&&(table[i][0]=='X'||table[i][0]=='O')){
                if(table[i][0]=='X')
                    System.out.println("player 0 win the game!");
                else
                    System.out.println("player 1 win the game!");
                return true;
            }
        }

        for(int i=0;i<3;i++){
            if((table[0][i]==table[1][i]&&table[2][i]==table[1][i])&&(table[0][i]=='X'||table[0][i]=='O')){
                if(table[0][i]=='X')
                    System.out.println("player 0 win the game!");
                else
                    System.out.println("player 1 win the game!");
                return true;
            }
        }

        if((table[0][0]==table[1][1]&&table[2][2]==table[1][1])&&(table[0][0]=='X'||table[0][0]=='O')){
            if(table[0][0]=='X')
                System.out.println("player 0 win the game!");
            else
                System.out.println("player 1 win the game!");
            return true;
        }

        else if((table[2][0]==table[1][1]&&table[2][0]==table[0][2])&&(table[0][2]=='X'||table[0][2]=='O')){
            if(table[1][1]=='X')
                System.out.println("player 0 win the game!");
            else
                System.out.println("player 1 win the game!");
            return true;
        }

        else
            return false;
    }

    public boolean gameOver(char[][] table){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(table[i][j]!='X'&&table[i][j]!='O'){
                    return false;
                }
            }
        }
        System.out.println("Game is over, no one is win!");
        return true;
    }



    public static void main(String[] args){
        TicTacToe gui=new TicTacToe();
        gui.setVisible(true);

        //Container contentPane=getContentPane();
    }
}
