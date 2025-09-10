package thread;

public class PrintOddAndEven {
    private int maxCount;

    private boolean flag = true;

    private int tmp = 1;

    public PrintOddAndEven(int maxCount) {
        this.maxCount = maxCount;
    }

    private synchronized void print1() throws InterruptedException {
        for (int i = 1; i <= maxCount; i+=3) {
            while(tmp != 1){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            tmp = 2;
            notify();
        }

    }

    private synchronized void print2() throws InterruptedException {
        for (int i = 2; i <= maxCount; i+=3) {
            while(tmp != 2){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            tmp = 3;
            notify();
        }

    }


    private synchronized void print3() throws InterruptedException {
        for (int i = 3; i <= maxCount; i+=3) {
            while(tmp != 3){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            tmp = 1;
            notifyAll();
        }

    }






    private synchronized void printOdd() throws InterruptedException {
        for (int i = 1; i <= maxCount; i+=2) {
            while(flag != true){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            flag = false;
            notifyAll();
        }

    }

    private synchronized void printEven() throws InterruptedException{
        for (int i = 2; i <= maxCount; i+=2) {
            while(flag != false){
                //Thread.currentThread().wait();
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            flag = true;
            notifyAll();
        }
    }



    public void start(){
        Thread oddThread = new Thread(() ->{
           try{
               printOdd();
           } catch (InterruptedException e){
               e.printStackTrace();
           }
        },"OddThread");

        Thread evenThread = new Thread(() ->{
            try{
                printEven();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        },"EvenThread");



        oddThread.start();
        evenThread.start();
    }
    public void start1(){
        Thread thread1 = new Thread(() ->{
            try{
                print1();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        },"Thread1");

        Thread thread2 = new Thread(() ->{
            try{
                print2();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        },"Thread2");

        Thread thread3 = new Thread(() ->{
            try{
                print3();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        },"Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void main(String[] args) {
        PrintOddAndEven p = new PrintOddAndEven(10);
        //p.start();
        p.start1();
    }
}
