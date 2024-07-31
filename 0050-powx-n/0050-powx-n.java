class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n > 0){
            return getPow(x, (long)n);
        }

        return 1/getPow(x,Math.abs((long)n));
    }
    public double getPow(double x, long n){
        if(n == 0){
            return 1;
        }

        if(n % 2 == 1){
            return x * getPow(x*x, (n-1)/2);
        } else{
            return getPow(x*x, n/2);
        }
    }
}