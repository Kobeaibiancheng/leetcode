package designMode.single;

public class SingleThreadSafety {

    private static volatile SingleThreadSafety instance = null;



    private SingleThreadSafety() {}




    public static SingleThreadSafety getInstance(){
        if (instance == null){
            synchronized (SingleThreadSafety.class){
                if (instance == null){
                    instance = new SingleThreadSafety();
                }
            }
        }

        return instance;
    }


    /**
     * 为什么要两次旁空
     */
    /*public static SingleThreadSafety getInstance(){
        if (instance == null){
            synchronized (SingleThreadSafety.class){
                //没有第二个判空，多线程下多次实例化
                instance = new SingleThreadSafety();

            }
        }

        return instance;
    }*/

    /*public static SingleThreadSafety getInstance(){
        //没有外层判空，多线程下，只要调用这个方法，就要竞争锁，导致性能低
        synchronized (SingleThreadSafety.class){
            if (instance == null){
                instance = new SingleThreadSafety();
            }
        }


        return instance;
    }*/


    public void print(){
        System.out.println("双重校验懒汉单例模式");
    }


    public static void main(String[] args) {
        SingleThreadSafety instance = getInstance();
        instance.print();

    }
}
