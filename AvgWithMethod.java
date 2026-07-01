import java.util.*;
public class AvgWithMethod
{
    public static double average(double a, double b, double c)
    {
        double sum = a+b+c;
        double avg = sum/3;
        return avg;
    }
     public static void main ( String args[]) 
{
    Scanner scn = new Scanner (System.in);
    System.out.println("Enter three numbers : ");
    double a = scn.nextDouble();
    double b = scn.nextDouble();
    double c = scn. nextDouble();
    double avg = average(a,b,c);
    System.out.println("Average of three number is : "+avg);
     
} 
 } 