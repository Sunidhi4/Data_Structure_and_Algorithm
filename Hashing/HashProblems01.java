import java.util.*;
public class HashProblems01
{
    static void majorityElement(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            // if(map.containsKey(arr[i]))
            // {
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else {
            //     map.put(arr[i], 1);
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Set<Integer> keySet = map.keySet();
        for(Integer key : map.keySet())
        {
            if(map.get(key) > arr.length/3)
            {
                System.out.println(key);
            }
        }
    }

    static boolean validAnagram(String s, String t)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            if(map.get(ch) != null)
            {
                if(map.get(ch) == 1)
                {
                   map.remove(ch);
                }
                else
                {
                    map.put(ch, map.get(ch) - 1);
                }
            }
            else
            {
                return false;
            }
        }

        return map.isEmpty();

    }
     public static void main ( String args[]) 
{
     int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
     majorityElement(arr);
     String s = "heart";
     String t = "earth";
     System.out.println(validAnagram(s, t));
} 
 } 