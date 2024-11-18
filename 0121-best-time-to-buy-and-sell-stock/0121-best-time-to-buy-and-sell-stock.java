class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minSoFar = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(minSoFar > prices[i]){
                minSoFar = prices[i];
            }

            ans = Math.max(ans, prices[i] - minSoFar);
        }

        return ans;
    }
}