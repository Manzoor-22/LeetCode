class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int ans = 0, temp = x;
        while(temp > 0){
            int remainder = temp % 10;
            ans = ans * 10 + remainder;
            temp /= 10;
        }

        return ans == x;
    }
}