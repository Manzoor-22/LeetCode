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
        return ll.remove(0);
    }
    
    public boolean hasNext() {
        return ll.size() > 0;
    }
}