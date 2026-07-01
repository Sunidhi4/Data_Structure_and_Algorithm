import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort // inbuiltsorting methon give time complexity nlogn which is better than bubble,selection and insertion sort.
{
     public static void main ( String args[]) 
{
     Integer arr[] = {5,4,1,2,3};
     Arrays.sort(arr);
     for(int i=0; i<arr.length; i++)
     {
        System.out.print(arr[i]+" ");
     }
     System.out.println();
     //aArrays.sort(arr,starting index, ending index)
     int num[] = {5,4,3,2,1};
     Arrays.sort(num,0,3);
     for(int i=0; i<num.length; i++)
     {
        System.out.print(num[i]+" ");
     }
     System.out.println();
     //if you want to sort in decending order by inbuilt sort.
    // Arrays.sort(arr,si,ei,Collections.reverseOrder())
     Arrays.sort(arr,Collections.reverseOrder());
     for(int i=0; i<arr.length; i++)
     {
        System.out.print(arr[i]+" ");
     }
     System.out.println();

} 
 } 