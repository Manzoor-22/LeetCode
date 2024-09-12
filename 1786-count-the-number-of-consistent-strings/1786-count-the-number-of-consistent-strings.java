class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        HashSet<Character> hs = new HashSet<>();

        for(Character c : allowed.toCharArray()){
            hs.add(c);
        }

        for(String word: words){
            for(int i = 0; i < word.length(); i++){
                if(!hs.contains(word.charAt(i))){
                    answer--;
                    break;
                }
            }
            answer++;
        }

        return answer;
    }
}