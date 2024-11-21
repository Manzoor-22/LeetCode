class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++){
            int currLen = 0;
            
            int j = i;

            while(j < nums.length && nums[j] != 0){
                currLen++;
                j++;
            }

            if(i != j)
                i = j-1;
            
            maxLen = Math.max(currLen, maxLen);
        }

        return maxLen;
    }
}