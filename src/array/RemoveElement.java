package array;


/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //用k来表示不等于val的元素个数
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            //不相等，将nums[i]的值复制到nums[k]
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
