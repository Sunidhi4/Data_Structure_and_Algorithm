public class BitwiseOperators
{
     public static void main ( String args[]) 
{
     System.out.println(5 & 6); // Truth table: 
                                // 0 & 1 = 0
                                // 0 & 0 = 0
                                // 1 & 0 = 0 
                                //1 & 1 = 1.
    
     System.out.println(5 | 6); // 0 | 0 = 0.
                                // 0 | 1 = 1.
                                // 1 | 0 = 1.
                                // 1 | 1 = 1.

     System.out.println( 5 ^ 6); // 0 ^ 0 = 0.
                                 // 0 ^ 1 = 1.
                                 // 1 ^ 0 = 1.
                                 // 1 ^ 1 = 0.

    // binary 1's complement ~0 = 1.
                             // ~1 = 0.
                             //its firstly check number than if its negative mean MSB(most significant bit) is 1 than
                             // again take 1's complement and 1 on it than we get number and due to negative sign so number will negative.
    System.out.println(~5);                                                      
    //binary left shifht if 000101 << 2 then answer is 010100
    // a << b = a * 2 power b.
    System.out.println(5<<2);
    //binary right shifht if 000110 >> 1 then answer is 00011.
    // a >> b = a / 2 power b.
    System.out.println(6>>1);
} 
 } 