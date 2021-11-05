package xj915;
import java.util.*;


//共享栈
class ShareStack{
    int[] arr = new int[10];
    int top1 = -1;
    int top2 = arr.length;


    //stack1 push
    public boolean push1(int e){
        //判断共享栈是否满
        if (isFill()){
            return false;//push失败返回
        }else {
            top1++;
            arr[top1] = e;
            return true;
        }
    }

    //stack2 pop
    public boolean pop2(Integer x){
        //判断stack2是否为空
        if (top2 == arr.length){
            return false;//stack2为空，pop失败返回
        }else {
            x = arr[top2];
            top2--;
            return true;
        }
    }

    //判断共享栈是否空
    public boolean isEmpty(){
        return top1 == -1 && top2 == arr.length;
    }
    //判断共享栈是否满
    public boolean isFill(){
        return (top1 + 1) == top2;
    }
}
public class Demo1 {
    //共享栈测试代码
    public static void shareStackTest(){
        ShareStack ss = new ShareStack();
        int x = 0;
        System.out.println(ss.pop2(x));
        System.out.println(x);
        System.out.println(ss.push1(1));
        ss.push1(2);
        ss.push1(3);
        ss.push1(4);
        ss.pop2(x);
        System.out.println(x);
        ss.pop2(x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        int[] counts = new int[10];//记录0-9的数字有多少个
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择输入几个字符串：");
        while (!sc.hasNext("#")){
            String str = sc.next();
            System.out.println(str);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    counts[str.charAt(i)-'0']++;
                }
            }

        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("等于的"+i+"有"+counts[i]+"个");
        }

    }
}
