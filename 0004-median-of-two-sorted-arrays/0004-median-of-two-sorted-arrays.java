class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int merged[] = new int[n1+n2];

        int i = 0, j = 0;
        int k = 0;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i++];
            } else{
                merged[k] = nums2[j++];
            }
            k++;
        }

        while(i < n1){
            merged[k++] = nums1[i++];
        }

        while(j < n2){
            merged[k++] = nums2[j++];
        }

        if(merged.length % 2 != 0){
            return merged[merged.length/2];
        }

        double ans = 0;
        int midIdx = merged.length/2;
        ans = (double)(merged[midIdx] + merged[midIdx-1]) / 2;
        return ans;
    }
}