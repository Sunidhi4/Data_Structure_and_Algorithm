import java.util.Scanner ;
public class AreaOfSquare
{
     public static void main ( String args[]) 
{
     double side ;
     System.out.println("Enter the side of a square : ");
     Scanner sc = new Scanner (System.in);
     side = sc.nextDouble();
     double area = side * side;
     System.out.println("Area of a square is : "+ area);

} 
 } 