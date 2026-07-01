class Solution 
{
    static int rec( int i, int nums[], int n, int dp[])
    {
         if( i>=n)
         {
             return 0;
         }
        if( dp[i]!=-1)
        {
            return dp[i];
        }
 
        int ans=0;
 
        int take = nums[i] + rec(i+2, nums, n, dp);
        int notTake = rec(i+1, nums,n, dp);
 
        ans= Math.max( take, notTake);
 
        dp[i]= ans;
        return ans;
    }
    public int rob(int[] nums)
    {
        int n = nums.length;
        int dp[]= new int[n];
 
        for( int i=0;i<n;i++)
            dp[i]=-1;
 
        return rec( 0, nums,n, dp);
    }
}

class Solution
{
   static int rec( TreeNode curr, HashMap<TreeNode, Integer>dp)
   {
        if( curr==null)
        {
            return 0;
        }
 
        if( dp.containsKey( curr)== true)
        {
            return dp.get(curr);
        }
 
        int notTake = rec( curr.left ,dp)+ rec( curr.right, dp);
 
        int take = curr.val;
 
        if(curr.left!=null)
        {
              take+= rec( curr.left.left, dp) + rec( curr.left.right, dp);
        }
 
        if( curr.right!=null)
        {
            take+= rec( curr.right.left, dp)+ rec( curr.right.right, dp);
        }
 
        int ans = Math.max( take, notTake);
 
        dp.put( curr, ans);
 
        return ans;
   }
   public int rob(TreeNode root)
   {
       HashMap<TreeNode, Integer> dp = new HashMap<>();
       return rec( root ,dp);
   }
}

 int rec( int i, int W, int val[], int wt[], int dp[][], int n)
   {
       if( i==n || W==0)
       {
           return 0;
       }
       if( dp[i][W]!=-1)
       {
           return dp[i][W];
       }
       int ans=0, take=0, notTake=0;
 
       if( wt[i]>W)
       {
           notTake = rec( i+1, W, val, wt, dp, n);
       }
       else  // take or notTake
       {
            take = val[i] + rec( i+1, W - wt[i], val, wt, dp,n);
            notTake = rec( i+1, W, val, wt, dp, n);
       }
        ans = Math.max( take, notTake);
        dp[i][W]= ans;
        return ans;
   }


 
import java.util.Arrays;
 
public class GenerateParenthsis {
    static int countValidParenthesis(int[][] dp, int open, int total, int n) {
        if(total == 2*n) {
            return 1;
        }
 
        if(dp[open][total] != -1) {
            return dp[open][total];
        }
 
        int ans =0;
        if(open < n) {
            ans+=countValidParenthesis(dp, open+1, total+1, n);
        }
 
        if((total-open)< open) {
            ans+=countValidParenthesis(dp, open, total+1, n);
        }
        dp[open][total] = ans;
        return ans;
    }
 
    public static void main(String[] args) {  
        int n=3;
 
        int[][] dp = new int[n+1][2*n+1];
 
        for(int i=0; i<=n; i++) {
            Arrays.fill(dp[i], -1);
        }
 
        int ans = countValidParenthesis(dp, 0, 0, n);
        System.out.println(ans);
    }
}
 

class Solution {
    static int count( String strs)
    {
         int count=0;
         for( int i=0;i<strs.length();i++)
         {
              if( strs.charAt(i)=='0')
              {
                   count++;
              }
         }
        return count;
    }
    static int rec( int i, int m, int n,String strs[], int dp[][][] )
    {
        if( i== strs.length)
        {
            return 0;
        }
        if( m==0 && n==0)
        {
             return 0;
        }
        if( dp[i][m][n]!=-1)
        {
            return dp[i][m][n];
        }
 
        int ans=0, take=0, notTake=0;
 
        int c0 = count( strs[i]);
        int c1= strs[i].length()-c0;
 
        if( c0 > m || c1>n)
        {
             notTake = rec(i+1, m,n, strs, dp);
        }
        else
        {
            take = 1+ rec(i+1, m-c0,n-c1, strs, dp);
            notTake = rec(i+1,m,n, strs, dp);
        }
        ans = Math.max( take, notTake);
 
        dp[i][m][n]= ans;
        return ans;
    }
    public int findMaxForm(String[] strs, int m, int n)
    {
         int size= strs.length;
 
         int dp[][][]= new int[size][m+1][n+1];
 
         for( int i=0;i<size;i++)
         {