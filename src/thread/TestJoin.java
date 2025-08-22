package thread;

public class TestJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1执行中...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1已完成，t2开始执行");
        });

        t1.start();
        t2.start(); // t2会等待t1结束后再执行
    }
}
