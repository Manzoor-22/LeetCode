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
class BSTIterator {
    public LinkedList<Integer> ll = new LinkedList<>();
    public int currIdx = -1;

    public BSTIterator(TreeNode root) {
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        ll.add(root.val);
        inOrder(root.right);
    }
    
    public int next() {
        currIdx++;
        return ll.get(currIdx);
    }
    
    public boolean hasNext() {
        return currIdx < ll.size()-1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */