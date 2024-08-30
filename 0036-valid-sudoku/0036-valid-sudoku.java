class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set contents = new HashSet<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    String val = "(" + board[i][j] + ")";

                    if(!contents.add(i+val) || !contents.add(val+j) || !contents.add(i/3+val+j/3)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}