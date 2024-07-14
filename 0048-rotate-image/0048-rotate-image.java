class Solution {
    public void rotate(int[][] matrix) {
        int ans[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                ans[i][j] = matrix[j][i];
            }
        }

        for(int i = 0; i < matrix.length; i++){
            int c1 = 0, c2 = matrix[0].length-1;
            while(c1 < c2){
                int temp = ans[i][c1];
                ans[i][c1] = ans[i][c2];
                ans[i][c2] = temp;
                c1++;
                c2--;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}