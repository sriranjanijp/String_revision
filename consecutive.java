/*
 * Write a program to input a sentence. Convert the sentence into upper
 * case letters. Display the words along with frequency of the words which
 * have at least a pair of consecutive letters.
 * Sample Input: MODEM IS AN ELECTRONIC DEVICE
 * Sample Output:
 * MODEM
 * DEVICE
 * Number of words containing consecutive letters: 2
 */
import java.util.Scanner;
class consecutive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        st = st.toUpperCase() + " ";
        String word ="";
        char ch;
        int len = st.length();
        int count = 0;
        for (int i = 0; i<len; i++)
        {
            ch = st.charAt(i);
            if (ch == ' ')
            {
                for (int j = 0; j< (word.length()-1); j++)
                {
                    if (word.charAt(j)+1 == word.charAt(j+1))
                    {
                        System.out.println(word);
                        count++;
                    }
                }
                word = "";
            }
            else
            word = word + ch;
        }
        System.out.println("Number of words containing consecutive letters: " + count);
    }
}
 