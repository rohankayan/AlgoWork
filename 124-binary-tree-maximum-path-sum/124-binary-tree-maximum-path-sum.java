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
    int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumInner(root);
        
        return maxPathSum;
    }

     int maxPathSumInner(TreeNode n) {
        if(n == null )
            return 0;
        int leftPathSum = Math.max(0,maxPathSumInner(n.left));
        int rightPathSum =  Math.max(0, maxPathSumInner(n.right));
        
        maxPathSum = Math.max(maxPathSum, n.val+ leftPathSum + rightPathSum);
        
        return n.val + Math.max(leftPathSum,rightPathSum);

        

    }

}