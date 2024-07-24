class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 0;

        Set<Integer> set1 = new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int num: nums2){
            set2.add(num);
        }

        for(int i = 0; i < nums1.length; i++){
            if(set2.contains(nums1[i]))
                ans[0]++;
        }

        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i]))
                ans[1]++;
        }

        return ans;
    }
}