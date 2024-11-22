class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0, right = mat[0].length-1;
        int top = 0, bot = mat.length-1;
        
        while(left <= right && top <= bot){
            // top row
            for(int i = left; i <= right; i++){
                al.add(mat[top][i]);
            }
            top++;
            
            // right col
            for(int i = top; i <= bot; i++){
                al.add(mat[i][right]);
            }
            right--;
            
            // bottom row 
            if(top <= bot){
                for(int i = right; i >= left; i--){
                    al.add(mat[bot][i]);
                }
                bot--;
            }
            
            // left col
            if(left <= right){
                for(int i = bot; i >= top; i--){
                    al.add(mat[i][left]);
                }
                left++;
            }
        }
        
        return al;
    }
}