/*
 * Write a program to accept a sentence in lowercase and 
 * convert first letter of each word of the sentence into upper case and 
 * display the output. 
 * Input: we are in school 
 * Output We Are In School 
 */
import java.util.Scanner;
class capitalize
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String inp = sc.nextLine();
        String st = " "+inp;
        int len = st.length();
        for (int i = 0; i<len; i++)
        {
           char t = st.charAt(i);
           if (t==' ')
           {
               char h = st.charAt(i+1);
               System.out.print(" "+Character.toUpperCase(h));
               i++;
           }
           else
           System.out.print(t);
        }
    }
}