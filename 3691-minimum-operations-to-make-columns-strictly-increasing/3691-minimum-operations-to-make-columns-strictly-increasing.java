class Solution {
    public int minimumOperations(int[][] grid) {
        int ans = 0;

        for(int i = 1; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i-1][j] >= grid[i][j]){
                    ans += grid[i-1][j] - grid[i][j] + 1;
                    grid[i][j] += grid[i-1][j] - grid[i][j] + 1;
                }
            }
        }

        return ans;
    }
}