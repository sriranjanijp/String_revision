/*
 * Write a program to accept any three letter word and 
 * print all the probable three letter combinations. 
 * No letter should be repeated. 
 * Top Opt,tpo,otp,pto,pot 
 */
import java.util.Scanner;
class combos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-letter word");
        String word = sc.nextLine();
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                for (int k = 0; k<3; k++)
                {
                    if(i!=j && j!=k && k!=i)
                    {
                        String fin = word.charAt(i)+""+word.charAt(j)+""+word.charAt(k);
                        System.out.println(fin);
                    }
                }
            }
        }
    }
}