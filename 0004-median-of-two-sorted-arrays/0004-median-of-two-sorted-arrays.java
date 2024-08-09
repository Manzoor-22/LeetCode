class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] sortedArr = new int[n1+n2];

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                sortedArr[k++] = nums1[i++];
            }
            else{
                sortedArr[k++] = nums2[j++];
            }
        }

        while(i < n1){
            sortedArr[k++] = nums1[i++];
        }

        while(j < n2){
            sortedArr[k++] = nums2[j++];
        }

        int length = sortedArr.length;
        if(length % 2 == 0)
            return (double)(sortedArr[length/2]+sortedArr[length/2-1])/2;

        return sortedArr[length/2];
    }
}