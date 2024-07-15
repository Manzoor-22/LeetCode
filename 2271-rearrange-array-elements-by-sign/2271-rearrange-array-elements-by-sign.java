class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positives = new int[n/2]; 
        int[] negatives = new int[n/2];
        int pIdx = 0, nIdx = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                positives[pIdx] = nums[i];
                pIdx++;
            } else{
                negatives[nIdx] = nums[i];
                nIdx++;
            }
        }
        pIdx = 0; nIdx = 0;
        for(int i = 0; i < n; i += 2){
            nums[i] = positives[pIdx];
            pIdx++;
            nums[i+1] = negatives[nIdx];
            nIdx++;
        }

        return nums;
    }
}