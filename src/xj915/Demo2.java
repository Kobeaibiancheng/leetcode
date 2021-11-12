package xj915;


import java.util.*;

class Student{
    String name;
    int score;
}
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n位同学的名字和成绩");
        int n = sc.nextInt();
        int flag = 0;
        Student[] sts = new Student[n];
        //System.out.println(sts.length);
        for (int i = 0; i < n; i++) {
            Student st = new Student();
            st.name = sc.next();
            st.score = sc.nextInt();
            sts[i] = st;
        }
        //sc.next();
        System.out.println("请输入1表示正序，-1表示逆序");
        flag = sc.nextInt();
        //冒泡排序
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (sts[j].score < sts[j-1].score){
                    Student tmp = sts[j];
                    sts[j] = sts[j-1];
                    sts[j-1] = tmp;
                }
            }
        }
        //正序 从小到大
        if (flag == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(sts[i].name+": "+sts[i].score);
            }
        }else {//逆序  从大到小
            for (int i = n-1; i >= 0; i--) {
                System.out.println(sts[i].name+": "+sts[i].score);
            }
        }
    }
}
