/*
 * Write a program to display each letter of a word entered by the user. 

Sample input : BLUEJ 

Sample output: B 

    	       L 

               U 

               E 

               J 
 */
import java.util.Scanner;
class eachletter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sen;
        System.out.println("Enter a word");
        sen = sc.nextLine();
        for(int i=0;i<sen.length();i++)
        {
            char ch = sen.charAt(i);
            System.out.println(ch);
        }
    }
}