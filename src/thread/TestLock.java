package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {



    private static Lock lock = new ReentrantLock();
    static class Count implements Runnable{

        private int count;
        @Override
        public void run() {

            lock.lock();
            try {
                count++;
            } finally {
                lock.unlock();
            }
        }
    }



    public static void main(String[] args) throws InterruptedException {
        TestLock testLock = new TestLock();

        Count count = new Count();
        Thread thread1 = new Thread(count);
        Thread thread2 = new Thread(count);
        Thread thread3 = new Thread(count);
        Thread thread4 = new Thread(count);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        /*try {
            testLock.lock.lock();
            thread1.start();
        }finally {
            testLock.lock.unlock();
        }

        try {
            testLock.lock.lock();
            thread2.start();
        }finally {
            testLock.lock.unlock();
        }

        try {
            testLock.lock.lock();
            thread3.start();
        }finally {
            testLock.lock.unlock();
        }

        try {
            testLock.lock.lock();
            thread4.start();
        }finally {
            testLock.lock.unlock();
        }*/



        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        System.out.println(count.count);

    }


}
