public class Hybridinheritances
{
     public static void main ( String args[]) 
{
     Shark s1 = new Shark();
     s1.eat();
     s1.swim();
     s1.speed();
     Human h1 = new Human();
     h1.breath();
     h1.walk();
     h1.brain();
     Peacock p1 = new Peacock();
     p1.breath();
     p1.fly();
     p1.feather();
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
class Dog extends Mammal{
     void breed()
     {
        System.out.println("Dogs have breed also");
     }
}
class Cat extends Mammal
{
    void genes()
    {
        System.out.println("cats have differents types of genes");
    }
}
class Human extends Mammal{
    void brain()
    {
        System.out.println("Humans have ability to think");
    }
}
class Fish extends Animals{
    void swim()
    {
        System.out.println("they can swim !");
    }
}
class Shark extends Fish{
    void speed()
    {
        System.out.println("Shark have very good speed at swimming ");
    }
}
class Tuna extends Fish{
    void food()
    {
        System.out.println("Tuna is vegitarian food lover ");
    }
}
class Bird extends Animals
{
    void fly()
    {
        System.out.println("they can fly ");
    }
}
class Peacock extends Bird
{
    void feather()
    {
        System.out.println("Peacock have beatutiful feather  ");
    }
}