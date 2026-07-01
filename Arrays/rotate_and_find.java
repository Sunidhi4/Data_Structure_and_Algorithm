public class rotate_and_find
{
    public static int rotated(int nums[], int target)
    {
        int index = -1;
        for(int i=0; i<target; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                int start = nums[0];

                if(j == nums.length - 1)
                {
                    nums[nums.length-1] = start;
                }
                else{
                    nums[j] = nums[j+1];
                }
            }
        }
         for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;


    }
     public static void main ( String args[]) 
{
     int nums1[] = {4, 5, 6, 7, 0, 1, 2};
     System.out.println(" number is at index : "+ rotated(nums1, 0));
      int nums2[] = {4, 5, 6, 7, 0, 1, 2};
     System.out.println(" number is at index : "+ rotated(nums2, 3));
      int nums3[] = {1};
     System.out.println(" number is at index : "+ rotated(nums3, 0));
} 
 } 