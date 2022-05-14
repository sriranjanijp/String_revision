/*
 * Write a program to enter a string and print the string in alphabetical order of its letters 
 * Input: computer 
 * Output: cemoprtu 
 */
import java.util.Scanner;
class alphabeticalorder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        int len = word.length();
        char t;
        for (int i = 65; i <= 90; i++)
        {
            for (int j = 0; j < len; j++)
            {
                t = word.charAt(j);
                if (t==(char)i||t==(char)(i+32))
                {
                   System.out.print(t);
                }
            }
        }
    }
}