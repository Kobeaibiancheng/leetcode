import java.util.Arrays;

public class ReorderOddEven {
    public static int[] reorderOddEven(int[] arr) {
        if (arr == null) {
            return arr;
        }
        /**
         * p1 从前往后，找到一个偶数
         * p2 从后往前，找到一个奇数
         * 然后交换
         */
        int p1 = 0;
        int p2 = arr.length-1;
        while (p1 < p2) {
            while (p1 < p2 && (arr[p1]&1) != 0) {
                p1++;
            }
            while (p1 < p2 && (arr[p2]&1) != 1) {
                p2--;
            }
            if (p1 < p2) {
                int tmp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = tmp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,8,5,7};
        reorderOddEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
