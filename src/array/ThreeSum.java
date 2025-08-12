package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length;i++){
            if(nums[i] > 0){
                return ret;
            }
            int l = i+1;
            int right = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while(l < right){
                int sum = nums[i] + nums[l] + nums[right];
                if (sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[right]);
                    ret.add(list);
                    while(l < right && nums[l] == nums[l+1]){//去nums[l]除重复元素
                        l++;
                    }
                    while(l < right && nums[right]  == nums[right-1]){//去nums[right]除重复元素
                        right--;
                    }
                    l++;
                    right--;
                }else if(sum < 0){//说明目前小于0，应该增加nums[l]的值
                    l++;
                }else{//说明目前大于0,应该减少nums[right]的值
                    right--;
                }
            }
        }
        return ret;
    }
}
