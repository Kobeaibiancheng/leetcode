package binaryTree;

/**
 * 反转二叉树
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;


        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
