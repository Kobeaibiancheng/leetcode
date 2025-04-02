package array;


/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {


    /**
     * 主要考虑两种情况
     * 1.最低位是不是9，不是9直接加1
     * 2.最低为是9，加1后最低为0，进一位，并依次判断高位是否是10
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        digits[n] = digits[n] + 1;
        while(digits[n] >= 10){
            digits[n] = digits[n] % 10;
            if(n == 0){

                /**
                 * 可以用这两行代码代替
                 * ret = new int[digits.length + 1];
                 * ret[0] = 1;
                 * return ret;
                 */
                int[] ret = new int[digits.length+1];
                for(int i = 0; i < ret.length; i++){
                    if(i == 0) ret[i] = 1;
                    else ret[i] = 0;
                }
                return ret;




            }
            digits[n-1] = digits[n-1] + 1;
            n--;
        }
        return digits;
    }
}
