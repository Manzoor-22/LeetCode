class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        int ans = getDP(n, dp);

        return ans;
    }

    public int getDP(int n, int[] dp){
        if(n == 1 || n == 2){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }
        
        dp[n] = getDP(n-1, dp) + getDP(n-2, dp);
        
        return dp[n];
    }
}