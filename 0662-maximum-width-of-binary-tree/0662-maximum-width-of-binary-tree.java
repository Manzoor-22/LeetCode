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
    static class Info{
        TreeNode node;
        int weight;
        Info(TreeNode node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null){
            return 0;
        }

        int ans = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));

        while(!q.isEmpty()){
            // to get elements of current level
            int size = q.size();
            // minimun of current first
            int min = q.peek().weight;
            // storing first and second
            int first = 0, second = 0;

            for(int i = 0; i < size; i++){
                Info removed = q.remove();
                int curr_id = removed.weight-min;
                TreeNode node = removed.node;

                if(i == 0)
                    first = curr_id;
                
                if(i == size-1)
                    second = curr_id;

                if(node.left != null){
                    q.add(new Info(node.left, 2*curr_id));
                }
                if(node.right != null){
                    q.add(new Info(node.right, 2*curr_id+1));
                }
            }
            ans = Math.max(ans , (second-first+1));
        }
        return ans;
    }
}