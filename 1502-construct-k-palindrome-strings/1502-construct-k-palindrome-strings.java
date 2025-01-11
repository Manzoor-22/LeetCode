class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;

        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        for(int freq : hm.values()){
            if(freq % 2 == 1){
                ans++;
            }
        }

        return ans <= k && k <= s.length();
    }
}