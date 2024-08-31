class Solution {
    public int hammingWeight(int n) {
        String s1 = Integer.toBinaryString(n);
        int ans = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}