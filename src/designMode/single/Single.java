package designMode.single;

public class Single {

    //创建Single的一个实例化
    private static Single single = new Single();

    //构造方法私有化，该类就不会类的外部被实例化
    private Single(){}

    //提供全局访问点来访问该实例
    public static Single getInstance(){
        return single;
    }

    public void print(){
        System.out.println("我是单例模式！");
    }

}
