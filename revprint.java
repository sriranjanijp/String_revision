/*
 * Write a method to accept a word and print it in the following way: Parameter->     TRIAL  

Output->     
L        

AL        

IAL        

RIAL        

TRIAL 
 */
class revprint
{     
   public static void main(String s)     
   {         
     int i,j;         
     for(i=s.length()-1;i>=0;i--)         
      {             
       for(j=i;j<s.length();j++)             
        {                 
           char x=s.charAt(j);                
           System.out.print(x);            
        }             
       System.out.println();       
     }     
   } 
 } 