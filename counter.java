/*
 * Write a program to input any given string to calculate the total number of characters and vowels present in the string and also reverse the string  
 * Example 
 * INPUT  
 * Enter String:  SNOWY  
 * 
 * OUTPUT  
 * Total number of characters  :  05 
 * Number of Vowels   :  01  
 * Reverse string    :  YWONS 
 */
import java.util.Scanner;
class counter
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ori, rev = "";
        System.out.println("Enter a string");
        ori = sc.nextLine();
        int vowcount = 0;
        int len = ori.length();
        char chr;
        for (int i = 0; i<len; i++)
        {
            chr = ori.charAt(i);
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' ||
            chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')
            vowcount++;
            rev = chr + rev;
        }
        System.out.println ("Entered word: " + ori);
        System.out.println ("No of characters: " + len);
        System.out.println ("No of vowels: " + vowcount);
        System.out.println ("Reversed word: " + rev);
    }
}