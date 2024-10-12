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
    int prev = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        preorder(root);

        return min;
    }

    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        preorder(root.left);
        
        min = Math.min(min, Math.abs(prev-root.val));
        prev = root.val;

        preorder(root.right);
    }
}