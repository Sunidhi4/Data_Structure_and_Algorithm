import java.util.*;
public class Activity_Selection01  //T.c = O(n)
{    // this approach is used when time array is sorted in ascending order
     public static void main ( String args[]) 
{
     int start[] = {1,3,0,5,8,5};
     int end[] = {2,4,6,7,9,9};

     int maxAct = 0, lastEnd = end[0];
     ArrayList<Integer> ans = new ArrayList<>();
     maxAct = 1;
     ans.add(0);
     for(int i=0; i<end.length; i++)
     {
        if(start[i] >= lastEnd)
        {
        maxAct++;
        ans.add(i);
        lastEnd = end[i];
        }
     }

     System.out.println("max Activity = "+maxAct);
     for(int i=0; i<ans.size(); i++)
     {
        System.out.print("A"+ans.get(i)+" ");
     }

     System.out.println();
} 
 } 