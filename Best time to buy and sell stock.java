public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int minimum=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int cost=prices[i]-minimum;
            maxProfit=Math.max(maxProfit, cost);
            minimum=Math.min(minimum, prices[i]);
        }
        return maxProfit;
    }
}
