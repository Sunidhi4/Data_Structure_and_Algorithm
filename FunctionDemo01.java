import java.util.*;
public class FunctionDemo01
{
    public static int Sum (int num1 , int num2) // num1 and num2 is parameter or formal parameter here . 
    //function defined under class in java thats why it's called method .
    {
        int sum = num1 + num2;
        return sum;

    }
     public static void main ( String args[]) 
{
    Scanner sc = new Scanner (System.in);
    int a = sc. nextInt();
    int b = sc. nextInt();
    int sum = Sum(a, b); // arguments or actual arguments .
    System.out.println(sum); 
} 
 } 