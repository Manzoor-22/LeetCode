class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] subArr = new int[(n*(n+1))/2];
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            int prevSum = 0;
            for(int j = i; j < nums.length; j++){
                subArr[k] = prevSum + nums[j];
                prevSum += nums[j];
                k++;
            }
        }

        Arrays.sort(subArr);
        int ansSum = 0;
        final int mod = (int) 1e9+7;
        for(int i = left-1; i < right; i++){
            ansSum = (ansSum+subArr[i]) % mod;
        }

        return ansSum;
    }
}