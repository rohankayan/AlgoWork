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
     public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        return Math.abs(heightOfTree(root.left)-heightOfTree(root.right))<=1 && isBalanced( root.left) && isBalanced(root.right) ;
    }
    
    private int heightOfTree(TreeNode node){
        if(node == null)
            return 0;
        return 1 + Math.max(heightOfTree(node.right),heightOfTree(node.left));
    }
}