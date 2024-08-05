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
    int headVal, ans;
    public int goodNodes(TreeNode root) {
        ans = 0;

        if(root == null){
            return ans;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        headVal = root.val;
        helper(root, Integer.MIN_VALUE);

        return ans;
    }

    public void helper(TreeNode root, int max){
        if(root == null){
            return;
        }
        if(root.val >= max){
            ans = ans + 1;
            max = root.val;
        }
        helper(root.left, max);
        helper(root.right, max);
    }
}