public class practiceBitManipulation
{
    public static void swap(int a, int b)
    {
        System.out.println("a : "+a +" , b : "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a : "+a +" , b : "+b);
    }
    public static void upperCases()
     {
    //     for(char ch = 'A'; ch <= 'Z'; ch++)
    //     {
    //         System.out.print((char)(ch |''));
    //     }
    }
     public static void main ( String args[]) 
{
     swap(7, 20);
     int x = 6;
     System.out.println(x + " + 1  is "+ -~x);
     int y = -4;
     System.out.println(y+" + 1 is "+-~y);
     upperCases();
} 
 } 