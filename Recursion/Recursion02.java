public class Recursion02
{
    public static int NthFibonacciNumber(int n)
    {
        if( n==0 || n==1)
        {
            return n;
        }
        int fnm1 = NthFibonacciNumber(n-1);
        int fnm2 = NthFibonacciNumber(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static boolean checkArrayIsSorted(int [] arr, int i)
    {
        if( i == arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return checkArrayIsSorted(arr, i+1);

    }
    public static int firstOccurence(int arr[], int key, int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
         if(arr[i] == key)
         {
            return i;
         }
         return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key)
        {
            return i;
        }
        return isFound;
    }
     public static void main ( String args[]) 
{
     int n = 5;
     System.out.println(NthFibonacciNumber(n));
     int arr01[] = {1,2,3,4,5,6,7};
     System.out.println(checkArrayIsSorted(arr01, 0));
     int arr02[] = {8, 3, 6, 9, 5, 10, 2, 5, 3 };
     System.out.println(firstOccurence(arr02, 5, 0));
     System.out.println(lastOccurence(arr02, 5, 0 ));
} 
 } 