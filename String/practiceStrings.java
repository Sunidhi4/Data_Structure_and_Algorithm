import java.util.*;
public class practiceStrings
{
    public static int vowelOccured(String str)
    {
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static void  isAnagrams(String str1, String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char str11[] = str1.toCharArray();
        char str22[] = str2.toCharArray();
        Arrays.sort(str11);
        Arrays.sort(str22);

        System.out.println("two Strings are anagrams : "+ Arrays.equals(str11, str22));
    }
    public static void interns(String str1)
    {
        String str2 = new String("sunidhi");
        str2 = str2.intern();  // intern key use to take obj string into string pool.
        System.out.println(str1 == str2);

    }
     public static void main ( String args[]) 
{
     String str1 = "sunflower";
     System.out.println("occurenece of lowercase vowels is : "+ vowelOccured(str1));
     String str11 = "silent";
     String str22 = "listen";
     isAnagrams(str11, str22);
     String name = "sunidhi";
     interns(name);
} 
 } 