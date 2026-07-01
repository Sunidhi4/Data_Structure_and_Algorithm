import java.util.*;
public class TreeMap01   //keys are sorted. put,get,remove O(logn)  // red black tree se implementation hota he
{
     public static void main ( String args[]) 
{
     TreeMap<String, Integer> tm = new TreeMap<>();
     tm.put("India",100);
     tm.put("Cannada", 150);
     tm.put("UK", 50);

     System.out.println(tm);
} 
 } 