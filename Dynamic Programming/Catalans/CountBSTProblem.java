import java.util.*;
public class CountBSTProblem
{
    public static int countBST(int n)
    {
        int dp[] = new int[n+1];

        dp[0] = dp[1] = 1;

        for(int i=2; i<n+1; i++)
        {
            for(int j=0; j<i; j++)
            {
                int rightSubtree = dp[j];
                int leftSubtree = dp[i-j-1];
                dp[i] += rightSubtree * leftSubtree;
            }
        }

        return dp[n];
    }

     public static void main ( String args[]) 
{
     int n = 4;
     System.out.println(countBST(n));
} 
 } 