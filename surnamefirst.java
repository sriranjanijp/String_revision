/*
 * Write a program in Java to accept a name containing three words and
 * display the surname first, followed by the first and middle names.
 * Sample Input: MOHANDAS KARAMCHAND GANDHI
 * Sample Output: GANDHI MOHANDAS KARAMCHAND
 */
import java.util.Scanner;
class surnamefirst
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter full name");
        String st = sc.nextLine();
        int len = st.length();
        int lsp = st.lastIndexOf(' ');
        String sur = st.substring((lsp+1),len);
        String name = st.substring(0,(lsp+1));
        System.out.println(sur + " " + name);
    }
}