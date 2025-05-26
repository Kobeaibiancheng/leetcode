package thread;



public class Test1 implements Runnable{
    private static int i = 0;


    public synchronized void add(){
        i++;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10000;i++){
            add();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Test1());
        Thread thread2 = new Thread(new Test1());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(i);
    }
}
//并没有达到同步的效果，synchronized加锁是给两个Test()实例加的锁
