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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret =  new ArrayList();
        preorderTraversalAux(root, ret);
        return ret;
    }
    
    public void preorderTraversalAux (TreeNode node, List<Integer> arr){
        if(node!=null){
            arr.add(node.val);
            preorderTraversalAux (node.left, arr);
            preorderTraversalAux (node.right, arr);
            
        }
    }
}