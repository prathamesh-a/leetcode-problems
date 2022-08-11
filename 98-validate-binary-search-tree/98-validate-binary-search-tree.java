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
    static TreeNode prev;
    public static boolean isValidBST1(TreeNode root) {
        if(root==null) return true;
        if(isValidBST1(root.left)==false) return false;
        if(prev!=null && prev.val>=root.val) return false;
        prev=root;
        if(isValidBST1(root.right)==false) return false;
        return true;
    }
    public boolean isValidBST(TreeNode root){
        prev=null;
        return isValidBST1(root);
    } 
  
}