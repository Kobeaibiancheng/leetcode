package thread;

import java.util.Random;

public class MyThread extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        System.out.println("开启线程"+ random.nextInt());
    }


    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
