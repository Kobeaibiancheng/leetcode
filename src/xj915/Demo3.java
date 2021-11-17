package xj915;
import java.util.*;
public class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int count = 0;
        //对二维数组进行初始化
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            int min = arr[i][0];
            int cow = 0;//纪律某行最小元素所在的列
            //找出这一行最小的元素
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    cow = j;
                }
            }
            //判断这是不是这一列最大的元素
            for (int j = 0; j < m; j++) {
                if (arr[j][cow] > min){
                    flag = false;
                    break;
                }
            }
            //执行到这里表示这是这一行最小的，也是这一列最大的元素，即这是一个马鞍点
            if (flag){
                count++;
            }
        }
        System.out.println("马鞍点的个数是"+count);

        /*for (int i = 0; i <= 9999; i++) {
            int a = i/1000;
            int b = i/100%10;
            int c = i/10%10;
            int d = i%10;
            if (c*1000+a*100+b*10+d*1+i == 9102){
                System.out.print(a+""+b+""+c+""+d);
                System.out.print(" ");
            }
        }*/
    }
}
