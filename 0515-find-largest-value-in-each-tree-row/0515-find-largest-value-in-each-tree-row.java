/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }

        q.add(root);
        q.add(null);
        int max = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            TreeNode removed = q.poll();
            if(removed == null){
                if(q.isEmpty()){
                    break;
                }
                ans.add(max);
                max = Integer.MIN_VALUE;
                q.add(null);
            }
            else{
                max = Math.max(max, removed.val);
                if(removed.left != null){
                    q.add(removed.left);
                }
                if(removed.right != null){
                    q.add(removed.right);
                }
            }
        }
        ans.add(max);
        return ans;
    }
}