package array;


/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class MergeTwoArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ret = new int[nums1.length];
        while(i < m && j < n){
            if(nums1[i] < nums2[j]) {
                ret[k] = nums1[i];
                i++;
                k++;
            }else{
                ret[k] = nums2[j];
                j++;
                k++;
            }
        }
        //i<m,表示下标为i以后的所有元素都大于nums2数组中的最大元素
        while(i < m) {
            ret[k] = nums1[i];
            k++;
            i++;
        }
        //j<n，表示下标j以后的所有元素都大于nums1数组中最大元素
        while(j < n) {
            ret[k] = nums2[j];
            k++;
            j++;
        }
        for(int l = 0; l < ret.length; l++) {
            nums1[l] = ret[l];
        }
    }
}
