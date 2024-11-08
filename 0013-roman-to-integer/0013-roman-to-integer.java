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

        int ans = hm.get(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            int curr = hm.get(s.charAt(i));
            int prev = hm.get(s.charAt(i-1));

            if(prev < curr){
                ans -= 2*prev;
            }

            ans += curr;
        }

        return ans;
    }
}