class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = nums[0];

        if(nums.length == 1){
            return true;
        }

        for(int i = 0; i < nums.length; i++){
            if(maxJump == 0){
                return false;
            }
            maxJump = Math.max(maxJump-1, nums[i]);
        }

        return true;
    }
}