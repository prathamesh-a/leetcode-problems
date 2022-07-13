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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){ root=new TreeNode(val); }
        else{ req(root,val); }
        return root;
    }
    public void req(TreeNode root,int val){
        if(val>root.val){
            if(root.right!=null){ req(root.right,val); }
            else{ root.right=new TreeNode(val); }
        }
        else{
            if(root.left!=null){ req(root.left,val); }
            else{ root.left=new TreeNode(val); }
        }
    }
}