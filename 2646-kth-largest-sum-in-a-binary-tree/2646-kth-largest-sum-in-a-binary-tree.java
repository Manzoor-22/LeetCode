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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int levels = 1;

        long curr = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();

        while(!q.isEmpty()){
            TreeNode removed = q.poll();
            if(removed == null){
                pq.add(curr);
                if(pq.size() > k){
                    pq.poll();
                }
                curr = 0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    levels++;
                }
                continue;
            }
            curr += removed.val;
            if(removed.left != null){
                q.add(removed.left);
            }
            if(removed.right != null){
                q.add(removed.right);
            }
        }

        if(levels < k){
            return -1;
        }

        return pq.peek();
    }
}