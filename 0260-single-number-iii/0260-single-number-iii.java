class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return nums;
        }      
        int bm = 0;
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            bm ^= nums[i];
        }
        int lowestBit = bm & (-bm);
        for(int i = 0; i < nums.length; i++){
            if((lowestBit & nums[i]) == 0){
                ans[0] ^= nums[i];
            } else{
                ans[1] ^= nums[i];
            }
        }
        return ans;
    }
}