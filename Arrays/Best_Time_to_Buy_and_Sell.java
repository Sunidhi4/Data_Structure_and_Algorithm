public class Best_Time_to_Buy_and_Sell
{
    public static int buyAndSellStock(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                // maxProfit = Math.max(maxProfit, profit);
                maxProfit = maxProfit + profit; // if we again buy the stock after sellin then next two line will be useful
                buyPrice = prices[i];
            }
            else
            {
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
     public static void main ( String args[]) 
{
     int prices[] = {7, 1, 5, 3, 6, 4};
    // int prices[] = {7, 6, 4, 3, 1};
     System.out.println(buyAndSellStock(prices));
} 
 } 