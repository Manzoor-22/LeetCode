class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' ' && ans == 0){
                continue;
            }
            if(s.charAt(i) == ' ' && ans != 0){
                return ans;
            }
            ans++;
        }

        return ans;
    }
}