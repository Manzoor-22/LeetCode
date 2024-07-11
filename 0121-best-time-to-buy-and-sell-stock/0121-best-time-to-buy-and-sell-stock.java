class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minSoFar = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(minSoFar > prices[i])
                minSoFar = prices[i];
            int currentProfit = prices[i]-minSoFar;
            if(profit < currentProfit)
                profit = currentProfit;
        }

        return profit;
    }
}