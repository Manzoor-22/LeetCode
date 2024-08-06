class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0;
        int maxSum = 0;
        for(int i = 0; i < k; i++){
            currSum += nums[i];
        }
        maxSum = currSum;

        int i = 0, j = k;

        while(j < nums.length){
            currSum -= nums[i];
            i++;
            currSum += nums[j];
            j++;
            maxSum = Math.max(maxSum, currSum);
        }

        return (double)maxSum/k;
    }
}