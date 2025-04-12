package NetEase;

import java.util.Scanner;

/**
 * 给定一个非负数组nums，假定下标从0开始，数组里每个元素代表下一跳能够跳跃的最大长度，如果能够跳到最后一个位置
 * 输出true，不能输出fasle
 */
public class JumpGame1 {
    public static boolean canJump(int[] nums){
        int n = nums.length;
        int rightmost = 0;
        for(int i = 0; i <n; i++ ){
            if(i <= rightmost){
                rightmost = Math.max(rightmost,i+nums[i]);
                if(rightmost >= n-1){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];
        for(int i = 0; i< length; i++){
            nums[i] = in.nextInt();
        }

        boolean result = canJump(nums);
        System.out.println(result);




        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
