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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> ll = new LinkedList<>();
        getPath(root, ll);
        root = ll.get(0);
        TreeNode temp = root;
        for(int i = 1; i < ll.size(); i++){
            temp.left = null;
            temp.right = ll.get(i);
            temp = temp.right;
        }
        temp.right = null;
        temp.left = null;
        return root;
    }

    public void getPath(TreeNode root, List<TreeNode> ll){
        if(root == null){
            return;
        }
        getPath(root.left, ll);
        ll.add(root);
        getPath(root.right, ll);
    }
}