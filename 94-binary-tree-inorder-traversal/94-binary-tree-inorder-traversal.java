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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> pending = new Stack<TreeNode>();
        traverseAllLeftNodes(root,pending);
        
        List<Integer> result = new ArrayList<Integer>();
        
        while(!pending.isEmpty()){
            TreeNode curr= pending.pop();
            result.add(curr.val);
            traverseAllLeftNodes(curr.right,pending);            
        }
        return result;
    }
    
    private void traverseAllLeftNodes(TreeNode n, Stack<TreeNode> pending){
       if(n!=null){
           pending.add(n);
           traverseAllLeftNodes(n.left,pending);
       }
        
        
    }
}