class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int lim = n / 3;
        List<Integer> ans = new LinkedList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(Integer i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> itr : hm.entrySet()){
            if(itr.getValue() > lim){
                ans.add(itr.getKey());
            }
        }

        return ans;
    }
}