class Solution {
    public int findComplement(int num) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(num));

        int pow = 1;
        int ans = 0;

        for(int i = str.length()-1; i >= 0; i--){
            int digit = Character.getNumericValue(str.charAt(i));
            if(digit == 1)
                digit = 0;
            else
                digit = 1;
            ans = ans + (digit*pow);
            pow *= 2;
        }

        // 11011
        // ans = 0, pow = 1;
        // ans = 0 + 1 * 1 = 1;
        // ans = 1 + 1 * 2 = 3
        // ans = 3 + 0 * 4 = 3
        // ans = 3 + 1 * 8 = 11

        return ans;
    }
}