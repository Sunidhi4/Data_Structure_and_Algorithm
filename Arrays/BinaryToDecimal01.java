public class BinaryToDecimal01
{
    public static void binToDec(int binNum)
    {
        int pow = 0;
        int decNum = 0;
        int myn = binNum;
        while(binNum>0)  // loop will run till binNum is greater than 0.
        {
            
            int lastDigit = binNum % 10; // mwe will last value of right so 2 pow is in start than increase by 1 in 
            //next time
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        } 
        System.out.println("decimal 0f "+ myn +" = "+ decNum);
        
           }
     public static void main ( String args[]) 
{
     binToDec(1000);
} 
 } 