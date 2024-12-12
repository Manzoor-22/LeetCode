class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = 0, end = nums.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(nums[mid] == target){
                while(nums[start] != target){
                    start++;
                }

                while(nums[end] != target){
                    end--;
                }

                ans[0] = start;
                ans[1] = end;

                return ans;
            }

            else if(nums[mid] > target){
                end = mid-1;
            }

            else{
                start = mid+1;
            }
        }

        return ans;
    }
}