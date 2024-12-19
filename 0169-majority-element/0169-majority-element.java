class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int a : nums){
            hm.put(a, hm.getOrDefault(a, 0)+1);
        }

        for(Map.Entry<Integer, Integer> itr : hm.entrySet()){
            if(itr.getValue() > nums.length/2){
                return itr.getKey();
            }
        }

        return -1;
    }
}