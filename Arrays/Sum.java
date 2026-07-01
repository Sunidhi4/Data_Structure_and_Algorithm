import java.util.*;
public class Sum
{
     public static void main ( String args[]) 
{
    Scanner sc = new Scanner (System.in);
    int n = 1;
    int evensum = 0;
    int oddsum = 0;
    while(n == 1){
    System.out.println("Enter your number : ")  ;
    int  num  = sc . nextInt();
    if(num % 2 == 0)
    {
        evensum = evensum + num;
    }
    else{
        oddsum = oddsum + num ;
    }
    System.out.println ("Enter 1 to continue ");
    n = sc. nextInt();
    }
    System.out.println("your even number sum is : "+ evensum);
    System.out.println("your odd number sum is : "+oddsum);
 } 
}