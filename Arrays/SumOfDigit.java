import java.util.*;
public class SumOfDigit
{
     public static void main ( String args[]) 
{
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a number : ");
     int num = sc. nextInt();
     int sum = Sum(num);
     System.out.println("Sum of digits in number is : "+ sum); 
} 
public static int Sum(int n)
{
    int sum = 0;
    while(n>0)
    {
        int rem = n % 10;
        sum = sum + rem;
        n = n/10;
    }
    return sum;
}
 } 