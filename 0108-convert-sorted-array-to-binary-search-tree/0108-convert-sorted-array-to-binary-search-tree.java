class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = insert(nums, 0, nums.length-1);

        return root;
    }
    public TreeNode insert(int[] nums, int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low+high)/2;

        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = insert(nums, low, mid-1);
        newNode.right = insert(nums, mid+1, high);

        return newNode;
    }
}