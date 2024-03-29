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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        return mergeTreesInner(root1,root2);
    }

    private TreeNode mergeTreesInner(TreeNode node1, TreeNode node2){
        
        
        if(node1 == null)
            return  node2;
        if(node2 == null)
            return node1;
        node1.val += node2.val;
        
        node1.left = mergeTreesInner(node1.left,node2.left);
        node1.right = mergeTreesInner(node1.right, node2.right);
        
        return node1;
    }
    
    
    
}