package binaryTree;

import java.util.ArrayList;
import java.util.List;

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

public class InorderTraversal {
    List<Integer> list = new ArrayList<>();
    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        order(root,list);
        return list;
    }
    public void order(TreeNode root, List<Integer> list){
        if(root != null){
            order(root.left,list);
            list.add(root.val);
            order(root.right,list);
        }
    }*/
}
