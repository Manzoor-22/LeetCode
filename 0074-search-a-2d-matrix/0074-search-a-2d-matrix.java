class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int high = (rows * cols)-1;
        int low = 0;

        while(low <= high){
            int mid = (low + high) / 2;
            int r = mid / cols;
            int c = mid % cols;

            if(matrix[r][c] == target){
                return true;
            }

            else if(matrix[r][c] < target){
                low = mid + 1;
            }

            else{
                high = mid-1;
            }
        }

        return false;
    }
}