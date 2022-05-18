/*
 * Write a program in Java to enter a String/Sentence and display the
 * longest word and the length of the longest word present in the String.
 * Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN”
 * Sample Output: The longest word: FOOTBALL: The length of the word: 8
 */
import java.util.Scanner;
class longword
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        String lwrd = "", word = "";
        char ch;
        int len = st.length();
        for (int i = 0; i < len; i++)
        {
            ch = st.charAt(i);
            if (ch == ' ')
            {
                if (word.length() > lwrd.length())
                {
                    lwrd = word;
                }
                word = "";
            }
            else
            {
                word = word + ch;
            }
        }
        System.out.println("The longest word is : " + lwrd);
        System.out.println("It's length is : " + lwrd.length());
    }
}