public class Fib {
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
    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i = 2; i < n; i++) {
            c = (a+b)%1000000007;
            a = b;
            b = c;
        }
        return c;
    }
}
