package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static int[] bubSort(int[] arr) {
        //从大到小
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j+1] > arr[j]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }*/

        //由小到大
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j+1] < arr[j]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    //统计字符串中数字字符，字母字符，其他类型字符的个数
    public static void countChar(String str){
        int sumNum = 0;
        int sumChar = 0;
        int sumOther = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9'){
                sumNum++;
            }else if ((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')){
                sumChar++;
            }else {
                sumOther++;
            }
        }
        System.out.println("数字字符："+sumNum);
        System.out.println("字母字符："+sumChar);
        System.out.println("其他类型字符："+sumOther);
    }

    //二分查找算法
    public static int BinarySearch(int[] arr,int low,int high,int key){
        while(low <= high) {
            int mid = (high - low)/2 + low;
            if (arr[mid] == key) {
                return mid;
            }else if(arr[mid] > key) {
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,30,40};
        System.out.println(BinarySearch(arr,0,arr.length-1,1));

        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //char[] arr = str.toCharArray();
        //countChar(str);




        /*int[] arr = {4,3,1,6,7,10,2,5,9,8};
        System.out.println(Arrays.toString(arr));
        bubSort(arr);

        System.out.println(Arrays.toString(arr));*/
    }
}
