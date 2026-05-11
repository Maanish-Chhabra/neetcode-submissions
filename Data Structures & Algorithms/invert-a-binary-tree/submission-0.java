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
    void invert(TreeNode node){
        if(node.left==null && node.right==null) return;
        TreeNode tmp = node.left;
        node.left=node.right;
        node.right=tmp;
        if(node.left!=null) invert(node.left);
        if(node.right!=null) invert(node.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        invert(root);
        return root;
    }
}
