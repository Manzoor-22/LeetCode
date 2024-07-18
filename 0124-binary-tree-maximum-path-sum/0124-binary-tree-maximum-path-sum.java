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
    int maxVal;
    public int maxPathSum(TreeNode root) {
        maxVal = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxVal;
    }

    public int maxPathDown(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftS = Math.max(0, maxPathDown(root.left));
        int rightS = Math.max(0, maxPathDown(root.right));
        maxVal = Math.max(maxVal, leftS+rightS+root.val);
        return Math.max(leftS,rightS)+root.val;
    }
}