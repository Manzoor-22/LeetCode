class Solution {
    public boolean canJump(int[] nums) {
        int start = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(start == 0){
                return false;
            }
            start = Math.max(start-1, nums[i]);
        }

        return true;
    }
}