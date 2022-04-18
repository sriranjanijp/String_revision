/*
 * Write a program to accept a string and change the case of each letter of the string. 
 * SampleInput: WelCome TO Class 
 * Sample Output: wELcOME to cLASS 
 */
import java.util.Scanner;
class casechange
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.nextLine();
        int len = st.length();
        char chr;
        String fin = "";
        for (int i = 0; i < len; i++)
        {
            chr = st.charAt(i);
            if (Character.isUpperCase(chr))
            {
                fin = fin + Character.toLowerCase(chr);
            }
            else
            {
                fin = fin + Character.toUpperCase(chr);
            }
        }
        System.out.println(fin);
    }
}