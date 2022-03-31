/*
 * Write a program to assign a full path and file name as given below. 
 * Using library functions, extract and output the file path, 
 * file name and file extension separately as shown. 

 Input 
  C:\Users\admin\Pictures\ flower. jpg 
 Output 
  Path: C:\Users\admin\Pictures\ 
  File name: flower 
  Extension: jpg 
 */
import java.util.Scanner;
public class filepath
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filepath");
        String fp = sc.nextLine();
        char pathsep = '\\';
        char dotsep = '.';
        int pathsepidx = fp.lastIndexOf(pathsep);
        int dotsepidx = fp.lastIndexOf(dotsep);
        String filep = fp.substring(0,pathsepidx+1);
        String filename = fp.substring(pathsepidx+1,dotsepidx);
        String ext = fp.substring(dotsepidx+1);
        System.out.println("the file path is: " + filep);
        System.out.println("the file name is: " + filename);
        System.out.println("the file extension is: " + ext);
    }
}