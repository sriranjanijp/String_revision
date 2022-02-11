/*
 * Write a program to accept a name and display the initials 
 * along with the surname. 

Sample Input:  Mohandas Karamchand Gandhi 

Sample Output: M. K. Gandhi 
 */
import java.util.Scanner; 
class surname 
{ 
    public static void main() 
    { 
        Scanner sc = new Scanner(System.in); 
        String st,st1=" ",st2 = " ",sn; 
        int i,p; 
        char chr; 
        System.out.println("Enter a name"); 
        st = sc.nextLine(); 
        st = ' '+st; 
        p=st.lastIndexOf(' '); 
        sn= st.substring(p); 
        for(i=0;i<p;i++) 
        { 
            chr=st.charAt(i); 
            if(chr==' ') 
            st1=st1+st.charAt(i+1)+"."; 
        } 
        st2=st1+sn; 
        System.out.println("Initials with surname"); 
        System.out.println(st2); 
    } 
} 