package array;


/**
 * 计算两个整数的二进制有多少个不同的二进制位
 */
public class HammingDistance {

    /**
     * 虽然实现了，但写的一坨
     * @param x
     * @param y
     * @return
     */
    /*public int hammingDistance(int x, int y) {
        int count = 0;
        while(x>0||y>0){
            if((x&1) != (y&1)){
                count++;
            }
            x = x>>1;
            y = y>>1;
        }
        return count;

    }*/

    public int hammingDistance(int x, int y) {
        int count = 0;
        for(int i = 0; i < 32;i++){
            int a = (x>>i)&1;
            int b = (y>>i)&1;
            count = count + a^b;
        }

        return count;

    }
}
