package array;

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


/**
 * 一个升序数组，它对应的二叉搜索树的中序遍历就是这个升序数组
 * 所以就是根据二叉搜索树的中序遍历来构建平衡二叉树
 *
 * 每次以最中间的元素来当作根节点
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }

    public TreeNode dfs(int[] nums,int left,int right){
        if(left > right){
            return null;
        }


        int mid = (right-left)/2 + left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums,left,mid-1);
        root.right = dfs(nums,mid+1,right);
        return root;
    }
}
