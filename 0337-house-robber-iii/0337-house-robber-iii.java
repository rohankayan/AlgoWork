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
     public int rob(TreeNode root) {
        int[] val = subRob(root);
        return Math.max(val[0],val[1]);
    }

    private int[] subRob(TreeNode node){
        if(node == null)
            return new int[2];

        int[] left = subRob(node.left);
        int[] right = subRob(node.right);

        int[] val = new int[2];
        // if node is robbed
        val[0] =node.val+ left[1]+  right[1];

        //if parent is not robbed
        val[1] = Math.max(left[0], left[1])+ Math.max(right[0], right[1]);
        return val;
    }
}