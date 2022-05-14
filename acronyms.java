/*
 * Write a program in java to enter a string and frame a word by 
 * joining all the first characters of each word. Display the new word. 
 * Sample i/p: Vital Information Resource Under Seize 
 * Sample o/p: VIRUS  
 */
import java.util.Scanner;
class acronyms
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String in = sc.nextLine();
        in = in.trim();
        String st =" "+in.toUpperCase();
        int len = st.length();
        String fin = "";
        for (int i = 0; i<len; i++)
        {
            char t = st.charAt(i);
            if (t==' ')
            {
                char h = st.charAt(i+1);
                fin = fin + h;
            }
        }
        System.out.println(fin);
    }
}