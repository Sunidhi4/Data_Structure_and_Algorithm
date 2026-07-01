public class PrintXPower
{
    public static int power(int x, int n) //T.C = O(n) and S.C = O(n).
    {
        if(n == 0)
        {
            return 1;
        }
        int pow = x * power(x, n-1);
        return pow;

    }
    public static int optimalPowerFunction(int x, int n)   // T.c = O(logn)
    {
        if(n == 0)
        {
            return 1;
        }
        int halfPower =  optimalPowerFunction(x, n/2);
          int halfPowerSq = halfPower * halfPower;
         if(n % 2 != 0)
         {
            halfPowerSq = x * halfPowerSq;
         }
         return halfPowerSq;

    }
     public static void main ( String args[]) 
{
     System.out.println(power(2, 10));
     System.out.println(optimalPowerFunction(2, 10));
} 
 } 