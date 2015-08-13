public class Solution {
    public int maxProfit(int[] prices) {
        int leng = prices.length;
        if(leng <= 1) {
            return 0;
        }
        
        int profit = 0;
        int current = prices[0];
        
        
        
        for(int i=1; i<leng; i++) {
            if(prices[i]<current) {
                current = prices[i];
            }
            else if(prices[i]>current) {
                profit = profit + prices[i] - current;
                current = prices[i];
            }
        }
        return profit;
    }
}
