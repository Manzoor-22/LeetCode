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
    class Info{
        int val;
        TreeNode node;
        Info(TreeNode node, int val){
            this.node = node;
            this.val = val;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new LinkedList<>();

        if(root == null){
            return ans;
        }

        //HashMap for storing nodes val with weights
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        //Queue for Level-Order traversal
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));
        q.add(new Info(null, 0));

        while(!q.isEmpty()){
            Info removed = q.remove();
            if(removed.node == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(new Info(null, 0));
                }
            }
            else{
                if(!tm.containsKey(Math.abs(removed.val)))
                    tm.put(Math.abs(removed.val), removed.node.val);
                if(removed.node.right != null){
                    q.add(new Info(removed.node.right, removed.val+1));
                }    
                if(removed.node.left != null){
                    q.add(new Info(removed.node.left, removed.val+1));
                }                
            }
        }

        System.out.println(tm);

        for(Map.Entry<Integer, Integer> itr : tm.entrySet()){
            ans.add(itr.getValue());
        }
        
        return ans;
    }
}