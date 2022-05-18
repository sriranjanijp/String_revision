/*
 * Write a program to accept a string. Convert the string into upper case
 * letters. Count and output the number of double letter sequences that exist in
 * the string.
 * Sample Input: "SHE WAS FEEDING THE LITTLE RABBIT WITH AN
 * APPLE"
 * Sample Output: 4
 */
import java.util.Scanner;
class doubleletter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        int len = st.length();
        int count = 0;
        st = st.toUpperCase();
        for (int i = 0; i<(len-1); i++)
        {
            if (st.charAt(i) == st.charAt(i+1))
            {
                count++;
            }
        }
        System.out.println("No of double letter sequences : " + count); 
    }
}