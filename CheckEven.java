import java.util.*;
public class CheckEven
{
    public static boolean isEven(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     System.out.println("enter a number : ");
     int n = sc. nextInt();
     System.out.println(isEven(n));
} 
 } 