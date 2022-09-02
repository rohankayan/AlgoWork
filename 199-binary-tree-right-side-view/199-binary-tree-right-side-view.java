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
   public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<TreeNode> parents = new ArrayList<>();
        List<TreeNode> children = new ArrayList<>();
        
        if(root != null)
            parents.add(root);
        
        while (parents.size() > 0 ){
            result.add(parents.get(parents.size()-1).val);
            for (TreeNode p:parents){
                if(p.left != null)
                    children.add(p.left);
                if(p.right != null)
                    children.add(p.right);
            }
            parents = children;
            children = new ArrayList<>();
            
        }
        return result;
    }
}