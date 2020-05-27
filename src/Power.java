public class Power {
    /**
     * 数值的整数次方
     * @param base
     * @param exponent
     * @return
     */
    public static double power(double base,int exponent) {
        if(base == 0) {
            return 0;
        }
        //指数为负数
        if (exponent < 0) {
            return 1/powerWithUnsignedExponent(base,-exponent);
        }else {
            return powerWithUnsignedExponent(base,exponent);
        }
    }

    /*public static double powerWithUnsignedExponent(double base,int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }*/

    /**
     * 计算 a 的n次方的方法
     *         a^(n/2) a^(n/2)         n为偶数
     * a^n =   a^(n-1)/2 a^(n-1)/2     n为奇数
     *
     *
     * @param base
     * @param exponent
     * @return
     */
    public static double powerWithUnsignedExponent(double base,int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = powerWithUnsignedExponent(base,exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2,-2));
    }
}
