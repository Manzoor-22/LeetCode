class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] sol = new int[n];
        int j = n-k-1;
        for(int i = 0; i < (n - k); i++){
            sol[i] =  nums[j];
            j--;
        }
        j = n - 1;
        for(int i = (n-k); i < n; i++){
            sol[i] = nums[j];
            j--;
        }
        j = n - 1;
        for(int i = 0; i < n; i++){
            nums[i] = sol[j];
            j--;
        }
    }
}