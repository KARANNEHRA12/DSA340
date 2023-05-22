//Q:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
         int min = Integer.MAX_VALUE;
         int maxpro = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxpro= Math.max(maxpro, prices[i] - min);

        }
         return maxpro;

    }

}
