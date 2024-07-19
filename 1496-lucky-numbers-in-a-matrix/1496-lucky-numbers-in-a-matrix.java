class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        List<Integer> min = new LinkedList<>();
        List<Integer> max = new LinkedList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            int min_val = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                if(min_val > matrix[i][j])
                    min_val = matrix[i][j];
            }
            min.add(min_val);
        }

        for(int i = 0; i < n; i++){
            int max_val = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                if(max_val < matrix[j][i]){
                    max_val = matrix[j][i];
                }
            }
            max.add(max_val);
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == min.get(i) && matrix[i][j] == max.get(j))
                    ans.add(matrix[i][j]);
            }
        }

        return ans;
    }
}