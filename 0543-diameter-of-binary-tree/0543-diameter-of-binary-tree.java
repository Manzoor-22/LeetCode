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
        int leftTree = diameterOfBinaryTree(root.left);
        int rightTree = diameterOfBinaryTree(root.right);
        int leftH = height(root.left);
        int rightH = height(root.right);
        
        int max = Math.max(Math.max(leftTree, rightTree), leftH+rightH);

        return max;
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH)+1;
    }
}