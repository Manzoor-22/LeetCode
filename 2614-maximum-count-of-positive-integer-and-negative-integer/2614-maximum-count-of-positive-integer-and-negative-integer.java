class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0] > 0 || nums[nums.length-1] < 0){
            return nums.length;
        }

        int low = 0, high = nums.length-1, mid;

        while(low < high){
            mid = (low+high)/2;
            if(nums[mid] < 0){
                low = mid+1;
            } else{
                high = mid;
            }
        }

        int negatives = low;

        low = 0; high = nums.length;

        while(low < high){
            mid = (low+high)/2;
            if(nums[mid] > 0){
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int positives = nums.length - low;

        return Math.max(negatives, positives);
    }
}