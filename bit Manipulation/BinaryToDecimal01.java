public class BinaryToDecimal01
{
    public static void binToDec(int binNum)
    {
        int pow = 0;
        int decNum = 0;
        int myn = binNum;
        while(binNum>0)
        {
            
            int lastDigit = binNum % 10;
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