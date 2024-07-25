class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();

        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m-1, top = 0, bot = n-1;

        while(top <= bot && left <= right){
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bot; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bot){
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bot][i]);
                }
                bot--;
            }
            if(left <= right){
                for(int i = bot; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}