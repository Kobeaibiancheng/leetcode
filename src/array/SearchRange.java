package array;

public class SearchRange {
    /*public static int[] searchRange(int[] nums, int target) {
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
    }*/

    public static int[] searchRange(int[] nums, int target) {
        int left = lowerBound(nums,target);
        if(left == nums.length || nums[left] != target){//说明没有target
            return new int[]{-1,-1};
        }

        //如果left存在，那么right必定存在
        int right = lowerBound(nums,target+1)-1;
        return new int[]{left,right};
    }

    private static int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] >= target){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return left;


    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        searchRange(arr,8);
    }
}
