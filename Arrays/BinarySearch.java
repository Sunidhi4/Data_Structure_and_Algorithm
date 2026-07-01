public class BinarySearch
{
    public static int BinarySearchdemo(int numbers[], int key)
    {  //for appplying binary search array should be in sorted order
        int start = 0, end = numbers.length-1;
        while(start<=end)  //loop will run till start and end index become equal
        {
            int mid = (start+end)/2;
            if(numbers[mid] == key)  // if find key value in mid then return mid index directly
            {
                return mid;
            }
            if(numbers[mid]<key) // if mid index is smaller than key than start become mid+1.
            {
                start = mid+1;
            }
            else{  //  if mid index value is grater than key than end will be mid-1.
                end = mid-1;
            }
        }
        return -1;
    }
     public static void main ( String args[]) 
{
    int numbers[] = {1,2,3,4,5,6,7,8,9,10};
    int key = 7;
    System.out.println("index for key is : "+BinarySearchdemo(numbers, key));
     
} 
 } 