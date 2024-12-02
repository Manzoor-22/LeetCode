class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i = 1;
        for(String word : sentence.split(" ")){
            if(word.startsWith(searchWord)){
                return i;
            }
            i++;
        }
        
        return -1;
    }
}