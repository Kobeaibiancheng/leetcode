package array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {


    /**
     * 可以通过按位异或操作符来实现
     * 2   ^  2
     * 10
     * 10
     * 00==0
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int ret = 0;
        /*for (int i = 0; i < nums.length; i++) {
            ret = nums[i] ^ ret;
        }*/
        for(int num: nums){
            ret = num ^ ret;
        }
        return ret;
    }

    /**
     * 遍历这个数组，加入hashset这个不能重复的集合，当集合中包含当前元素时，删除集合中的这个元素，
     * 最终hashset中剩下的元素就是只出现一个的元素
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        int ret = iterator.next().intValue();
        return ret;
    }
}
