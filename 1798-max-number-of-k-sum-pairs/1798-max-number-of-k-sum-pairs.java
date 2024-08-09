class Solution {
    public int maxOperations(int[] nums, int k) {
        int i = 0, j = nums.length-1;
        
        Arrays.sort(nums);
        int ans = 0;
        // 1 3 3 3 4
        while(i < j){
            int pair = nums[i] + nums[j];
            if(pair == k){
                ans++;
                i++;
                j--;
            } else if(pair < k){
                i++;
            } else{
                j--;
            }
        }

        return ans;
    }
}