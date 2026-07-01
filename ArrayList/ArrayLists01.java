import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists01
{

    public static void swap(ArrayList<Integer>list, int idx1, int idx2)
    {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
     public static void main ( String args[]) 
{
     ArrayList<Integer> list01 = new ArrayList<>();
     ArrayList<Integer> list = new ArrayList<>(); 
     ArrayList<String> list02 = new ArrayList<>();
     ArrayList<Boolean> list03 = new ArrayList<>();

// add element    time complexity: O(1)
     list01.add(1);
     list01.add(2);
     list01.add(3);
     list01.add(4);

     list01.add(1,9);  //O(n)

     System.out.println(list01);

     // Get operation   time complexity : O(1)

     int element = list01.get(2);
     System.out.println(element);

     //Delete/Remove  time complexity : O(n)

     list01.remove(2);
     System.out.println(list01);

     //Set Element at index   time complexity : O(n)

     list01.set(2,10);
     System.out.println(list01);

     // Contain Elemnt time complexity : O(n)

     System.out.println(list01.contains(1));
     System.out.println(list01.contains(11));

    System.out.println(list01.size());

    // Reverse the arraylist

    for(int i = list01.size()-1; i>=0; i--)
    {
        System.out.print(list01.get(i)+" ");
    }
    System.out.println();


// find the maximum element in arraylist
    int max = Integer.MIN_VALUE;
     
     for(int i =0; i<list01.size(); i++)
     {
        
        max = Math.max(max,list01.get(i));
     }

     System.out.println("max element = "+max);

     // Swap to elmement in Arraylist

     list.add(23);
     list.add(20);
     list.add(3);
     list.add(42);
     list.add(15);

     System.out.println(list);

     int idx1 =1, idx2 = 3;

     swap(list, idx1, idx2);

     System.out.println(list);

     //Sorting in array list

     Collections.sort(list);
     System.out.println(list);
     Collections.sort(list, Collections.reverseOrder());  
     System.out.println(list);
     

} 
 } 