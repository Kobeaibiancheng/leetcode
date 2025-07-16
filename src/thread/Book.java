package thread;

import java.util.concurrent.*;

public class Book implements Callable<String> {

    private String name = "Java";
    private int price = 100;
    @Override
    public String call() throws Exception {
        return this.name + " " + this.price;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Book book = new Book();
        FutureTask<Book> future = new FutureTask(book);
        Thread thread = new Thread(future);
        thread.start();
        System.out.println(future.get(100, TimeUnit.MINUTES));
    }
}
