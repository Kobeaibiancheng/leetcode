package DP;


/**
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 *
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 *
 * 请你计算并返回达到楼梯顶部的最低花费。
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        return dfs(length,cost);
    }

    private int dfs(int length, int[] cost) {
        if (length <= 1)
            return 0;

        /**
         * 1.如果最后选择跳一个台阶，到达楼梯顶部，那么最终的代价就是，前n-1的总费用dfs(n-1) 加上 第n-1个台阶所需要的费用
         * 2.如果最后选择跳两个台阶，到达楼梯顶部，那么最终的代价就是，前n-2的总费用dfs(n-2) 加上 第n-2个台阶所需要的费用
         * 最终的费用，就是这两种不同思路所需要代价的最小值
         */
        int cost1 = dfs(length-1,cost) + cost[length-1];
        int cost2 = dfs(length-2,cost) + cost[length-2];

        return Math.min(cost1,cost2);
    }
}
