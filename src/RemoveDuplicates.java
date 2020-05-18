public class RemoveDuplicates {
    /**
     * 删除排序后的数组
     * 如果没有排序，可以先排序下
     * 数组完成排序后，我们可以放置两个指针 ii 和 jj，其中 ii 是慢指针，而 jj 是快指针。
     * 只要 nums[i] = nums[j]nums[i]=nums[j]，我们就增加 jj 以跳过重复项。
     * 当我们遇到 nums[i] != nums[j]时，跳过重复项的运行已经结束，
     * 因此我们必须把它（nums[j]）的值复制到 nums[i + 1]。然后递增 i，
     * 接着我们将再次重复相同的过程，直到 j 到达数组的末尾为止
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                j++;
            }else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
