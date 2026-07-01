import java.util.*;
public class Divide_and_Conquer
{
    public static  int merge(int arr[], int l, int mid, int r)
    {
        int n1 = mid-l+1; // [l,mid]mid-l+1
        int n2 = r-mid; //[mid+1,r]r-(mid+1)+1

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i<n1; i++)
        {
            L[i] = arr[l+i]; //arr[l], arr[l+1], arr[l+2]
        }
        for(int i=0; i<n2; i++)
        {
            R[i] = arr[mid+1+i]; //arr[mid+1], arr[mid+2], arr[mid+3]
        }

        int i=0, j=0;
        int k = l;
        int ans = 0;

        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            else
            {
                ans += (n1-i);
                arr[k] = R[j];
                k++;
                j++;
            }

        }

        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

        return ans;
    }

    static int sort(int arr[], int l, int r)
    {
        int count = 0;
        if(l<r)
        {
            int mid = (l+r)/2;
            count += sort(arr, l , mid);
            count += sort(arr, mid+1, r);
            count += merge(arr, l , mid, r);
        }

        return count;
    }

     public static  void  merge2( String arr[], int l, int mid, int r)
    {
        int n1 = mid-l+1; // [l,mid]mid-l+1
        int n2 = r-mid; //[mid+1,r]r-(mid+1)+1

        String L[] = new String[n1];
        String R[] = new String[n2];

        for(int i=0; i<n1; i++)
        {
            L[i] = arr[l+i]; //arr[l], arr[l+1], arr[l+2]
        }
        for(int i=0; i<n2; i++)
        {
            R[i] = arr[mid+1+i]; //arr[mid+1], arr[mid+2], arr[mid+3]
        }

        int i=0, j=0;
        int k = l;

        while(i<n1 && j<n2)
        {
            if(L[i].compareTo(R[j]) <= 0)
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = R[j];
                k++;
                j++;
            }

        }

        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

        
    }

     static void  sort2(String  arr[], int l, int r)
    {
        
        if(l<r)
        {
            int mid = (l+r)/2;
             sort2(arr, l , mid);
             sort2(arr, mid+1, r);
             merge2(arr, l , mid, r);
        }

        
    }

     public static void main ( String args[]) 
{
     int arr[] = {9, 6, 3, 4, 2, 8, 7, 1};
     int n = arr.length;
     int ans = sort(arr, 0 , n-1);

     System.out.println(ans);

     for(int i=0; i<n; i++)
     {
        System.out.print(arr[i]+" ");
     }
     System.out.println();

     String arr2[] = {"yash", "sidra", "nikhil", "ayush"};
     int n2 = arr2.length;
     sort2(arr2, 0, n2-1);

     for(int i=0; i<n2; i++)
     {
        System.out.print(arr2[i]+" ");
     }
     System.out.println();
} 
 } 