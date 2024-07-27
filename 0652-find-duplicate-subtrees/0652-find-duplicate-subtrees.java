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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new LinkedList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        helper(root, ans, hm);
        return ans;
    }

    public String helper(TreeNode root, List<TreeNode> ans, HashMap<String, Integer> hm){
        if(root == null){
            return "";
        }
        String left = helper(root.left, ans, hm);
        String right = helper(root.right, ans, hm);
        int val = root.val;

        String s = val + "," + left + "," + right;
        
        if(hm.getOrDefault(s, 0) == 1){
            ans.add(root);
        }
        hm.put(s, hm.getOrDefault(s, 0)+1);
        return s;
    }
}