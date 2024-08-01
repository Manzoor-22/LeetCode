class Solution {
    static class Info{
        boolean isValid;
        int sum;
        int min;
        int max;

        public Info(boolean isValid, int sum, int min, int max){
            this.isValid = isValid;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    public int maxSumBST(TreeNode root) {
        checkBST(root);
        
        return maxSum;
    }

    int maxSum = 0;

    public Info checkBST(TreeNode root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = checkBST(root.left);
        Info right = checkBST(root.right);

        int sum = left.sum + right.sum + root.val;
        int min = Math.min(root.val, Math.min(left.min, right.min));
        int max = Math.max(root.val, Math.max(left.max, right.max));

        if(root.val >= right.min || root.val <= left.max){
            return new Info(false, sum, min, max);
        }

        if(left.isValid && right.isValid){
            maxSum = Math.max(maxSum, sum);
            return new Info(true, sum, min, max);
        }

        return new Info(false, sum, min, max);
    }
}