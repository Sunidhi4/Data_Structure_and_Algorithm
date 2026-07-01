import java.util.*;
public class FeverOrNot
{
     public static void main ( String args[]) 
{
     double temp ;
     Scanner sc = new Scanner (System.in);
     System.out.println("How much temperature you have ");
     temp = sc.nextDouble();
     String a = "you have fever !";
     String b = "You dont have fever ";
     String ans = (temp >= 100)? a : b ;
     System.out.println(ans);
} 
 } 