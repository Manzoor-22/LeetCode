class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();
        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            if(hm1.containsKey(pattern.charAt(i))){
                if(!words[i].equals(hm1.get(pattern.charAt(i)))){
                    return false;
                }
            }
            if(hm2.containsKey(words[i])){
                if(hm2.get(words[i]) != pattern.charAt(i)){
                    return false;
                }
            }
            hm1.put(pattern.charAt(i), words[i]);
            hm2.put(words[i], pattern.charAt(i));
        }

        return true;
    }
}