/*
 * Write a menu driven program to display the pattern of the string
 * entered by the user. If the user enters a choice ‘F’ then it displays all the
 * first letters of a word or a sentence. If the users enters ‘L’ then last
 * characters will be displayed.
 * Input: honesty is the best policy
 * Output: F L
 *         H y
 *           s
 * I
 * T e
 * B t
 * P y
*/
import java.util.Scanner;
class cases
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        String word = "";
        System.out.println("Enter F to print first letters, enter L to print last letters");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        st = st + " ";
        int len = st.length();
        switch(ch)
        {
            case 'F':
               
                for (int i = 0; i<len; i++)
                {
                    if (st.charAt(i) == ' ')
                    {
                        System.out.println(word.charAt(0));
                        word = "";
                    }
                    else
                    {
                        word = word + st.charAt(i);
                    }
                }
             
            break;
            case 'L':
                for (int i = 0; i<len; i++)
                {
                    if (st.charAt(i) == ' ')
                    {
                        System.out.println(word.charAt(word.length()-1));
                        word = "";
                    }
                    else
                    {
                        word = word + st.charAt(i);
                    }
                }
            break;
        }
    }
}