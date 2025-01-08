class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;

        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                String s1 = words[i];
                String s2 = words[j];
                if(s2.startsWith(s1) && s2.endsWith(s1)){
                    ans++;
                }
            }
        }

        return ans;
    }
}