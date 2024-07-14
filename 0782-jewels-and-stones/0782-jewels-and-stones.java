class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        for(Character c : jewels.toCharArray()){
            hs.add(c);
        }
        for(Character c: stones.toCharArray()){
            if(hs.contains(c)){
                ans++;
            }
        }

        return ans;
    }
}