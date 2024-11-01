class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;

        while(temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        if(x < 0){
            reverse = 0 - reverse;
        }

        if(x == reverse){
            return true;
        }

        return false;
    }
}