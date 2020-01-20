public class SearchInsert {
    /**
     * 二分查找迭代写法
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums,int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 二分查找递归写法
     * @param nums
     * @param target
     * @param left
     * @param right
     * @return
     */
    public static int searchInsert(int[] nums,int target,int left,int right) {
        int mid = (left+right)/2;
        if (left > right) {
            return left;
        }
        if (nums[mid] == target) {
            return mid;
        }else if (nums[mid] > target) {
            return searchInsert(nums,target,left,mid-1);
        }else {
            return  searchInsert(nums,target,mid+1,right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,9};
        System.out.println(searchInsert(arr,0,0,arr.length));
    }
}
