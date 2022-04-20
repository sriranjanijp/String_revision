/*
 * Write a program to accept a word in lower case and 
 * display the new word after removing all the repeated characters 
 * Sample input: applications 
 * Sample output: aplictons 
 */
import java.util.Scanner;
class repeated
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2 = ""; //st2 is the final string
        char chr, ch;
        int t;
        System.out.println("Enter a word");
        s1 = sc.next(); 
        int len = s1.length();
        for (int i = 0; i<len; i++)
        {
            chr = s1.charAt(i);
            t = 0;
            for (int j = 0; j<s2.length(); j++) //checking if st2 already has the letter
            {
                ch = s2.charAt(j);
                if (chr == ch)
                  t = 1;
            }
            if (t == 0) //if the letter isn't already there, we print it 
            s2 = s2+chr;
        }
        System.out.println(s2);
    }
}