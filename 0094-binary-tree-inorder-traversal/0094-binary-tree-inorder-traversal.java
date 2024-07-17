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
    List<Integer> ans = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Solution(root);
        return ans;
    }

    public void Solution(TreeNode root){
        if(root != null){
            Solution(root.left);
            ans.add(root.val);
            Solution(root.right);
        }
    }
}