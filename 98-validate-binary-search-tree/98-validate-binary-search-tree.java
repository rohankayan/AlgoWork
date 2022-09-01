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
    public boolean isValidBST(TreeNode root) {
        
        return isValidBSTInner(root, Long.MIN_VALUE,  Long.MAX_VALUE);
        
    }
    
    private boolean isValidBSTInner(TreeNode n, long min, long max){
        
        if(n == null ){
            return true;
        }
        
        if(n.val <= min || n.val >= max){
            return false;
        }
        
        return isValidBSTInner(n.left, min, n.val) && isValidBSTInner(n.right,  n.val, max);
    }
}