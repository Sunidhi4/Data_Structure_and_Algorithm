import java.util.*;
public class ProductOfNumbers
{
     public static int Product(int a , int b)
     {
          int pr = a*b;
          return pr;
     }
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     int x = sc. nextInt();
     int y =  sc.nextInt();
     int pr = Product(x , y);
     System.out.println(pr);
     
} 
 } 