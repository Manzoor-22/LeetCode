class Solution {
    public int findComplement(int num) {
        int pow = 1;
        int ans = 0;

        while(num > 0){
            int digit = num % 2;
            if(digit == 1)
                digit = 0;
            else
                digit = 1;
            ans = ans + (digit*pow);
            pow *= 2;
            num /= 2;
        }

        return ans;
    }
}