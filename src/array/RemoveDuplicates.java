package array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while(fast < n){
            if(nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }else{
                fast++;
            }
        }
        return slow;
    }


    /**
     * 这是我自己写的，写的很垃圾
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        int j = 0;
        int length = nums.length;//length表示需要返回的数，也就是数组nums前多少个元素
        while(i < length && j < length){
            if(nums[i] == nums[j]){
                j++;
            }else{
                int gap = j - i;//gap表示i和j下标之间的间隔
                if(gap > 2){//如果大于2表示需要删除多余的元素，只保留两个该元素
                    length = length - (gap-2);//当删除了gap-2个元素后，length需要减少gap-2个元素
                    i = i+2;//删除元素后新的下标i
                    int index = i;//保留原先的i
                    while(j < nums.length){//将后面的元素移动到前面去
                        nums[i] = nums[j];
                        j++;
                        i++;
                    }
                    i = index;
                    j = i;
                }else{
                    i = j;
                }
            }
        }
        int gap = j - i;
        if(gap > 2){
            length = length - (gap-2);
        }
        return length;

    }
}
