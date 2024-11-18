class Solution {
    public void nextPermutation(int[] nums) {
        int breakP = -1;

        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                breakP = i-1;
                break;
            }
        }

        if(breakP == -1){
            Arrays.sort(nums);
            return;
        }

        // 2 1 5 4 3 0 0
        int diff = nums[breakP+1] - nums[breakP];
        int idx = breakP+1;
        for(int i = breakP+2; i < nums.length; i++){
            int currDiff = nums[i] - nums[breakP];
            if(currDiff > 0 && currDiff < diff){
                diff = currDiff;
                idx = i;
            }
        }

        // flipping
        int temp = nums[idx];
        nums[idx] = nums[breakP];
        nums[breakP] = temp;

        // sorting breakP + 1 Subarray
        for(int i = breakP+1; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}