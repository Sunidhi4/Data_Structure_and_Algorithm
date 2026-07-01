public class checkNumberBitwise 
{
    public static void oddOrEven(int n)
    {
        //LSB (least significant bit) of number if 0  its even and if 1 then its odd.
        int bitmask = 1;
        if((n & bitmask) == 0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
    public static int getIthBit(int n, int i)
    {
        int bitmask = 1<<i;
        if((n & bitmask) == 0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i)
    {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n, int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n, int i, int newBit)
    {
        // if(newBit == 0)
        // {
        //     return clearIthBit(n , i);
        // }
        // else{
        //     return setIthBit(n , i);
        // }
         n = clearIthBit(n, i);
         int bitmask = newBit<<i;
         return n | bitmask;
    }
     public static void main ( String args[]) 
{
     oddOrEven(3);
     oddOrEven(12);
     System.out.println(getIthBit(10, 3));
     System.out.println(setIthBit(10, 2));
     System.out.println(clearIthBit(10,1));
     System.out.println(updateIthBit(10, 2, 1));
} 
 } 