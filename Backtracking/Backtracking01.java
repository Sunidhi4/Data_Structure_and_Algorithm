public class Backtracking01
{
    public static void changeArr(int arr[], int i, int val) //timecomplexity O(n).
    // space complexity : O(n).
    {
        if(i == arr.length)
        {
            printArr(arr);
            return;
        }

        arr[i] = val;
        changeArr(arr, i+1, val+1); //function call step
        arr[i] = arr[i]-2;  //backtracking step
    }
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void findSubsets(String str, String ans, int i) //timecomplexity = O(n * 2 pow n).
    // space complexity : O(n)
    {
        if(i == str.length())
        { if(ans.length() == 0)
        {
            System.out.println("null");
            return;
        }
        else{
            System.out.println(ans);
            return;
        }
        }
         findSubsets(str, ans+str.charAt(i), i+1);

         findSubsets(str, ans, i+1);
    }

    public static void permutation(String str, String ans) //time complexity : O(n*n!). 
    // space complexity : O(n)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0; i< str.length(); i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            permutation(newStr, ans+curr); 
        }
    }
     public static void main ( String args[]) 
{
     int arr[] = new int [5];
     changeArr(arr, 0, 1);
     printArr(arr);

     String str = "abc";
     findSubsets(str,"", 0);

     String s = "abc";
     permutation(s,"");
} 
 } 