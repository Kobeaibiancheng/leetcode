package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement {
    /**
     * 对这个数组排序，因为测试用例是一定存在多数元素的，所有排序后的中间元素一定是多数元素（众数）
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length/2];
    }


    /**
     * 遍历数组中出现的元素，保存在HashMap中（Map和Set中元素不会重复）
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else {
                map.put(num, map.get(num)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }


    /**
     * 摩尔投票法，时间复杂度O(n),空间复杂度O(1)
     * 假定下标为0的元素为众数，然后遍历，出现假定的元素，votes加1，不是假定元素减1，（是就加一，不是就减一，抵消思想）
     * 当votes是0时，重新假定当前元素为众数
     * @param nums
     * @return
     */
    public int majorityElement3(int[] nums) {
        int x = 0;
        int votes = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果票数等于0，之前的投票抵消了
            if (votes == 0) {
                //重新假定当前下标的元素为众数
                x = nums[i];
                votes++;
            }else{
                //如果票数不为0，并且当前元素等于假定的众数元素，那么给众数元素votes加1
                if(nums[i] == x){
                    votes++;
                }else {//如果不等于，给众数votes票数减1
                    votes--;
                }
            }
        }
        return x;
    }

}
