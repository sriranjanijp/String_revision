/* 
 * Write a program in Java to accept a String in upper case and replace
 * all the vowels present in the String with Asterisk (*) sign.
 * Sample Input: "TATA STEEL IS IN JAMSHEDPUR"
 * Sample output: T*T* ST**L *S *N J*MSH*DP*R
 */
import java.util.Scanner;
class replacevow
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        int len = st.length();
        String fin = "";
        for (int i = 0; i<len; i++)
        {
            char ch = st.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
            {
                fin = fin + "*";
            }
            else
            {
                fin = fin + ch;
            }
        }
        System.out.println(fin);
    }
}