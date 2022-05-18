/*
 * Write a program in Java to accept a word/a String and display
 * the new string after removing all the vowels present in it.
 * Sample Input: COMPUTER APPLICATIONS
 * Sample Output: CMPTR PPLCTNS
 */
import java.util.Scanner;
class removevow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st = sc.nextLine();
        char ch;
        for (int i = 0; i<st.length(); i++)
        {
            if (st.charAt(i) == 'a' ||st.charAt(i) == 'e' ||st.charAt(i) == 'i' ||st.charAt(i) == 'o' 
            ||st.charAt(i) == 'u' ||st.charAt(i) == 'A' ||st.charAt(i) == 'E' ||st.charAt(i) == 'I' 
            ||st.charAt(i) == 'O' ||st.charAt(i) == 'U')
            {
                continue;
            }
            else 
            System.out.print(st.charAt(i));
        }
    }
}