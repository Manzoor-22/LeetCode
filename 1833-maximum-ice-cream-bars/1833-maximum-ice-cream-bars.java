class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;

        Arrays.sort(costs);

        for(int n : costs){
            if(coins < n){
                return ans;
            }

            ans++;
            coins -= n;
        }

        return ans;
    }
}