/*
 * Hello World to olleH dlroW
 */
import java.util.Scanner;
public class AltReverseWord
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = in.nextLine();
        str = str + " ";
        String word = "";
        int len = str.length();
        char chr;
        for (int i = 0; i < len; i++) 
        {
            chr = str.charAt(i);
            if (chr == ' ')
            {
                System.out.print(word+" ");
                word = "";
            }
            else
            {
                word = chr+word;
            }
        }
    }
}
