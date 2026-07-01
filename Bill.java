import java.util.*;
public class Bill
{
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     System.out.println("enter the cost of a pencil : ");
     int pencil = sc.nextInt();
     System.out.println("enter the cost of a pen : ");
     int pen = sc.nextInt();
     System.out.println("enter the cost of a eraser : ");
     int eraser = sc.nextInt();
     double total = pencil + pen + eraser ;
     System.out.println("your total is "+total);
     // bill with 18% gst 
     double gst = (total * 18)/100;
     double bill = total+gst;
     System.out.println("your total bill with gst is : "+ bill);
} 
 } 