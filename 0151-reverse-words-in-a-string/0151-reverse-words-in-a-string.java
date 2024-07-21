class Solution {
    public String reverseWords(String s) {
        //trim() used to remove excess spaces
        //split is used to return words with \\s+
        String[] words = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for(int i = words.length - 1; i > 0; i--){
            out.append(words[i] + " ");
        }
        return out + words[0];
    }
}