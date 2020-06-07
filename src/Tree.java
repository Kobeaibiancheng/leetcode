class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

}
public class Tree {

    /**
     * 树的子结构
     * @param root1
     * @param root2
     * @return
     */
    public static boolean hasSubtree(TreeNode root1,TreeNode root2){
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = recur(root1,root2);
            }
            if (!result) {
                result = hasSubtree(root1.left,root2);
            }
            if (!result) {
                result = hasSubtree(root1.right,root2);
            }
        }
        return result;
    }

    private static boolean recur(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return recur(root1.left,root2.left) && recur(root1.right,root2.right);
    }


    /*public static TreeNode miniSpanningTree() {

    }*/
}
