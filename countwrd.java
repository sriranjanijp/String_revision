/*
 * Write a program to accept a sentence and a word separately. Find and print the frequency of the given word in the sentence. 
 * Sample Input: hello how are you hello where are you going  
 * Input :hello 
 * Sample output :2 
 */
import java.util.Scanner;
class countwrd
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st = sc.nextLine();
        System.out.println("Enter a word to search");
        String wrd = sc.nextLine();
        st = st +" ";
        int fr = 0;
        char chr;
        String c1="";
        int len = st.length();
        for (int i = 0; i<len;i++)
        {
            chr = st.charAt(i);
            if (chr == ' ')
            {
              if(c1.compareTo(wrd) == 0)
              {
                  fr = fr + 1;
              }
              c1 = "";
            }
            else
            c1 = c1 + chr;
        }
        System.out.println("There are "+ fr + " instances of the word " + wrd);
    }
}