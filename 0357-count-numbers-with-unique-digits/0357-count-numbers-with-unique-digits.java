class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 10;
        }
        int ans = 10;
        int numbers = 9;
        int l = 9;

        for(int i = 1; i < n; i++){
            numbers = numbers * l;
            ans = ans + numbers;
            l--;
        }

        return ans;
    }
}