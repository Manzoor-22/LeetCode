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
    int ans = 0, itr = 0;

    public int kthSmallest(TreeNode root, int k) {
        preorder(root, k);
        return ans;
    }

    public void preorder(TreeNode root, int k){
        if(root == null){
            return;
        }

        preorder(root.left, k);
        itr++;
        if(itr == k){
            ans = root.val;
            return;
        }
        preorder(root.right, k);
    }
}