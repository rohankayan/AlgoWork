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
    int total = 0;
    public int sumNumbers(TreeNode root) {
        helper(new StringBuffer(), root);
        return total;
    }
    private void helper(StringBuffer currSeq, TreeNode node){

        if(node!= null){
            currSeq.append(node.val);
        }
        else{
            return;
        }

        if(node.left == null && node.right == null){
            //System.out.println(currSeq);
            total += Integer.parseInt(currSeq.toString());
        }

        helper(new StringBuffer(currSeq), node.left);
        helper(new StringBuffer(currSeq),node.right);

    }
}