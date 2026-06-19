class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int ans = 0;

        for(int a : gain){
            curr += a;
            ans = Math.max(ans, curr);
        }
        
        return ans;
    }
}