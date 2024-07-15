class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int min = 0, max = m * n - 1;

        while(min <= max){
            int mid = (min+max)/2;
            int row = mid / m;
            int col = mid % n;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                min = mid + 1;
            } else{
                max = mid - 1;
            }
        }

        return false;
    }
}