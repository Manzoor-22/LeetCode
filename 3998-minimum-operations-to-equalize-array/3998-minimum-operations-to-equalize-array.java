class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        
        for(int i = 0; i < nums.length-1; i++){
            int curr = nums[i];
            int next = nums[i+1];

            if(curr != next){
                break;
            }

            if(i == nums.length-2){
                return 0;
            }
        }

        return 1;
    }
}