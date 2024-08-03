class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int b : nums2){
            hm.put(b,1);
        }

        for(int a : nums1){
            if(!hm.containsKey(a)){
                list.add(a);
                hm.put(a, 1);
            }
        }
        ans.add(list);
        
        list = new ArrayList<>();
        hm = new HashMap<>();

        for(int a : nums1){
            hm.put(a, 1);
        }

        for(int b : nums2){
            if(!hm.containsKey(b)){
                list.add(b);
                hm.put(b, 1);
            }
        }
        ans.add(list);

        return ans;
    }
}