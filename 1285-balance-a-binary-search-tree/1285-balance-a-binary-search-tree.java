class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> al = new ArrayList<>();

        inorder(root, al);

        TreeNode newNode = createBST(al, 0, al.size()-1);

        return newNode;
    }

    public TreeNode createBST(List<Integer> al, int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low+high)/2;
        
        TreeNode newNode = new TreeNode(al.get(mid));
        newNode.left = createBST(al, low, mid-1);
        newNode.right = createBST(al, mid+1, high);

        return newNode;
    }

    public void inorder(TreeNode root, List<Integer> al){
        if(root == null){
            return;
        }
        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }
}