
/* DEFINATION : Rcursion is a method of solving a computational problem where the solution depends on solution to smaller instances
               of the same problem . */
               
public class Recursion01
{
    public static void  decreasingOrder(int n)
    {
        if(n == 1)
        {
            System.out.print(n);
            return;
        }
         System.out.print(n + " ");
        decreasingOrder(n-1);
    }

    public static void increasingOrder(int n)
    {
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
    }

    public static int factorialOfN(int n)
    {
        int fact;
        if(n == 0)
        {
            return 1;
        }
        fact = n *factorialOfN(n-1);
        return fact;

    }

    public static int sumOfNumbers(int n)
    {
        int sum ;
        if( n == 0)
        {
            return 0;
        }
        sum = n + sumOfNumbers(n-1);
        return sum;
    }
     public static void main ( String args[]) 
{
     decreasingOrder(10);
     System.out.println();
     increasingOrder(10);
     System.out.println();
     System.out.println("factorial of 5 is : "+factorialOfN(5));
     System.out.println("sum of n natural number is : "+sumOfNumbers(10));
} 
 }                 