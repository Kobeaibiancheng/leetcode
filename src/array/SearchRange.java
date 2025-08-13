package array;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left+(right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                int i = mid;
                int j = mid;
                while(i-1 >= 0 && nums[i-1] == target){
                    i--;
                }
                while(j+1 < nums.length && nums[j+1] == target){
                    j++;
                }
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        searchRange(arr,8);
    }
}
