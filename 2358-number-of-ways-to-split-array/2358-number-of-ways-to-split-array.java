class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for(int n : nums){
            sum += n;
        }

        int ans = 0;
        long currSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(currSum >= (sum-currSum)){
                ans++;
            }
            currSum += nums[i];
        }

        return ans;
    }
}