/*
 *     Write a program to display the following pattern 

          C O M P U T E R 
 	  O             E 
 	  M    	        T 
          P	        U 
          U	        P 
          T	        M 
          E	        O 
          R E T U P M O C 
 */
import java.util.Scanner;
class frame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String st = sc.next();
        int len = st.length();
        char []str = new char[len]; 
        char []rev = new char[len];
        String space = "";
        for (int i = 0; i<len; i++)
        {
            str[i] = st.charAt(i);
        }
        String reve = "";
        for (int i =(len-1); i>=0; i--)
        {
            reve = reve+st.charAt(i);
        }
        for (int i = 0; i<len; i++)
        {
            rev[i] = reve.charAt(i);
        }
        for (int i = 0; i<(len-2);i++)
        {
           space = space + " "+" "; 
        }
        space = space + " "; //the space needs an extra space because of the space between each letter
        for(int i = 0; i<len; i++)
        {
            System.out.print(str[i]+" ");
        }
        System.out.println();
        for (int i = 1; i<(len-1);i++)
        {
            System.out.println(str[i]+space+rev[i]);
        }
        for(int i = 0; i<len; i++)
        {
            System.out.print(rev[i]+" ");
        }
    }
}