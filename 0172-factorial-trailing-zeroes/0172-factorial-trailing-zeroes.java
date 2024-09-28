class Solution {
    public int trailingZeroes(int n) {
        int pow = 5;
        int ans = 0;

        while(n / pow > 0){
            ans += n / pow;
            pow *= 5;
        }

        return ans;
    }
}