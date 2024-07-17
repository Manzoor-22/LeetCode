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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();

        if(root == null){
            return ans;
        }
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<Integer> reversed = new Stack<>();
        stk1.push(root);

        while(!stk1.isEmpty()){
            TreeNode curr = stk1.pop();
            if(curr == null){
                continue;
            }
            reversed.push(curr.val);
            if(curr.left != null)
                stk1.push(curr.left);
            if(curr.right != null)
                stk1.push(curr.right);
        }

        while(!reversed.isEmpty()){
            ans.add(reversed.pop());
        }

        return ans;
    }
}