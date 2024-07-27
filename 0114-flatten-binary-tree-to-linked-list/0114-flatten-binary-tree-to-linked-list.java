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
    public void flatten(TreeNode root) {
        Queue<Integer> ll = new LinkedList<>();
        bfs(root, ll);
        if(ll.size() >= 1)
            ll.remove();

        TreeNode temp = root;
        while(!ll.isEmpty()){
            int removed = ll.remove();
            temp.right = new TreeNode(removed);
            temp.left = null;
            temp = temp.right;
        }
    }

    public void bfs(TreeNode root, Queue<Integer> ll){
        if(root == null){
            return;
        }
        ll.add(root.val);
        bfs(root.left, ll);
        bfs(root.right, ll);
    }
}