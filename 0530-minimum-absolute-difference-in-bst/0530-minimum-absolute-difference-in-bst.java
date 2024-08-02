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
    public TreeNode prev = null;
    public int diff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return diff;
    }


    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(prev != null){
            diff = Math.min(diff, Math.abs(prev.val - root.val));
        }
        prev = root;
        inorder(root.right);
    }
}