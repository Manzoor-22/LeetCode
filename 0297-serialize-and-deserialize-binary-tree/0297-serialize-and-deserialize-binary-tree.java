/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "NULL,";
        }
        String leftSer = serialize(root.left);
        String rightSer = serialize(root.right);

        return root.val + "," + leftSer + rightSer;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();
        String s = "";

        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) == ','){
                q.add(s);
                s = "";
            } else {
                s += data.charAt(i);
            }
        }
        return helper(q);
    }

    public TreeNode helper(Queue<String> q){
        String removed = q.remove();
        if(removed.equals("NULL")){
            return null;
        }
        TreeNode curr = new TreeNode(Integer.parseInt(removed));
        curr.left = helper(q);
        curr.right = helper(q);

        return curr;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));