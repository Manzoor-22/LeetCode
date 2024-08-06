class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;
        int maxVow = 0;

        for(int i = 0; i < k; i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                vowels++;
            }
        }

        maxVow = vowels;

        int i = 0, j = k;
        while(j < s.length()){
            if(isVowel(s.charAt(i))){
                vowels--;
            }
            i++;

            if(isVowel(s.charAt(j))){
                vowels++;
            }
            j++;
            maxVow = Math.max(maxVow, vowels);
            if(maxVow == k){
                return k;
            }
        }

        return maxVow;
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}