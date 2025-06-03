package DP;

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



public class DiameterOfBinaryTree {
    int ret = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        ret = 1;
        depth(root);
        return ret-1;
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        ret = Math.max(ret,l+r+1);
        return Math.max(l,r) + 1;
    }
}

