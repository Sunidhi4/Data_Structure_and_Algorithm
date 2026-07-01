public class Polymorphisms
{
     public static void main ( String args[]) 
{ Calculator calc = new Calculator();
     System.out.println(calc.sum(1,2));
     System.out.println(calc.sum((float)1.4,(float)2.6));
     System.out.println(calc.sum(1,2,4));
     Dear d = new Dear();
     d.eat(); 
} 
 } 

class Animal{
    void eat()
    {
        System.out.println("eats anything ");
    }

}
class Dear extends Animal{
    void eat()
    {
        System.out.println("eat grass");
    }
}
 class Calculator
 {
    int sum (int a, int b)
    {
        return a+b;
    }

    float sum (float a, float b)
    {
        return a+b;
    }
    float sum (int a, int b, int c)
    {
        return a+b+c;
    }
 }