public class ReverseInt {
    public static int reverse(int x) {
        int ret = 0;
        while(x != 0) {
            int pop = x%10;
            if (ret > Integer.MAX_VALUE/10 || (ret == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ret < Integer.MIN_VALUE/10 || (ret == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            ret = ret*10 + pop;
            x /= 10;
        }
        return ret;
    }
    public static void printReverse(int n) {
        if (n <= 9) {
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        printReverse(n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));
        //printReverse(1234);
    }
}
