public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] num) {
        return dfs(num, 0, num.length - 1);
    }

    private static TreeNode dfs(int[] num, int low, int high) {
        if (low > high) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(num[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(num, low, mid - 1);
        root.right = dfs(num, mid + 1, high);
        return root;
    }

    public static void main(String[] args) {

        int[] arr = {-1,0,5,6,7,8};
        sortedArrayToBST(arr);
    }
}
