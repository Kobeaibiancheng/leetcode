public class Fib {
    /**
     * 非递归代码
     * @param n
     * @return
     */
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if(n == 0) {
            return 0;
        }
        if (n <= 2) {
            return c;
        }
        for(int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = (a+b)%1000000007;
        }
        return c;
    }
    /**
     * 递归代码
     * 效率不高   会重复计算
     * @param n
     * @return
     */
    /*public static int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }*/



    //青蛙跳台阶（剑指offer上的题目）
    //问：一只青蛙一次可以跳上一个台阶，也可以跳上两个台阶，求该青蛙跳上一个n级台阶总共有多少种跳法
    /*

                      方法数                                    台阶数(n)
                       1   [1]                                     1
                       2   [1,1] [2]                               2
                       3   [1,1,1] [1,2],[2,1]                     3
                       5  [1,1,1,1][1,1,2][1,2,1][2,1,1][2,2]      4
                       6   ....                                    5

                               0                 n = 0;
                       f(x)    1                 n = 1;
                               2                 n = 2;
                               f(n-1) + f(n-2)   n > 2;

        如果只有1级台阶，那显然只有一种跳法
        如果有2级台阶，那么就有2种跳法，一种是分2次跳。每次跳1级，另一种就是一次跳2级
        如果台阶级数大于2，设为n的话，这时我们把n级台阶时的跳法看成n的函数，记为f(n),
        第一次跳的时候有2种不同的选择：一是第一次跳一级，此时跳法的数目等于后面剩下的n-1级台阶的跳法数目，即为f(n-1),
        二是第一次跳二级，此时跳法的数目等于后面剩下的n-2级台阶的跳法数目，即为f(n-2),
        因此n级台阶的不同跳法的总数为f(n) = f(n-1) + f(n-2)，不难看出就是斐波那契数列

        递归做法
     */
    public static int numWaysRecursive(int n) {
        if(n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return numWaysRecursive(n-1) + numWaysRecursive(n-2);
    }
    /*
        当然递归的方法效率不高，也可以通过迭代方式计算
     */
    public static int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if(n == 1 || n == 2 || n == 3) {
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 3;
        for (int i = 3; i < n; i++) {
            a = b;
            b = c;
            c = (a+b)%1000000007;
        }
        return c;
    }

    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个m级的台阶总共有多少种跳法

    如果台阶级数为n的话，这时我们把n级台阶时的跳法看成n的函数，记为f(n),
    第一次跳的时候有n种不同的选择：若是第一次跳一级，此时跳法的数目等于后面剩下的n-1级台阶的跳法数目，即为f(n-1),
    若是第一次跳m(m<n)级，此时跳法的数目等于后面剩下的n-m级台阶的跳法数目，即为f(n-m),若是第一次跳n级，此时跳法的数目等于1.
    所以f(n) = f(n-1) + f(n-2) + ...+ f(n-m) + ... + f(2) + f(1) + 1;
    因此f(n-1) = f(n-2) +  ... + f(n-m) + ... +f(2) + f(1) + 1;
    两式相减得到 f(n) = 2 * f(n-1);
    因此可以得到下面的结果 f(n) = 2^n-1;

     */

    public static int numWaysAnyJump(int n) {
        return (int)Math.pow(2,n-1);
    }

    public static void main(String[] args) {
        System.out.println(numWaysAnyJump(4));
    }


}
