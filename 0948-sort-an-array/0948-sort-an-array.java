class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for(int i = n/2-1; i >= 0; i--){
            heapify(nums, i, n);
        }

        for(int i = n-1; i > 0; i--){
            //swap first and last
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            heapify(nums, 0, i);
        }

        return nums;
    }

    public void heapify(int[] nums, int idx, int size){
        int left = idx*2+1;
        int right = idx*2+2;
        int maxIdx = idx;

        if(left < size && nums[left] > nums[maxIdx]){
            maxIdx = left;
        }

        if(right < size && nums[right] > nums[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != idx){
            int temp = nums[maxIdx];
            nums[maxIdx] = nums[idx];
            nums[idx] = temp;
            
            heapify(nums, maxIdx, size);
        }
    }
}