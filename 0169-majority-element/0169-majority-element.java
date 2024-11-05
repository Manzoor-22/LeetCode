class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(Integer a : nums){
            hm.put(a, hm.getOrDefault(a, 0) + 1);

            if(hm.get(a) > nums.length/2){
                return a;
            }
        }

        return -1;
    }
}