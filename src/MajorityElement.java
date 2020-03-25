public class MajorityElement {
    /**
     * 摩尔投票法：
     * 为构建正负抵消，假设数组首个元素 n1为众数，
     * 遍历统计票数，当发生正负抵消时，剩余数组的众数一定不变 ，这是因为：
     * 当 n1 = x： 抵消的所有数字中，有一半是众数。
     * 当 n1 != x： 抵消的所有数字中，少于或等于一半是众数。
     * 利用此特性，每轮假设都可以 缩小剩余数组区间 。当遍历完成时，最后一轮假设的数字即为众数
     * （由于众数超过一半，最后一轮的票数和必为正数）。
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) {
                x = num;
            }
            votes += num == x ? 1 : -1;
        }
        return x;
    }

    public static void main(String[] args) {

    }
}
