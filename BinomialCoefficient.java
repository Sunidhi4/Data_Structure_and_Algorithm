import java.util.*;
public class BinomialCoefficient
{
    public static int fact (int num)
    {
        int f = 1; ;
        for(int i =1; i<=num; i++)
        {
            f = f*i;
        }
        return f;
    }
    public static int Bc(int n , int r)
    {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int bincf = fact_n /(fact_r * fact_nmr) ;
        return bincf;
    }
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int r = sc.nextInt();
     int bfc = Bc(n , r);
     System.out.println(bfc);
} 
 } 