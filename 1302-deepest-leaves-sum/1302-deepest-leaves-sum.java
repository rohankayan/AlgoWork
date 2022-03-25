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
    int maxLevel=0;
    int maxLevelSum = 0;
    public int deepestLeavesSum(TreeNode root) {
        deepestLevelSum(root, 0);
        return maxLevelSum;
    }
    
    
    void deepestLevelSum(TreeNode node, int currentLevel){
        if(node == null){
            return;
        }
        if(currentLevel > maxLevel){
            maxLevel = currentLevel;
            maxLevelSum = node.val;
        }
        else if(currentLevel == maxLevel){
            maxLevelSum += node.val;
        }
        deepestLevelSum(node.left, currentLevel + 1);
        deepestLevelSum(node.right, currentLevel + 1);
        
    }
}