public class SubString
{
    public static String Sub(String str, int si, int ei)
    {
        String substr = "";
        for(int i=si; i<ei; i++)
        {
            substr += str.charAt(i); 
        }
        return substr;
    }
     public static void main ( String args[]) 
{
     String str = "Hello World";
    //  System.out.println(Sub(str, 0, 7)); //this method is made by us.
     System.out.println(str.substring(0, 5)); //its inbulit method for substring
     String fruits[] = {"apple", "mango", "banana"};
     //we will compare strings lexicographically
     String largest = fruits[0];
     for(int i=1; i<fruits.length; i++)
     {
        if(largest.compareTo(fruits[i])<0) //)(x*n) will be the time complexity.
        {
            largest = fruits[i];
        }
     }
     System.out.println(largest);
     

} 
 } 