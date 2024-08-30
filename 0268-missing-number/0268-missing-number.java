class Solution {
    public int missingNumber(int[] nums) {
        long sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int n = nums.length;
        long actualSum = n * (n+1) / 2;

        return (int) (actualSum - sum);
    }
}