/*
 * Write a program to accept a string and display 

 * The number of lower case characters  

 * The number of upper case characters 

 * The number of special characters 

 * Number of digits 

 * Sample input: AVBsde@123
 */
import java.util.Scanner; 
class chkspecial 
{ 
    public static void main() 
    { 
        Scanner sc = new Scanner(System.in); 
        int a,p,uc=0,lc=0,d=0,spl=0; 
        String st; 
        char chr; 
        System.out.println("Enter a string"); 
        st= sc.nextLine(); 
        p=st.length(); 
        for(a=0;a<p;a++) 
        { 
            chr=st.charAt(a); 
            if(Character.isUpperCase(chr)) 
                uc++; 
                else if(Character.isLowerCase(chr)) 
                lc++; 
                else if(chr>='0' && chr<='9') 
                d++; 
                else 
                spl++; 
            } 
        System.out.println(uc); 
        System.out.println(lc); 
        System.out.println(d); 
        System.out.println(spl); 
        } 
    } 