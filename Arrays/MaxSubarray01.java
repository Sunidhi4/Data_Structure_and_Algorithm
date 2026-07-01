//prefix sum approach
public class MaxSubarray01
{
    public static void MaxSubarraySum(int numbers[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
         prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i; j<numbers.length; j++)
            {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.print(currSum+" ");
                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum = "+ maxSum);
    }
     public static void main ( String args[]) 
{
     int numbers[] = {1, -2, 6, -1, 3};
     MaxSubarraySum(numbers);
} 
 } 