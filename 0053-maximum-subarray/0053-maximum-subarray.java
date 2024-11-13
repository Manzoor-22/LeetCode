class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int curr = 0;

        for(int i = 0; i < nums.length; i++){
            curr += nums[i];

            if(curr > ans){
                ans = curr;
            }

            if(curr < 0){
                curr = 0;
            }
        }

        return ans;
    }
}