package xj915;

import java.util.ArrayList;

import java.util.*;
public class Demo3 {

    public static void MaAnDian(){

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

    }

    /**
     * 完全数
     */
    public static void CompleteNumber(){
        //循环产生0-10000
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j <= i/2; j++) {//因数只会小于等于他本身除以2
                if (i%j == 0){//代表能够整除，那这个数就是因数
                    sum = sum+j;
                }
            }
            if (sum == i){
                System.out.print(i+" ");
                //求素数p
                for (int j = 0; j <= sum/2; j++) {
                    if (sum == Math.pow(2,(j-1))*(Math.pow(2,j)-1)){
                        System.out.print(j);
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        CompleteNumber();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        System.out.println(list1.size());
        System.out.println();
        System.out.println("这下面是队列吗？");
        Queue<Integer> list2 = new LinkedList<>();
        list2.offer(1);
        list2.offer(2);
        list2.offer(3);
        list2.offer(4);
        System.out.println(list2.peek());
        System.out.println(list2.poll());
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("这下面是栈吗？");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
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
