class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        
        for(int i = 0; i < words.length-1; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].contains(words[j]) && !hs.contains(words[j])){
                    ans.add(words[j]);
                    hs.add(words[j]);
                }

                if(words[j].contains(words[i]) && !hs.contains(words[i])){
                    ans.add(words[i]);
                    hs.add(words[i]);
                }
            }
        }

        return ans;
    }
}