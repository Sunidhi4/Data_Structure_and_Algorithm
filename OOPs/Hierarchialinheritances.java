public class Hierarchialinheritances
{
     public static void main ( String args[]) 
{
     Mammal human = new Mammal();
     human.eat();
     human.walk();
     Fish goldFish = new Fish ();
     goldFish.eat();
     goldFish.swim();
     Bird sparrow = new Bird();
     sparrow.breath();
     sparrow.fly();
} 
 } 
 class Animals  // Base class
 {
    String color;
     
     void eat()
     {
        System.out.println("They can eat !");
     }

     void breath()
     {
        System.out.println("They can breath ! ");
     }
 }
class Mammal extends Animals{
    void walk()
    {
        System.out.println("They can walk ! ");
    }
}
class Fish extends Animals{
    void swim()
    {
        System.out.println("they can swim !");
    }
}
class Bird extends Animals
{
    void fly()
    {
        System.out.println("they can fly ");
    }
}