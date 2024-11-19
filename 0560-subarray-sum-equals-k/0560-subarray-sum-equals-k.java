class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        hm.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int remainder = prefixSum - k;
            count += hm.getOrDefault(remainder, 0);
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
}