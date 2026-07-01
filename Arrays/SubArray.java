public class SubArray
{
    public static void sub(int number[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<number.length; i++)
        {

            int start = i;
            for(int j=i; j<number.length; j++ )
            {
                int sum = 0;
                int end = j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(number[k]+" ");
                    
                    sum = sum + number[k];

                }
                System.out.println("sum : "+sum);
                if(sum >= max)
                {
                    max = sum;
                }
                if(sum<=min)
                {
                    min = sum;
                }
                System.out.println();
            }
            System.out.println("************************");

        }
        System.out.println("maximum sum is : "+max);
        System.out.println("minimum sum is : "+min);

    }
     public static void main ( String args[]) 
{
    int number[] = {2,4,6,8,10};
    sub(number);
     
} 
 } 