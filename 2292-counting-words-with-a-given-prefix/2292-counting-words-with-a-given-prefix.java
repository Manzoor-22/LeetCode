class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;

        for(String word : words){
            if(startsWith(word, pref)){
                ans++;
            }
        }

        return ans;
    }

    private boolean startsWith(String s1, String s2){
        for(int i = 0; i < s2.length(); i++){
            if(i >= s1.length() || s2.charAt(i) != s1.charAt(i)){
                return false;
            }
        }

        return true;
    }
}