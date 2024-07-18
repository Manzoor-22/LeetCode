class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int mid = -1;
        while(low <= high){
            mid = (low+high)/2;
            if(mid*mid == x){
                return mid;
            }
            else if((long)mid*mid > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return Math.round(high);
    }
}