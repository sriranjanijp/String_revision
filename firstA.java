/*
 * Write a program to input a sentence and convert it into uppercase 
 * and count and display the total number of words starting with a letter 'A'. 
 * Example: 
 * Sample Input: ADVANCEMENT AND APPLICATION OF INFORMATION TECHNOLOGY 
 *               ARE EVER CHANGING.
 */ 
import java.util.Scanner;
class firstA
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        int len = str.length();
        str = str.toUpperCase();
        int c = 0;
        for (int i = 0; i<len; i++)
        {
          if (str.charAt(i) == ' ' && str.charAt(i+1) == 'A')
          c++;
        }
        System.out.println(c + " words have A as their first letter");
    }
}