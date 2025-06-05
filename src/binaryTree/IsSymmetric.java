package binaryTree;


/**
 *判断一个二叉树是不是对称二叉树
 *
 *
 *
 * 二叉树中处于对称的两个节点L，R，一定有
 * L.val = R.val  即此两对称节点值相等
 * L.left.val = R.right.val ：即 L 的 左子节点 和 R 的 右子节点 对称
 * L.right.val = R.left.val ：即 L 的 右子节点 和 R 的 左子节点 对称
 *
 *
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return (root == null) || recur(root.left,root.right);
    }
    public boolean recur(TreeNode L,TreeNode R){
        if(L == null && R == null) return true;//当 L 和 R 同时越过叶节点： 此树从顶至底的节点都对称，因此返回 true 。
        if(L == null) return false;//当 L 或 R 中只有一个越过叶节点： 此树不对称，因此返回 false
        if(R == null) return false;//当 L 或 R 中只有一个越过叶节点： 此树不对称，因此返回 false
        if(L.val != R.val) return false;//当节点 L 值 != 节点 R 值： 此树不对称，因此返回 false
        return recur(L.left,R.right) && recur(L.right,R.left);
    }
}
