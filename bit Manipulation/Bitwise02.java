public class Bitwise02
{
     public static int clearIthBits(int n, int i)
     {
          int bitmask = (~0)<<i;
          return n & bitmask;
     }
     public static int clearRangeBits(int n, int i, int j)
     {
          int a = ((~0)<<(j+1));
          int b = (1<<i)-1;
          int bitmask = a | b;
          return n & bitmask;

     }
     public static boolean isPowerOfTwo(int n)
     {
          return (n & (n-1)) == 0;
     }
     public static int countSetBits(int n)
     {
          int count = 0;
          while(n>0)
          {
               if((n & 1) != 0)
               {
                    //check our  LSB.
                    count++;
               }
               n = n>>1;
          }
          return count;
     }
     public static int fastExpo(int a, int n)
     { // it will solve the problem in O(log n) n means power.
          int ans = 1;
          while(n > 0)
          {
               if((n & 1) != 0)
               {
                    ans = ans * a;
               } 
               a = a * a;
               n = n>>1;
          }
          return ans;
     }
     public static void main ( String args[]) 
{
     System.out.println(clearIthBits(15, 2));
     System.out.println(clearRangeBits(10, 2, 4));
     System.out.println (isPowerOfTwo(8));
     System.out.println(countSetBits(15));
     System.out.println(fastExpo(2 , 10));
} 
 } 