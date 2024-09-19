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
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        preorder(root, k, pq);

        return pq.peek();
    }
    public void preorder(TreeNode root, int k, PriorityQueue<Integer> pq){
        if(root == null){
            return;
        }
        pq.add(root.val);
        if(pq.size() > k)
            pq.poll();
        preorder(root.left, k, pq);
        preorder(root.right, k, pq);
    }
}