import java.util.*;
public class Factorial02
{
    public static int fact(int num)
    {
        int fact = 1;
        for(int i = num; i>=1; i--)
        {
             fact = fact * i; 
        }
        return fact;
    }
     public static void main ( String args[]) 
{
    Scanner sc = new Scanner (System.in);
    int num = sc. nextInt();
    int fact = fact(num);
    System.out.println(fact);
     
} 
 } 