public class AbstractionsDemo
{
     public static void main ( String args[]) 
{
     Horse h = new Horse(); // when we create a derived class object first its call base class constructor then its own .
     h.eat();
     h.walk();
     h.changeColor();
     System.out.println(h.color);
     Chicken c = new Chicken();
     c.eat();
     c.walk();
} 
 } 
 abstract class Animal{
    String color;
    Animal()
    {
        color = "brown"; // until we does not call change color method all animal color would be brown .
    }
    void eat ()
    {
        System.out.println("animal eats");
    }
     abstract void walk();
 }
 class Horse extends Animal
 {
    void changeColor()
    {
        color = "dark brown";
    }
    void walk ()
    {
        System.out.println("walks on four legs");
    }
 }
 class Chicken extends Animal{
     void changeColor()
    {
        color = "red - yellow";
    }
    void walk ()
    {
        System.out.println("walk on two legs");
    }
 }