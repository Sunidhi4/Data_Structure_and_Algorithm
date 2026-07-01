import java.util.*;
public class ProblemSolutions01
{
    static int count_Distinct_Elements(int num[])
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++)
        {
            set.add(num[i]);
        }

        return set.size();
    }

    static void union_and_Intersection(int arr1[], int arr2[])
    {
         HashSet<Integer> set = new HashSet<>();

         for(int i=0; i<arr1.length; i++)
         {
            set.add(arr1[i]);
         }
         for(int i=0; i<arr2.length; i++)
         {
            set.add(arr2[i]);
         }
         for(Integer i : set)
         {
            System.out.print(i+" ");
         }
         System.out.println("(union = "+set.size()+" )");

         set.clear();

         for(int i=0; i<arr1.length; i++)
         {
            set.add(arr1[i]);
         }

         int count = 0;

         for(int i=0; i<arr2.length; i++)
         {
            if(set.contains(arr2[i]))
            {
                count++;
                set.remove(arr2[i]);
                System.out.print(arr2[i]+" ");
            }
         }
         System.out.println("(intersection = "+count+" )");

    }
  
    static int subarray_Sum_Zero(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++)
        {
            sum += arr[j];
            if(map.containsKey(sum))
            {
                len = Math.max(len, j-map.get(sum));
            }
             else {
                map.put(sum, j);
             }
        }

        return len; 
    }

    static int subarray_Sum_Equal_To_K(int arr[],int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0 ,1);

        int sum = 0, ans = 0;

        for(int j=0; j<arr.length; j++)
        {
            sum += arr[j];
            if(map.containsKey(sum-k))
            {
                ans += map.get(sum-k);
            }
             map.put(sum, map.getOrDefault(sum, 0) + 1);
        } 

        return ans;
    }

    static String getStart(HashMap<String, String> tickets)
    {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet())
        {
            revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;
            }
        }

        return null;
    }
     public static void main ( String args[]) 
{
     int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
     System.out.println("distinct = "+count_Distinct_Elements(num));
     int arr1[] = {7, 3, 9};
     int arr2[] = {6, 3, 9, 6, 2, 4};
     union_and_Intersection(arr1, arr2);

     int arr[] = { 15, -2, 2, -8, 1, 7, 10};
     System.out.println("largest subarray of sum 0 : "+subarray_Sum_Zero(arr));

     int nums[] = {10, 2, -2, -20, 10};
     int k = -10;
     
     System.out.println("Subarray sum equal to K : "+ subarray_Sum_Equal_To_K(nums, k));

     HashMap<String, String> tickets = new HashMap<>();
     tickets.put("Chennai", "Bengaluru");
     tickets.put("Mumbai", "Delhi");
    tickets.put("Goa", "Chennai");
     tickets.put("Delhi", "Goa");

     String start = getStart(tickets);
     System.out.print(start);
     for(String key : tickets.keySet())
     {
        System.out.print(" -> "+tickets.get(start));
        start = tickets.get(start);
     }     

     System.out.println();
} 
 } 