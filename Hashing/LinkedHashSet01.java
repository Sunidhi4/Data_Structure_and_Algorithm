import java.util.*;
public class LinkedHashSet01
{
     public static void main ( String args[]) 
{
     LinkedHashSet<String> lhs = new LinkedHashSet<>();
     lhs.add("Delhi");
     lhs.add("Noida");
     lhs.add("Banglore");
     lhs.add("Pune");
     lhs.add("Hyderabad");

     System.out.println(lhs);

     TreeSet<String> ts = new TreeSet<>();
     ts.add("Delhi");
     ts.add("Noida");
     ts.add("Banglore");
     ts.add("Pune");
     ts.add("Hyderabad");
    
    System.out.println(ts);

} 
 } 