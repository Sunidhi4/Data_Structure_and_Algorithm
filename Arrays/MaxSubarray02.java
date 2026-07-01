// kadane's Algorithm -> kadanes algorithm says if we sum high neagtive number with small positive number than answer will be negative
//so in protect to write negative highest sum we will consider it zero .and does not do sum of these type of numbers.
public class MaxSubarray02
{
    public static void Kadanes(int numbers[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++)
        {
            cs = cs + numbers[i];
            if(cs<0)
            {
                cs = 0;
            }
            ms = Math.max(cs , ms);
        }
        System.out.println("our max subarray sum is : "+ ms);

    }
     public static void main ( String args[]) 
{
     int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
     Kadanes(numbers);
} 
 } 