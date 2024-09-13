class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int min = queries[i][0];
            int max = queries[i][1];
            int curr = arr[min];
            for(int j = min+1; j <= max; j++){
                curr ^= arr[j];
            }

            ans[i] = curr;
        }

        return ans;
    }
}