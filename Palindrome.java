import java.util.Scanner;

/**
 * Created by dell on 2017/3/17.
 */
public class Palindrome {

    public static String whetherPalindrome(String inputStr){

        int i=0;
        String lastToFirstStr="";
        if(inputStr.length()>1)
            lastToFirstStr=whetherPalindrome(inputStr.substring(i+1))+inputStr.charAt(i);
        else
            lastToFirstStr=inputStr;
        return lastToFirstStr;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str;
        str=input.nextLine();
        String handledStr="";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>=(char)97&&str.charAt(i)<=(char)122)||(str.charAt(i)>=(char)65&&str.charAt(i)<=(char)90)){
                handledStr+=str.charAt(i);
            }
        }
        System.out.println(handledStr);
        if(handledStr.equalsIgnoreCase(whetherPalindrome(handledStr)))
            System.out.println("YES!");
        else
            System.out.println("NO!");
    }
}
