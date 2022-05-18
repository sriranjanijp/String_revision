/*
 * A string is said to be ‘Unique’ if none of the letters present in the
string are repeated. Write a program to accept a string and check whether
the string is Unique or not. The program displays a message accordingly.
Sample Input: COMPUTER
Sample Output: Unique String
 */
import java.util.Scanner;
class unique
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String st = sc.nextLine();
        int len = st.length();
        char ch;
        boolean isUni = true;
        for (int i = 0; i<len; i++)
        {
            ch = st.charAt(i);
            for (int j = (i+1); j<len; j++)
            {
                if (ch == st.charAt(j))
                {
                    isUni = false;
                    break;
                }
            }
        }
        if (isUni == true)
        {
            System.out.println("Is unique");
        }
        else
        {
            System.out.println("Is not unique");
        }
    }
}