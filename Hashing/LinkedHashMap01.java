import java.util.*;
public class LinkedHashMap01
{
     public static void main ( String args[]) 
{
     LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();  //  insertion order maintanance
     lhm.put("India", 100);
     lhm.put("Cannada", 150);
     lhm.put("USA", 50);

     System.out.println(lhm);
} 
 } 