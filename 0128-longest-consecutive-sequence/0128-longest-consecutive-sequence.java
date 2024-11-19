class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }

        int longest = 1;
        int currLongest = 1;
        HashSet<Integer> hs = new HashSet<>();

        for(Integer a : nums){
            hs.add(a);
        }

        for(Integer num : hs){
            // try to find the start number
            if(!hs.contains(num-1)){
                int next = num+1;
                while(hs.contains(next)){
                    next++;
                }
                longest = Math.max(longest, next-num);
            }
        }

        return longest;
    }
}