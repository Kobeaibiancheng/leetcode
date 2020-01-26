import java.util.Arrays;

public class ContainsDuplicate {
    /**
     * 判断数组是否存在重复元素
     *
     * 对整数数组进行排序，然后遍历数组
     * 如果存在重复元素，排序后它们应该相邻
     * 就会满足 nums[i] == nums[i+1]
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    /*public static boolean containsDuplicate(int[] nums) {
        //双重循环
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }*/
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }
}
