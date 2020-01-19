public class SearchInsert {
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
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,9};
        System.out.println(searchInsert(arr,0));
    }
}
