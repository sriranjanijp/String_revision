/*
 * Write a program to accept a string in lowercase and replace ‘e’ with ‘*’ in the given string. Display the new string. 
 * Sample input : computer science 
 * Sample output: comput*r sci*nc* 
 */
import java.util.Scanner;
class replace
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        char e = 'e';
        char r = '*';
        int len = st.length();
        char chr;
        String fin = "";
        for (int i = 0;i<len;i++)
        {
            chr = st.charAt(i);
            if (chr == e)
            {
                fin = fin + r;
            }
            else
            fin = fin + chr;
        }
        System.out.println(fin);
    }
}