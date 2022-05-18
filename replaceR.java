/*
 * Consider the sentence as given below:
 * Blue bottle is in Blue bag lying on Blue carpet
 * Write a program to assign the given sentence to a string variable. Replace
 * the word Blue with Red at all its occurrence. Display the new string as
 * shown below:
 * Red bottle is in Red bag lying on Red carpet
 */
class replaceR
{
    public static void main(String[] args)
    {
        String ori = "Blue bottle is in Blue bag lying on Blue carpet ";
        String fin = "";
        String word = "";
        String blue = "Blue";
        String red = "Red";
        int len = ori.length();
        for (int i = 0; i<len; i++)
        {
           char ch = ori.charAt(i);
           if (ch == ' ')
           {
               if (word.equals(blue))
               {
                   fin = fin + red + " ";
               }
               else
               {
                   fin = fin + word + " ";
               }
               word = "";
           }
           else
           word = word + ch;
        }
        System.out.println(ori);
        System.out.println(fin);
    }
}
