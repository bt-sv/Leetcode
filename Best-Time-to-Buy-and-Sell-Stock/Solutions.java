public class Solution {
    public int maxProfit(int[] prices) {
        int leng = prices.length;
        int j = 0;
        
        int start = 0;
        int end = 0;
        int max = 0;
        
        if(prices.length<=1) {
            return 0;
        }
        

        for(int i=1; i<leng; i++) {
            if(prices[i]-prices[j]>max) {
                max = prices[i] - prices[j];
            }
            else if(prices[i]<prices[j]) {
                j = i;
            }
        }
        return max;
    }
}
