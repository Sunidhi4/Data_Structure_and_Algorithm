import java.util.*;
public class RecursionProblem
{
    public static void printDecreasing(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void printIncreasing(int n)
    {
        if(n == 0)
        {
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }

    public static int fib(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int lastTerm = fib(n-1);
        int sLastTerm = fib(n-2);
        int nthTerm = lastTerm + sLastTerm;
        return nthTerm;
    }

    public static void toh(int n, int A, int C, int B)
    {
        //move n disk from A to C using B
        if(n == 0)
        {
            return;
        }
        toh(n-1, A, B, C);
        System.out.println("Moving "+n+" th disk from "+A+" to "+C);
        toh(n-1, B, C, A);
    }

    public static int countSubs(String str, int si, int ei)
    {
        if(si > ei)
        {
            return 0;
        }

        int firstCharRemoved = countSubs(str, si+1, ei);
        int lastCharRemoved = countSubs(str, si, ei-1);
        int firstLastCharRemoved = countSubs(str, si+1, ei-1); // common substring after removing first and last char
        int ans = firstCharRemoved + lastCharRemoved + firstLastCharRemoved;
        if(str.chatAt(si) == str.charAt(ei))
        {
            ans++;
        }

        return ans;
    }

     public static void main ( String args[]) 
{
     
} 
 } 