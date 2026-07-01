public class SelectionSort
{
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length-1; i++)
        {
            int minposition = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minposition] > arr[j])
                {
                    minposition = j;
                }
            }
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }

    }
    public static void sortDecending(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int maxposition = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[maxposition]<arr[j])
                {
                    maxposition = j;
                }
            }

            int temp = arr[maxposition];
            arr[maxposition] = arr[i];
            arr[i] = temp;
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
     int arr [] = {5,4,1,3,2};
     sort(arr);
     printarr(arr);
     sortDecending(arr);
     printarr(arr);
} 
 } 