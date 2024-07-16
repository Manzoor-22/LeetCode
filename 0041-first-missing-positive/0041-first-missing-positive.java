class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length; 
        int[] ans = new int[n+1];
        Arrays.fill(ans, 0);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 1 || nums[i] > nums.length){
                continue;
            }
            ans[nums[i]] = 1;
        }

        for(int i = 1; i < ans.length; i++){
            if(ans[i] == 0)
                return i;
        }

        return ans.length;
    }
}