class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        double sum = 0, elements = 0;

        // q = null 15 7

        while(!q.isEmpty()){
            TreeNode removed = q.remove();
            if(removed == null){
                double avg = (double)sum/elements;
                ans.add(avg);
                sum = 0;
                elements = 0;
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                sum += removed.val;
                elements++;

                if(removed.left != null){
                    q.add(removed.left);
                }
                if(removed.right != null){
                    q.add(removed.right);
                }
            }
        }

        return ans;
    }
}