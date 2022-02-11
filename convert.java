/*
 * Make the first letter of each word capital.
 */
class convert 
{ 
    public static void main(String str) 
    { 
        String str1=""; 
        int i,p; 
        char chr,chr1; 
        str=' '+str; 
        p=str.length(); 
        for(i=0;i<p;i++) 
        { 
            chr=str.charAt(i); 
            if(chr ==' ') 
            { 
                chr1=str.charAt(i+1); 
                str1=str1+' '+Character.toUpperCase(chr1); 
                i=i+1; 
            } 
            else 
            str1=str1+chr; 
        } 
        System.out.println("the new string:"+ str1); 
        } 
    }             