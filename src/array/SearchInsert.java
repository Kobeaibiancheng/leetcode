package array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        //就是在传统的二分查找上修改，找到返回下标，找不到返回应该在的位置
        /**
         * 为什么直接return left；因为如果上面的没有返回return mid，说明最后一定是，left>right从而跳出循环的，
         * 在此之前是left=right，如果最后是right-1导致的left>right，说明原来的right位置是大于target的，
         * 所以返回原来的right位置即left位置；如果最后是left+1导致的left>right,
         * 说明是原来的的left=right这个位置小于target，而right能移动到这个位置，
         * 说明此位置右侧是大于target的，left现在加1就移动到了这样的位置，返回left即可
         */
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}
