/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> ll1 = new LinkedList<>();
        LinkedList<TreeNode> ll2 = new LinkedList<>();

        findPath(root, p, ll1);
        findPath(root, q, ll2);

        int i = 0;

        for(;i < ll1.size() && i < ll2.size(); i++){
            if(ll1.get(i) != ll2.get(i))
                break;
        }

        return ll1.get(i-1);
    }

    public boolean findPath(TreeNode root, TreeNode target, LinkedList<TreeNode> ll) {
        if (root == null) {
            return false;
        }
        ll.add(root);
        if(root == target){
            return true;
        }

        if(findPath(root.right, target, ll) || findPath(root.left, target, ll))
            return true;
        
        ll.remove(ll.size()-1);
        return false;
    }
}