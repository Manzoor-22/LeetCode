class Solution {
    public int gcdOfOddEvenSums(int n) {
        // n/2 (2a + (n-1)d)
        // d = 2; a = 1
        // n/2 (2+2n-2)
        // n/2 (2n)
        // n2

        // n/2 (2a + (n-1)d)
        // d = 2; a = 2
        // n/2 (4+2n-2)
        // n/2 2(n+1)
        // n(n+1)

        int oddSum = n*n;
        int evenSum = n*(n+1);

        return getGcd(oddSum, evenSum);
    }

    private int getGcd(int a, int b){
        if(a == 0){
            return b;
        }

        return getGcd(b%a, a);
    }
}