package array;

/**
 * 计算一个数的二进制中有多少个1
 */
public class CountBits {
    public int[] countBits(int n) {
        int[] ret = new int[n+1];
        for(int i = 0; i < ret.length; i++){
            ret[i] = countOne(i);
        }
        return ret;
    }
    public int countOne(int i){
        int count = 0;

        /**
         * i= i&(i-1)
         * i-1相当于把这个数的二进制中最低位的1变成0
         * 然后再跟原本的自己i进行按位与
         * 5&(5-1)=101&(100)=100
         * 100&(011)=000
         * 每执行一次就代表有一个1，循环判断条件i>0
         */
        while(i > 0){
            i = i & (i-1);
            count++;
        }
        return count;
    }
}
