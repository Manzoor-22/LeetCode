class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;

        for(int a : nums){
            totalSum += a;
        }

        if(totalSum % p == 0){
            return 0;
        }

        int rem = (int)(totalSum % p);

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        long prefixSum = 0;
        int minLen = nums.length;

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int currentMod = (int)(prefixSum % p);
            int targetMod = (currentMod - rem + p) % p;

            if(hm.containsKey(targetMod)){
                minLen = Math.min(minLen, i-hm.get(targetMod));
            }

            hm.put(currentMod, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }
}