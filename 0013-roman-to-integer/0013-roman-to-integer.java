class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(i != 0 && hm.get(s.charAt(i-1)) < hm.get(s.charAt(i))){
                ans -= (2 * hm.get(s.charAt(i-1)));
            }
            
            ans += hm.get(s.charAt(i));
        }
        
        return ans;
    }
}