class Solution {
    public int minOperations(int[] nums) {
        int count = 0;

        for(int n : nums){
            if(n == nums[0]){
                count++;
            }
        }

        return count == nums.length ? 0 : 1;
    }
}