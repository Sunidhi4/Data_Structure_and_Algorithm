import java.util.*;
public class PrimeOrNot01
{
    public static String prime(int num)
    {
        //corner cases
        if(n==2)
        {
            return "prime";
        }
        for(int i =2 ;i<=num-1;i++)
        {
            if(num%i == 0)
            {
                return "not prime";
            }
        }
        return "prime";

    }
     public static void main ( String args[]) 
{
    Scanner sc = new Scanner (System.in);
    int n = sc. nextInt();
    String msg = prime(n);
    System.out.println(msg);
     
} 
 } 