public class InvertedHalfPyramid
{
    public static void pattern(int num)
    {
        for(int i=1; i<=num ; i++)
        {
            for(int j =1 ;j<=num ; j++)
            {
                if(j <= num-i)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
     public static void main ( String args[]) 
{
     pattern(4);
} 
 } 