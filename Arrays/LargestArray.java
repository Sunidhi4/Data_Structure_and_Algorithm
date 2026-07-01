import java.util.*;
public class LargestArray
{
    public static int Largest(int numbers[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>largest)
            {
                largest = numbers[i];
            }
        }
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]<smallest)
            {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value in array is : "+smallest);
        return largest;
    }

     public static void main ( String args[]) 
{
    int numbers[] = {1,2,3,6,4,2,1};
    int largest = Largest(numbers);
    System.out.println("the largest number in array is : "+largest);

     
} 
 } 