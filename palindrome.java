/*
 * Write a program in java to accept a word and check whether the the word is palindrome or not 
 * Sample Input : madam,mom,dad 
 * Sample output:madam 
 */
import java.util.Scanner;
class palindrome
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ori,rev = "";
        System.out.println("Enter a word");
        ori = sc.next();
        int len = ori.length();
        for (int i = 0; i < len; i++)
        {
            rev = ori.charAt(i)+rev;
        }
        if (ori.equals(rev))
        System.out.println ("Entered word is a palindrome");
        else
        System.out.println ("Entered word is not a palindrome");
     }
}