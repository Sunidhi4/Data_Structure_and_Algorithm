import java.util.*;
public class LeapYear
{
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     System.out.println("enter the year : ");
     int year = sc.nextInt();
     int a = year % 4 ;
     int b =  year % 100;
     int c = year % 400;
        if((b==0 && c==0) || a==0)
        {
            System.out.println("year is leap year ");
        }
        else {
            System.out.println("year is not a leap year ");
        }
     }

} 
 