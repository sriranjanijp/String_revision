/*
 *     Write a program in java to accept a word and
 *     display the same in pig latin form. 
 * Sample input: TROUBLE 
 * SAMPLE OUTPUT:  OUBLETRAY 
 * S3=S1+S2+”AY” 
 */
import java.util.Scanner;
class piglatin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        int len = word.length();
        char t;
        int i;
        for (i = 0; i<len; i++)
        {
            t = word.charAt(i);
            if (t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
            t=='A'||t=='E'||t=='I'||t=='O'||t=='U')
            {
                break;
            }
        }
        String st1 = word.substring(0,i);
        String st2 = word.substring(i,len);
        String st3 = st2+st1+"ay";
        System.out.println(st3);
    }
}