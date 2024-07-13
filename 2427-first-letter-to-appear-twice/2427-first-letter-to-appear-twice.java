class Solution {
    public char repeatedCharacter(String s) {
        int[] alpha = new int[26];
        for(int i = 0; i < alpha.length; i++){
            alpha[i] = 0;
        }

        for(char c : s.toCharArray()){
            if(alpha[c - 'a'] == 1){
                return c;
            }
            alpha[c-'a'] = 1;
        }

        return 'a';
    }
}