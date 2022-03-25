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
    int sumOfGrandChildren = 0;
    public int sumEvenGrandparent(TreeNode root) {
        healper( root);
        return sumOfGrandChildren;
    }
    
    private void healper(TreeNode node){
        
        if(node == null || (node.left == null && node.right ==null)){
            return;            
        }
           
        if(node.val%2 ==0){
            if(node.left != null){
                sumOfGrandChildren += node.left.left != null? node.left.left.val : 0;
                sumOfGrandChildren += node.left.right != null? node.left.right.val : 0;
            }
            
            if(node.right != null){
                sumOfGrandChildren += node.right.left != null? node.right.left.val : 0;
                sumOfGrandChildren += node.right.right != null? node.right.right.val : 0;
            }
            
        }
           
           healper( node.left);
           healper( node.right);
           
           
    }
}