public class MaxSubArray {
    /**
     * 连续子数组中的最大和
     *
     * 输入一个整型数组，数组里有正数也有负数。
     * 数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
