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
   int globalCount = 0;
    public int goodNodes(TreeNode root) {
        goodNodesInner(Integer.MIN_VALUE,root);
        return globalCount;
    }

    void goodNodesInner(int maxSeen, TreeNode node){
        if(node == null)
            return;

        if(node.val >= maxSeen){
            globalCount++;
            maxSeen = node.val;
            
        }
        goodNodesInner(maxSeen, node.left);
        goodNodesInner(maxSeen, node.right);

    }
}