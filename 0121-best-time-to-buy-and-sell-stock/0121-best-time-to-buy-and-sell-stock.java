class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit = 0;
        int Min = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            int currentProfit = prices[i] - Min;
            if(Min > prices[i]){
                Min = prices[i];
            }
            if(currentProfit > MaxProfit){
                MaxProfit = currentProfit;
            }
        }

        return MaxProfit;
    }
}