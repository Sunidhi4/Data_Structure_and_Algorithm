import java.util.*;
public class PositiveOrNegative
{
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your number : ");
     int num = sc.nextInt();
    //   String a = "positive";
    //   String b = "negative" ;
    //  String ans =  (num >= 0 )? a : b;
    //  System.out.println(ans );
    if (num > 0)
    {
        System.out.println("Positive number ");
    }
    else if (num==0)
    {
        System.out.println("number equals zero ");
    }
    else 
    {
        System.out.println("number is negative ");
    }
      } 
 } 