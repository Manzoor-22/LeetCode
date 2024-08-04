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
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        int currSum = 0;
        int maxlevel = 1, currlevel = 1;
        while(!q.isEmpty()){
            TreeNode removed = q.remove();
            if(removed == null){
                if(maxSum < currSum){
                    maxSum = currSum;
                    maxlevel = currlevel;
                }   
                currSum = 0;
                currlevel++;
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                currSum += removed.val;

                if(removed.left != null){
                    q.add(removed.left);
                }
                if(removed.right != null){
                    q.add(removed.right);
                }
            }
        }

        return maxlevel;
    }
}