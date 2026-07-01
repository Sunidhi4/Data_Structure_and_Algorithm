import java.util.*;
public class practice01
{

    public static boolean isManotonic(ArrayList<Integer> list)
    {
        int n = list.size();

         boolean inc = true;
         boolean dec = true;
         
         for(int i=0; i<n-1; i++)
         {
            if(list.get(i) < list.get(i+1))
            dec = false;

            if(list.get(i) > list.get(i+1))
            inc = false;
         }

         return inc || dec ;
    }

    public static boolean isLonely (ArrayList<Integer> list, int i, int idx)
    {

     for(int j=0; j<list.size(); j++)
     {
          if((list.get(j) == i || list.get(j) == i+1 || list.get(j)  == i-1) && (j != idx))
          {
               return false;
          }
     }

     return true;

    }

    public static void isOcuurence(ArrayList<Integer> list, int key)
    {

     int [] arr = new int [10000];
      
      for(int i=0; i<list.size()-1; i++)
      {
          if(list.get(i) == key)
          {
               arr[list.get(i+1) -1]++;
          }
      }

      int max = Integer.MIN_VALUE;
      int ans =0;

      for(int i=0; i<10000; i++)
      {
          if(arr[i] > max)
          {
               max  = arr[i];
               ans = i+1;
          }
      }

      System.out.println(ans);

    }

    public static ArrayList<Integer> beautifulArray(int n)
    {
     ArrayList<Integer> ans = new ArrayList<>();
     ans.add(1);

     for(int i=2; i<=n ; i++)
     {
          ArrayList<Integer> temp = new ArrayList<>();
          for(Integer e : ans)
          {
               if(2*e<=n) temp.add(e*2);
          }

          for(Integer e : ans)
          {
               if(2*e-1 <=n) temp.add(e*2-1);
          }

          ans = temp;
     }

     return ans;
    }
     public static void main ( String args[]) 
{
     ArrayList<Integer> list1 = new ArrayList<>();
     list1.add(1);
     list1.add(2);
     list1.add(2);
     list1.add(3);

     System.out.println(isManotonic(list1));

     ArrayList<Integer> list2 = new ArrayList<>();
     list2.add(1);
     list2.add(3);
     list2.add(5);
     list2.add(3);

     ArrayList<Integer> Output1 = new ArrayList<>();

     for(int i=0; i<list2.size(); i++)
     {
          if(isLonely(list2, list2.get(i), i)  == true)
          {
                      Output1.add(list2.get(i));
          }
     }

     System.out.println(Output1);

     ArrayList<Integer> list3 = new ArrayList<>();

     list3.add(1);
     list3.add(100);
     list3.add(200);
     list3.add(1);
     list3.add(100);

     isOcuurence(list3, 1);

      int n = 4;
      System.out.println(beautifulArray(n));
} 
 } 