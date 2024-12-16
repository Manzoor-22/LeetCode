class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++){
            int idx = getMinIdx(nums);
            nums[idx] *= multiplier;
        }

        return nums;
    }

    public int getMinIdx(int[] nums){
        int min = Integer.MAX_VALUE;
        int minIdx = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(n < min){
                min = n;
                minIdx = i;
            }
        }

        return minIdx;
    }
}