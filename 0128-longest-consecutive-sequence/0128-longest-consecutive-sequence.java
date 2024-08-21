class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 1 || nums.length == 0){
            return nums.length;
        }
        
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }

        int ans = 1;

        for(Integer num : hs){
            if(!hs.contains(num-1)){
                int end = num + 1;
                while(hs.contains(end)){
                    end++;
                }
                ans = Math.max(ans, end-num);
            }
        }

        return ans;
    }
}