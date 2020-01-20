import java.util.Arrays;

public class RotatedArray {
    /**
     * 双重循环
     * 时间复杂度：O(kn)
     * 空间复杂度：O(1)
     * @param nums
     * @param k
     */
    public static void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int tmp = nums[nums.length-1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
    }
    private static void reverse(int[] nums,int start,int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    /**
     * 翻转
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));

    }
}
