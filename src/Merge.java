import java.util.Arrays;

public class Merge {
    /**
     * 合并两个有序的数组
     * 从后往前比较，把较大的放在nums1的最后
     * 当nums2没有比较完，直接放在nums1（有序数组）
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1,int m,int[] nums2,int n) {
        int p1 = m-1;
        int p2 = n-1;
        int last = nums1.length-1;
        while(p1 >= 0 && p2 >=0) {
            if(nums2[p2] > nums1[p1]) {
                nums1[last--] = nums2[p2--];
            } else {
                nums1[last--] = nums1[p1--];
            }
        }
        while(p1 < 0 && p2 >= 0) {
            nums1[last--] = nums2[p2--];
        }
    }
    public static int[] merge(int[] nums1,int[] nums2) {
        int p1 = nums1.length-1;
        int p2 = nums2.length-1;
        int[] newNums1 = Arrays.copyOf(nums1,nums1.length+nums2.length);
        int last = newNums1.length-1;
        while(p1 >= 0 && p2 >=0) {
            if(nums2[p2] > newNums1[p1]) {
                newNums1[last--] = nums2[p2--];
            } else {
                newNums1[last--] = newNums1[p1--];
            }
        }
        while(p1 < 0 && p2 >= 0) {
            newNums1[last--] = nums2[p2--];
        }
        return newNums1;
    }
    public static void main(String[] args) {
        int[] nums1 ={1,2,3};
        int[] nums2 ={2,5,6};
        System.out.println(Arrays.toString(merge(nums1,nums2)));
        System.out.println(merge(nums1,nums2));
        System.out.println(nums1);}
}
