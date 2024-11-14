class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0, second = 0;

        while(first < m && second < n){
            if(nums1[first] < nums2[second]){
                first++;
            }
            else{
                for(int i = nums1.length-1; i > first; i--){
                    nums1[i] = nums1[i-1];
                }
                nums1[first++] = nums2[second++];
                m++;
            }
        }

        while(second < n){
            nums1[first++] = nums2[second++];
        }
    }
}