public class Constructors
{
     public static void main ( String args[]) 
{
     Student s1 = new Student ();
    // Student s2 = new Student ("sunidhi");
    // Student s3 = new Student(1234);
    s1.name = "sulekha ";
    s1.roll = 3214;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;
    Student s2 = new Student(s1);
    s2.password = "xyz";
    s1.marks[2] = 88;
    for(int i=0; i<3; i++)
    {
        System.out.println(s2.marks[i]);
    }

    
} 
 } 

 class Student {
    String name;
    int roll;
     String password;
     int marks[];

    // Student(Student s1)   // shallow  copy constructor
    //  {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    //  }

     
     Student (Student s1 )  //deep copy constructor 
     {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++)
        {
            this.marks[i] = s1.marks[i];
        }
     }

    Student ()   //non parameterized constructor.
    {
        marks = new int[3];
        // this.name = name ;
        System.out.println("constructor is called");
    }
    Student(String name)   //Parameterized Constructor.
    {
        this.name = name;
    }
    Student(int roll)
    {
        this.roll = roll;
    }
 }