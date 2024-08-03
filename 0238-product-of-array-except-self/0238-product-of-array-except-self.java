class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftP = new int[n];
        int[] rightP = new int[n];

        leftP[0] = nums[0];
        for(int i = 1; i < n; i++){
            leftP[i] = leftP[i-1]*nums[i];
        }

        rightP[n-1] = nums[n-1];
        for(int i = n-2; i >=0; i--){
            rightP[i] = rightP[i+1]*nums[i];
        }

        int[] ans = new int[n];
        ans[0] = rightP[1];
        ans[n-1] = leftP[n-2];

        for(int i = 1; i < n-1; i++){
            ans[i] = leftP[i-1]*rightP[i+1];
        }

        return ans;
    }
}