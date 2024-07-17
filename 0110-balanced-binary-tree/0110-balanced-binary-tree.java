class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if (!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        return true;
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH,rightH)+1;
    }
}