public class Backtracking02
{
    public static int gridWays( int i, int j, int n, int m)  //time complexity : O(2 pow(n+m)).  , space complexity : o(n).
    {
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        else if(i == n || j == n)
        {
            return 0;
        }

        int forRight = gridWays(i,j+1,n,m);
        int forDown = gridWays(i+1, j, n, m);

        int totoalWays = forRight + forDown;

        return totoalWays;
    }

    public static int fact (int n)
    {
        int fact =1;
        for(int i=n; i>=1; i--)
        {
           fact *=i;
        }

        return fact;
    }
    public static int gridWays02(int n , int m)  // timecomplexity: O(n+m)  linear time complexity.
    {
        return (fact(n-1+m-1))/(fact(n-1)*fact(m-1));
    }
     public static void main ( String args[]) 
{
     int n =3, m = 3;
    //  System.out.println(gridWays(0,0, n, m));
    System.out.println(gridWays02(n,m));
} 
 } 