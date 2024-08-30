class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
    }
    public void reverse(int start, int end, int[] nums){
        int i = start, j = end;

        while(i < j){
            int k = nums[i];
            nums[i] = nums[j];
            nums[j] = k;

            i++;
            j--;
        }
    }
}