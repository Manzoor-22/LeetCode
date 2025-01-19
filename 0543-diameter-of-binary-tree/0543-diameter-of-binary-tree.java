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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lHeight = height(root.left);
        int rHeight = height(root.right);
        int lTree = diameterOfBinaryTree(root.left);
        int rTree = diameterOfBinaryTree(root.right);

        return Math.max(Math.max(lTree, rTree), lHeight+rHeight);
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = 0, right = 0;

        if(root.left != null){
            left = height(root.left);
        }

        if(root.right != null){
            right = height(root.right);
        }

        return 1+Math.max(left, right);
    }
}