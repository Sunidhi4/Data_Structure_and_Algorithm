import java.util.*;
public class Strings
{
    public static boolean  ispalindrome(String word)
    {
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-1-i))
            {
                System.out.println("Given word is not palindrome !");
                return true;
            }
        }
        System.out.println("Given word is palindrome !");
        return false;
    }
     public static void main ( String args[]) 
{
    //  String name ;
    //  Scanner scn = new Scanner (System.in);
    //  System.out.println("Enter your name : ");
    // //  name = scn.next();  // scn.next only take one word not more than that.
    // name = scn.nextLine(); // scn.nextLine take all line as input .
    //  System.out.println("your name is : "+ name );
    //  System.out.println("length of string name is : "+ name.length());  // .length() is inbulit function in string to calculate 
    //  // string length and it include space int counting also.
    //   String firstname = "rishi";
    //   String secondname = "pishi";
    //   String fullName = firstname + secondname; // this method of adding two or more than two strings is called string concatenation.
    //   System.out.println(fullName);
    //   System.out.println(fullName.charAt(5)); //charAt method give character which is on number given by as.
       
       String word = "racecar";
      ispalindrome(word);

      String s1 = "Tony";
      String s2 = "Tony";
      String s3 = new String ("Tony");
       if(s1 == s2)  //jb string without "new" key word ke sath use nahi krte he to vo string kisi purani string ko hi point krti he.
       {
        System.out.println("Strings are equals ");
       }
       else
       {
        System.out.println("Strings are not equals ");
       }
       if(s1 == s3) // new key word new string bnati he 
       {
        System.out.println("Strings are equals ");
       }
       else
       {
        System.out.println("Strings are not equals ");
       }

       if(s1.equals(s2))  //  equals function only checks value .
       {
        System.out.println("Strings are equals ");
       }
       else
       {
        System.out.println("Strings are not equals ");
       }
       if(s1.equals(s3))       {
        System.out.println("Strings are equals ");
       }
       else
       {
        System.out.println("Strings are not equals ");
       }
    
       
} 
 } 