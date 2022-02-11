import java.util.Scanner;
public class KboatStringReverseWord
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = in.nextLine();
        str = str + " ";
        String word = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                int x = word.length();
                for (int j = x - 1; j >= 0; j--) {
                    char ch2 = word.charAt(j);
                    System.out.print(ch2);
                                   
                }
                System.out.print(" ");
                word = "";
            }
            else {
                word += ch;
            }
        }
    }
}