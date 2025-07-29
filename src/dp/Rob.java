package DP;

public class Rob {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //子问题
        //f(k) =
        //f(0) = 0;
        //f(1) = nums[0];
        //f(k) = max{rob(k-1),nums[k-1] + rob(k-2)}
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[n];
    }
}
