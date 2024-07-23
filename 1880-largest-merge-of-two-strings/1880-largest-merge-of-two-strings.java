class Solution {
    public String largestMerge(String word1, String word2) {
        if(word1.length() == 0){
            return word2;
        }
        if(word2.length() == 0){
            return word1;
        }
        char first = word1.charAt(0);
        char second = word2.charAt(0);

        if(first > second){
            return first + largestMerge(word1.substring(1,word1.length()), word2);
        } else if(second > first){
            return second + largestMerge(word1, word2.substring(1,word2.length()));
        } else{
            if(word1.compareTo(word2) > 0){
                return first + largestMerge(word1.substring(1,word1.length()), word2);
            } else{
                return second + largestMerge(word1, word2.substring(1,word2.length()));
            }
        }
    }
}