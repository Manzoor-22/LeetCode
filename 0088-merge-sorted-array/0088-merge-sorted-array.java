class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(nums1[i] >= nums2[j]){
                // push all elements of nums1 to right
                for(int k = nums1.length-1; k > i; k--){
                    nums1[k] = nums1[k-1];
                }
                nums1[i++] = nums2[j++];
                m++;
            }
            else{
                i++;
            }
        }

        while(j < n){
            nums1[i++] = nums2[j++];
        }
    }
}