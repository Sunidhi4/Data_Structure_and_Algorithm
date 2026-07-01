public class BubbleSortingDemo
{
    // time complexity : best case : O(n)
    //                   wrost or average case : O(n^2)
    public static void sortAscending(int arr[])
    {
        
        for(int turn=0; turn<arr.length-1; turn++)
        {
            boolean swap = false;   
            for(int j=0; j<arr.length-1-turn; j++)
            {     
                      if(arr[j]>arr[j+1])
                      {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swap = true;
                      }
                      
            }
            System.out.println("swap at turn "+ turn + " = "+swap);
                       if(!swap)
                       {
                        return ;
                       }
           
            
        }
       
    }
    public static void sortDecending(int arr[])
    {
        for(int turn=0; turn<arr.length-1; turn++)
        {
            boolean swap = false;
            for(int j=0; j<arr.length-1-turn; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            System.out.println("swap at turn "+ turn + " = "+swap);
                       if(!swap)
                       {
                        return ;
                       }
        }

    }
    public static void printarr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main ( String args[]) 
   {
     int arr[] = {1,2,3,4,5};
     sortAscending(arr);
     printarr(arr);
     sortDecending(arr);
     printarr(arr);
    } 
} 