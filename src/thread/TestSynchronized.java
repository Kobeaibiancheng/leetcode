package thread;

public class TestSynchronized {

    private String name = "yuxiang";

    static class Demo{
        //修饰实例方法，锁的是当前实例的对象
        public synchronized void print1(){
            System.out.println(Thread.currentThread().getId() +"进入实例方法");
            try {
                Thread.sleep(1000); // 模拟耗时操作
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getId() +"离开实例方法");
        }



        //修饰静态方法，锁的是类
        public synchronized static void print2(){
            System.out.println(Thread.currentThread().getId() +"进入类方法");
            try {
                Thread.sleep(1000); // 模拟耗时操作
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getId() +"离开类方法");
        }


    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread t1 = new Thread(() -> {
            Demo.print2();
        });

        Thread t2 = new Thread(() -> {
            Demo.print2();
        });
        t1.start();
        t2.start();
        Thread t3 = new Thread(() -> {
            demo.print1();
        });

        Thread t4 = new Thread(() -> {
            demo.print1();
        });
        t3.start();
        t4.start();



        TestSynchronized testSynchronized = new TestSynchronized();
        Thread t5 = new Thread(() -> {
            synchronized (testSynchronized){
                System.out.println(Thread.currentThread().getId()+"获取实例对象的锁");
                System.out.println("修改name为" + testSynchronized.name+Thread.currentThread().getId());
                System.out.println(Thread.currentThread().getId()+"释放实例对象的锁");
            }
        });

        Thread t6 = new Thread(() -> {
            synchronized (testSynchronized){
                System.out.println(Thread.currentThread().getId()+"获取实例对象的锁");
                System.out.println("修改name为" + testSynchronized.name+Thread.currentThread().getId());
                System.out.println(Thread.currentThread().getId()+"释放实例对象的锁");
            }
        });

        t5.start();

        t6.start();

        Thread t7 = new Thread(() -> {
            synchronized (TestSynchronized.class){
                System.out.println(Thread.currentThread().getId() +"获取类的class对象锁");
                System.out.println(Thread.currentThread().getId() +"释放类的class对象锁");

            }
        });

        Thread t8 = new Thread(() -> {
            synchronized (TestSynchronized.class){
                System.out.println(Thread.currentThread().getId() +"获取类的class对象锁");
                System.out.println(Thread.currentThread().getId() +"释放类的class对象锁");
            }
        });
        t7.start();
        t8.start();



    }
}
