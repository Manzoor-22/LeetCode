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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> path = new LinkedList<>();

        getPath(root, path);

        return path.get(k-1);
    }

    public void getPath(TreeNode root, List<Integer> path){
        if(root == null){
            return;
        }
        getPath(root.left, path);
        path.add(root.val);
        getPath(root.right, path);
    }
}