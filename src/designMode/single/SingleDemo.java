package designMode.single;

public class SingleDemo {
    public static void main(String[] args) {

        //编译出错，因为单例模式构造方式是私有化的
        //Single single = new Single();

        //获取唯一可用对象
        Single instance = Single.getInstance();

        //打印信息
        instance.print();
    }
}
