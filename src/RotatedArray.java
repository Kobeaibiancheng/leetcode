import java.util.Arrays;

public class RotatedArray {
    private static void reverse(int[] nums,int start,int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
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
