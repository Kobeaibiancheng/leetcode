public class IsPalindrome {
    /**
     * 反转全部整数
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 ||(x%10 == 0 && x != 0)) {
            return false;
        }
        int reverseX = 0;
        int copyX = x;
        while (copyX > 0) {
            reverseX = copyX%10 + reverseX*10;
            copyX = copyX/10;
        }
        return x == reverseX;
    }
    public static void main(String[] args) {
        int x = 12321;
        System.out.println(isPalindrome(x));
    }
}
