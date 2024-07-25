class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }

    public void merge(int[] nums, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si, j = mid+1, k = 0;

        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                temp[k++] = nums[i];
                i++;
            } else{
                temp[k++] = nums[j];
                j++;
            }
        }

        while(i <= mid){
            temp[k++] = nums[i++];
        }

        while(j <= ei){
            temp[k++] = nums[j++];
        }

        for(i = si, k = 0; k < temp.length; i++, k++){
            nums[i] = temp[k];
        }
    }
}