class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] right = new int[26];
        for(char c : s.toCharArray()){
            right[c - 'a']++;
        }

        int[] left = new int[26];
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            int curr = s.charAt(i) - 'a';
            right[curr]--;

            for(int j = 0; j < 26; j++){
                if(left[j] > 0 && right[j] > 0){
                    hs.add(26*curr +j);
                }
            }

            left[curr]++;
        }

        return hs.size();
    }
}