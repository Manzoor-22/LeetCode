class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder a = new StringBuilder(Integer.toBinaryString(start));
        StringBuilder b = new StringBuilder(Integer.toBinaryString(goal));

        while(a.length() < b.length()){
            a.insert(0, "0");
        }

        while(b.length() < a.length()){
            b.insert(0, "0");
        }
        
        int ans = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                ans++;
            }
        }

        return ans;
    }
}