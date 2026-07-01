public class CountingSort //if we get good input then time complexity can be O(n). and basically  it give time complexity O(n+range).
{     //O(n + k)
     public static void sort(int arr[])
     {
          int largest = Integer.MIN_VALUE;
          for(int i=0; i<arr.length; i++)
          {
               largest = Math.max(largest, arr[i]);
          }
          int count[] = new int [largest+1];
          for(int i=0; i<arr.length; i++)
          {
               count[arr[i]]++;
          }
          int j = 0;
          for(int i=0; i<count.length; i++)
          {
               while(count[i]>0)
               {
                    arr[j] = i;
                    j++;
                    count[i]--;
               }
          }

     }
     public static void sortDecending(int arr[])
     {
          int largest = Integer.MIN_VALUE;
          for(int i=0; i<arr.length; i++)
          {
               largest = Math.max(largest, arr[i]);
          }
          int count[] = new int [largest+1];
          for(int i=0; i<arr.length; i++)
          {
               count[arr[i]]++;
          }
          int j = 0;
          for(int i = count.length-1; i>=0; i--)
          {
               while(count[i]>0)
               {
                    arr[j] = i;
                    j++;
                    count[i]--;
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
     int arr[] = {1,4,1,3,2,4,3,7};
     sort(arr);
     printarr(arr);
     sortDecending(arr);
     printarr(arr);
     
} 
 } 