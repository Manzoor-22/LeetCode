class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int[][] ans = new int[rows][cols];

        int i = 0, j = 0;
        while(i < rows && j < cols){
            int val = Math.min(rowSum[i], colSum[j]);
            ans[i][j] = val;
            rowSum[i] -= val;
            colSum[j] -= val;

            if(rowSum[i] == 0){
                i++;
            }
            if(colSum[j] == 0){
                j++;
            }
        }

        return ans;
    }
}