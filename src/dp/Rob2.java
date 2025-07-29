package DP;

import java.util.Arrays;

/**
 * 打家劫舍2
 * 打家劫舍1是一个数组，而2是一个环形数组，所以当打劫了最后一个元素，意味了0号下标也就不能打劫了
 * 所以将这么一个问题，分解为两个类似的问题
 * 即：舍弃0号下标，或者舍弃n-1下标
 *
 */
public class Rob2 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }
    public int myRob(int[] nums){
        int n = nums.length;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int k = 2; k <= n; k++){
            dp[k] = Math.max(dp[k-1], nums[k-1] + dp[k-2]);
        }
        return dp[n];
    }
}
