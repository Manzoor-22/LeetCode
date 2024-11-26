class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String ans = "";
        
        for(int i = 0; i < s.length(); i++){
            // odd length
            int left = i, right = i;
            
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int currLen = right-left+1;
                if(currLen > maxLen){
                    maxLen = currLen;
                    ans = s.substring(left, right+1);
                }
                
                left--;
                right++;
            }
            
            // even length
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int currLen = right-left+1;
                if(currLen > maxLen){
                    maxLen = currLen;
                    ans = s.substring(left, right+1);
                }
                left--;
                right++;
            }
        }
        
        return ans;
    }
}