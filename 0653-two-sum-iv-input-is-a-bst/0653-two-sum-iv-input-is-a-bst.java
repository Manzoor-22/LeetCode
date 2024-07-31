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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        int i = 0, j = al.size()-1;

        while(i < j){
            int sum = al.get(i) + al.get(j);
            if(sum == k){
                return true;
            }
            else if(sum > k){
                j--;
            }
            else{
                i++;
            }
        }

        return false;
    }

    public void inorder(TreeNode root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }
}