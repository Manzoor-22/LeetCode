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
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> ll = new LinkedList<>();
        helper(root, ll, "");

        return ll;
    }
    public void helper(TreeNode root, LinkedList<String> ll, String curr){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            curr += Integer.toString(root.val);
            ll.add(curr);
        }

        curr += Integer.toString(root.val)+ "->";
        helper(root.left, ll, curr);
        helper(root.right, ll, curr);
    }
}