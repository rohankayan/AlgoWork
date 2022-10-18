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
    int finalSum =0;
    public int sumNumbers(TreeNode root) {
        helper(new StringBuffer(),  root);
        return finalSum;
    }
    
    void helper( StringBuffer currentSeq, TreeNode node){
        
        if(node == null){
            return;
        }
        currentSeq.append(node.val);
        if(node.left == null && node.right == null){
            //System.out.println(finalSum);
            finalSum += Integer.parseInt(currentSeq.toString());
        }
        else{
            
            helper(new StringBuffer(currentSeq),  node.left);
            helper(new StringBuffer(currentSeq),  node.right);
        }
    }
}