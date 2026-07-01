import java.util.*;
public class CheckPalindrome
{
    public static boolean chkp(int num )
    {
        int num1 = num;
        int rev = 0;
        int pow = 0;
        while(num>0)
        {
            int rem = num % 10 ;
            rev = rev*10 + rem;
            pow++;
            num = num/10;
        }
        if(num1 == rev)
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
     int n = sc. nextInt();
     System.out.println(chkp(n));
} 
 } 