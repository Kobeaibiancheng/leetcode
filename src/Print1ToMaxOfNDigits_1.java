public class Print1ToMaxOfNDigits_1 {
    /**
     * 这样的代码 当 n 很大的时候，不管是int还是long long都会溢出
     * @param n
     */
    public static void print1ToMaxOfNDigits_1(int n) {
        int max = 1;
        for (int i = 0; i < n; i++) {
            max *= 10;
        }
        for (int i = 1; i < max; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        print1ToMaxOfNDigits_1(1    );
    }
}
