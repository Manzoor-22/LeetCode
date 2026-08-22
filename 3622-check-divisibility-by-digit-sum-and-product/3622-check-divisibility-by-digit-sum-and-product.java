class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while(n > 0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        sum += product;

        // return n % (product+sum) == 0 ? true : false;
        return (temp % sum) == 0;
    }
}