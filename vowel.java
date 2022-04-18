/*
 * Write a program to accept a string. Count and display the number of vowels present in the string 
 * Sample input: government Company 
 * Sample output: 5 
 */
import java.util.Scanner;
class vowel
{
    public static void main (String[] args)
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a String");
      String st = sc.nextLine();
      int count = 0;
      int len = st.length();
      char chr;
      for(int i = 0; i<len; i++)
      {
          chr = st.charAt(i);
          if (chr == 'a'|| chr == 'e'|| chr == 'i'|| chr == 'o'|| chr == 'u'|| chr == 'A'|| chr == 'E'|| chr == 'I'|| chr == 'O'|| chr == 'U')
          {
              count = count +1;          
          }
      } 
      System.out.println("The number of vowels are = " + count );
    }
}