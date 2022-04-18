/*
 * Write a method to accept a name as parameter and print its initials. 
 * Example,  
 * Parameter->   AJAY PRATAP SINGH  
 * Output->   A.P.S. 
 */
import java.util.Scanner;
class initials
{
  public static void main (String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your full name");
      String name = sc.nextLine();
      name = " "+ name.toUpperCase();
      int len = name.length();
      char chr;
      for (int i = 0; i < len-1; i++)
      {
          chr = name.charAt(i);
          if ( chr == ' ')
          {
              System.out.print(name.charAt(i+1) + ".");
          }
      }
  }
}
