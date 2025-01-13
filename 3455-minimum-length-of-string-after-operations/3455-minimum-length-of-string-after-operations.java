class Solution {
    public int minimumLength(String s) {
        if(s.length() == 1 || s.length() == 2){
            return s.length();
        }

        int ans = s.length();
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;

            if(freq[s.charAt(i)-'a'] != 1 && freq[s.charAt(i)-'a'] % 2 == 1){
                ans -= 2;
            }
        }

        return ans;
    }
}