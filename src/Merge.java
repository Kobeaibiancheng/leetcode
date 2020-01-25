import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] nums1,int m,int[] nums2,int n) {
        int[] newNums1 = Arrays.copyOf(nums1,m+n);
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        if (newNums1[p1] < nums2[p2]){
            while (newNums1[p1] < nums2[p2]) {
                p1++;
            }
            //循环挪p1-1后的元素;
            for (int i = nums1.length-1; i >= p1 ; i--) {
                newNums1[i+1] = newNums1[i];
            }
            newNums1[p1-1] = nums2[p2];
            p1++;
            p2++;
        }else {

        }


        return newNums1;
    }
    public static void main(String[] args) {
        int[] nums1 ={1,2,3};
        int[] nums2 ={2,5,6};

        System.out.println(Arrays.toString(merge(nums1,nums1.length,nums2,nums2.length)));
    }
}
