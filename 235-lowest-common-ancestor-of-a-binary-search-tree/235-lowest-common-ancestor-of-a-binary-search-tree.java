/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
    if(root.val==p.val  || root.val==q.val)
       return root;
        
        int l=Math.min(p.val,q.val);
        int g=Math.max(p.val,q.val);
        
    if(g>root.val && l<root.val) return root;
    if(g>root.val && l>root.val) return lowestCommonAncestor(root.right,p,q);
    if(g<root.val && l<root.val) return lowestCommonAncestor(root.left,p,q);
        
    return null;
    }
}