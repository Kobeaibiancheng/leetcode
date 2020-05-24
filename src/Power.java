public class Power {
    /**
     * 没有考虑0和负数的情况
     * @param base
     * @param exponent
     * @return
     */
    public static double power(double base,int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2,2));
    }
}
