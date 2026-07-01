import java.util.*;
public class pattern01
{
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     System.out.println("how many lines you want to print : ");
     int n = sc. nextInt();
     for(int i = 1 ; i<=n ; i++)
     {
        for(int j = 1 ; j <=n; j++)
        {
          if(i - j >= 0 )
            System.out.print("*");
        }
        System.out.println();
     }
} 
 } 