/*
 * Write a program to accept a string as a sentence. 
 * Display the new string after reversing the characters of each word 
 * Sample Input : New Delhi is the capital of India 
 * Sample output: weN ihleD si eht latipac fo aidnI 
 */
import java.util.Scanner; 
class Rev_char 
{ 
    public static void main() 
    { 
        String st,st1=" ", st2=" "; 
        int i,p; 
        char chr; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter a string"); 
        st= sc.nextLine(); 
        st = st+" "; 
        p=st.length(); 
        for (i=0;i<p;i++) 
        { 
            chr=st.charAt(i); 
            if(chr==' ') 
            { 
                st2=st2+ ' '+st1; 
                st1= ""; 
            } 
            else 
            st1=chr+st1; 
        } 
        System.out.println(st2); 
    } 
} 