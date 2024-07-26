class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //Transposing the matrix
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i < j){
                    int t = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = t;
                }
            }
        }

        int first = 0, last = n-1;

        while(first < last){
            for(int i = 0; i < m; i++){
                int t = matrix[i][first];
                matrix[i][first] = matrix[i][last];
                matrix[i][last] = t;
            }
            first++;
            last--;
        }
    }
}