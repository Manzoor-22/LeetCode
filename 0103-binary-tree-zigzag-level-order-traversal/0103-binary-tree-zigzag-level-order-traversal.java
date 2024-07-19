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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        
        if(root == null){
            return ans;
        }
        
        List<Integer> curr = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode removed = q.remove();
            if(removed == null){
                ans.add(curr);
                curr = new LinkedList<>();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                curr.add(removed.val);
                if(removed.left != null){
                    q.add(removed.left);
                }
                if(removed.right != null){
                    q.add(removed.right);
                }
            }
        }

        for(int i = 1; i < ans.size(); i=i+2){
            List<Integer> temp = ans.remove(i);
            Collections.reverse(temp);
            ans.add(i, temp);
        }

        return ans;
    }
}