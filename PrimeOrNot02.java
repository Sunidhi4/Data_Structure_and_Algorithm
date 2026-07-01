import java.util.*;
public class PrimeOrNot02   // It is optimized way to calculate prime.
{
    public static boolean prime(int num)
    {
        //corner cases
        if(num==2)
        {
            return true;
        }
        for(int i =2 ;i<=Math.sqrt(num);i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;

    }
     public static void main ( String args[]) 
{
    Scanner sc = new Scanner (System.in);
    int n = sc. nextInt();
    boolean msg = prime(n);
    System.out.println(msg);
     
} 
 } 