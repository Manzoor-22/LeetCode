class Solution {
    public boolean check(int[] nums) {
        int pIdx = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                pIdx++;
            }
        }

        if(pIdx != 0 && nums[nums.length-1] > nums[0]){
            return false;
        }

        return pIdx <= 1 ? true : false;
    }
}