class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> curr = new LinkedList<>();
            for(int j = 0; j <= i; j++){
                curr.add(pascal(i,j));
            }
            ans.add(curr);
        }

        return ans;
    }

    public int pascal(int row, int col){
        if(col == 0 || row == col){
            return 1;
        }
        return pascal(row-1, col) + pascal(row-1, col-1);
    }
}