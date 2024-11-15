class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];

            ans = Math.max(currSum, ans);

            if(currSum < 0){
                currSum = 0;
                continue;
            }
        }

        return ans;
    }
}