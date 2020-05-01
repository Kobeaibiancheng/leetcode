public class MinArray {
    /**
     * 旋转数组的最小值
     * @param array
     * @return
     */
    public static int minArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int p1 = 0;
        int p2 = array.length-1;
        while (p1 < p2) {
            int mid = p1 + (p2-p1)/2;
            if (array[mid] > array[p2]) {
                p1 = mid+1;
            }else if (array[mid] < array[p2]) {
                p2 = mid;
            }else {
                p2--;
            }
        }
        return array[p1];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(minArray(arr));
    }
}
