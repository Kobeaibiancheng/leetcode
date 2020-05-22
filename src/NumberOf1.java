public class NumberOf1 {
    /**
     * 剑指offer题解
     * 二进制中1的个数
     * 把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0
     * 那么一个整数的二进制表示中有多少个1，就可以进行多少次操作
     * @param n
     * @return
     */
    public static int numberOf1(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = (n-1) & n;
        }
        return count;
    }
    /*public static int numberOf1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n&1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }*/
}
