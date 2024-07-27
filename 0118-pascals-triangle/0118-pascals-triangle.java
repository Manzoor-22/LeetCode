class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();

        List<Integer> prev = new LinkedList<>();
        prev.add(1);
        ans.add(prev);

        if(numRows == 1){
            return ans;
        }

        for(int i = 1; i < numRows; i++){
            List<Integer> curr = new LinkedList<>();
            curr.add(1);
            for(int j = 1; j < i; j++){
                curr.add(prev.get(j)+prev.get(j-1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;
        }

        return ans;
    }
}