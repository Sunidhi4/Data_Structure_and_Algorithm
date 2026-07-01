public class InheritanceBasic
{
     public static void main ( String args[]) 
{
   //   Fish dolphine = new Fish();
   //   dolphine.breath();
   //   dolphine.swim();
   Dog bobby = new Dog();
   bobby.eat();
   bobby.legs = 4;
   System.out.println(bobby.legs);
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

//  class Fish extends  Animals  //Drived class
//  {
//     int fings ;

//     void swim ()
//     {
//         System.out.println("They can swim");
//     }
//  }
class Mammal extends Animals {
   int legs;
}
class Dog extends Mammal
{
   String breed;
}