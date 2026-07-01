import java.util.*;
public class DuplicateArray
{
    public static boolean Duplicate(int nums[])
    {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
        {
            int j = i+1;
            if(nums[i] == nums[j])
            {
                return true;
            }

        }
         return false;
         
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++)
        // { 
        //     if(nums[i] > max)
        //     {
        //         max = nums[i];
        //     }

        // }
        // int dup[] = new int[max+1];
        // for(int i=0; i<nums.length; i++)
        // {
        //     dup[nums[i]]++;
        // } 

        // for(int i=0 ; i<dup.length; i++)
        // {
        //     if(dup[i] > 1)
        //     {
        //         return true;
        //     }
        // }

        // return false;

    }
     public static void main ( String args[]) 
{
     int nums1[] = { 1, 2, 3, 1};
     System.out.println("for nums1 array : "+ Duplicate(nums1));
     int nums2[] = {1, 2, 3, 4};
     System.out.println("for nums2 array : "+ Duplicate(nums2));
     int nums3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
     System.out.println("for nums3 array : "+ Duplicate(nums3)); 
} 
 } 