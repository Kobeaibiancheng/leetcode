import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums,int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,2,5};
        int ret = removeElement(nums,2);
        System.out.println(Arrays.toString(nums));
        System.out.println(ret);
    }
}
