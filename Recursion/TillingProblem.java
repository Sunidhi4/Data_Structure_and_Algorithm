public class TillingProblem
{
    public static int tillingProb(int n)
    {

         if(n == 0 || n == 1)
         {
            return 1;
         }
        int fnm1 = tillingProb(n-1);
        int fnm2 = tillingProb(n-2);
        int Ways = fnm1 + fnm2;
        return Ways;
    }
     public static void main ( String args[]) 
{
     System.out.println(tillingProb(3));
}
 } 