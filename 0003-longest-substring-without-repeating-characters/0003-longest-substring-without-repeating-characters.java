class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        int left = 0, right = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(hm.containsKey(c)){
                left = Math.max(hm.get(c)+1, left);
            }

            ans = Math.max(ans, right-left+1);
            right++;
            hm.put(c, i);
        }

        return ans;
    }
}