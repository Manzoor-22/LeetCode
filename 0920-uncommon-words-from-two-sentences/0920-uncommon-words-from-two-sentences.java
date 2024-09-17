class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        for(String word : s1.split(" ")){
            if(hm.containsKey(word)){
                hm.put(word, hm.get(word)+1);
            } else{
                hm.put(word, 1);
            }
        }

        for(String word : s2.split(" ")){
            if(hm.containsKey(word)){
                hm.put(word, hm.get(word)+1);
            } else{
                hm.put(word, 1);
            }
        }

        for(String word : hm.keySet()){
            if(hm.get(word) == 1){
                ans.append(word);
                ans.append("-");
            }
        }

        if(ans.length() == 0){
            return new String[]{};
        }

        return ans.toString().split("-");
    }
}