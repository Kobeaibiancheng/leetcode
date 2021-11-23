package xj915;

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
    //调整数组的数字顺序，使得奇数位于数组的前面，偶数位于数组的后面，并且相对位置不变
    public static void switchNum(int[] arr){
        int i = arr.length-1;
        int count = 0;
        while (i > count){
            //从后面找到一个奇数
            while (arr[i]%2 != 1){
                i--;
            }
            int tmp = arr[i];
            //移动元素
            for (int j = i; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            //放在下标为0的位置
            arr[0] = tmp;
            count++;
        }
    }
    public static ListNode firstPubListNode(ListNode head1,ListNode head2){
        int length1 = 0;
        int length2 = 0;
        ListNode cur = head1;
        while (cur != null){
            cur = cur.next;
            length1++;
        }
        cur = head2;
        while (cur != null){
            cur = cur.next;
            length2++;
        }
        int i = length1-length2;
        if (i>0){
            while (i > 0){
                head1 = head1.next;
                i--;
            }
            while (head1 != head2){
                head1 = head1.next;
                head2 = head2.next;
            }
        }else {
            while (i < 0){
                head2 = head2.next;
                i++;
            }
            while (head1 != head2){
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return head1;
    }
    public static String reverseWords(String str){
        //整体反转
        str = myReverse(str);
        String[] strs = str.split(" ");
        StringBuffer ret = new StringBuffer();
        //局部反转
        for (int i = 0; i < strs.length; i++) {
            strs[i] = myReverse(strs[i]);
        }
        for (int i = 0; i < strs.length; i++) {
            ret = ret.append(strs[i]).append(" ");
        }
        return ret.toString();
    }
    private static String myReverse(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        str = new String(arr);
        return str;
    }

    //将字符串中所有空格替换成%20
    public static String switchSpace(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }
    //字符串转化为整数
    public static int strToInt(String str){
        int flag = 1;
        int ret = 0;
        int i = 0;
        //判断是不是负数，是负数就做一个标记
        if (str.charAt(0) == '-'){
            flag = -1;
            i++;
        }
        //整数
        if (str.charAt(0) == '+'){
            i++;
        }
        for (; i < str.length(); i++) {
            //取字符串的每一位，并乘以它的权重
            int bit = (str.charAt(i)-'0')*(int)Math.pow(10,str.length()-i-1);
            ret += bit;
        }
        return flag == 1?ret:-ret;
    }
    public static void main(String[] args) {
        System.out.println(strToInt("+5219980"));
        /*System.out.println(switchSpace("3231sdfa 1231 dsaf 4"));
        String str = "Cricket is very strong";
        System.out.println(str);
        str = reverseWords(str);
        System.out.println(str);
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        ListNode node5 = new ListNode();
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node6 = new ListNode();
        ListNode node7 = new ListNode();
        ListNode node8 = new ListNode();
        ListNode node9 = new ListNode();
        head2.next = node6;
        node6.next = node7;
        node7.next = node3;
        node3.val = 1;

        System.out.println(firstPubListNode(head1,head2).val);*/



        /*int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        switchNum(arr);

        System.out.println(Arrays.toString(arr));*/

        /*CompleteNumber();
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
        System.out.println(stack.peek());*/
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
