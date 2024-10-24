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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return checkTree(root1, root2);
    }

    private boolean checkTree(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }

        return ( (checkTree(node1.left, node2.right) || checkTree(node1.left, node2.left)) && (checkTree(node1.right, node2.left) || checkTree(node1.right, node2.right) ));
    }
}