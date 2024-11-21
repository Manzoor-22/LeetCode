class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int n = nums.length;
        int currSum = 0;

        while(r < n){
            currSum += nums[r];

            while(currSum >= target){
                ans = Math.min(ans, r-l+1);
                currSum -= nums[l];
                l++;
            }

            r++;
        }



        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}