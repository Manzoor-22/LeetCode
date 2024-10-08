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
    private Stack<Integer> stack = new Stack<>();
    int curr = -1;
    int size = -1;

    public BSTIterator(TreeNode root) {
        inOrder(root);
    }

    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.right);
        size++;
        stack.push(root.val);
        inOrder(root.left);
    }
    
    public int next() {
        curr++;
        return stack.pop();
    }
    
    public boolean hasNext() {
        return curr != size;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */