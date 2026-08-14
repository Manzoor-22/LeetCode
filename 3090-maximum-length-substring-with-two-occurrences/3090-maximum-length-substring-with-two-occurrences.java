class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int j = 0, ans = 0;

        for(int i = 0; i < s.length(); i++){
            int currCount = hm.getOrDefault(s.charAt(i),0);
            char curr = s.charAt(i);
            hm.put(s.charAt(i), currCount+1);

            if(currCount+1 > 2){
                // Shrink window
                while(hm.get(curr) > 2 && i > j){
                    //remove jth char
                    if(hm.get(s.charAt(j)) == 1)
                        hm.remove(s.charAt(j));
                    
                    else
                        hm.put(s.charAt(j), hm.get(s.charAt(j))-1);

                    j++;
                }
            }

            ans = Math.max(ans, i-j+1);
        }

        return ans;
    }
}