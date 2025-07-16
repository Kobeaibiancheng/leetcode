package thread;

import java.util.concurrent.*;

public class MyCallable implements Callable<MyCallable.Book> {
    @Override
    public Book call() throws Exception {
        System.out.println("有返回结果");
        return null;
    }

    public static class Book{
        private String name;
        public Book(String name) {
            this.name = name;
        }
        void print(){
            System.out.println(name);
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask<Book> ft = new FutureTask<Book>(new MyCallable());
        Thread thread = new Thread(ft);
        thread.start();
        Book book = ft.get(500, TimeUnit.MINUTES);

    }
}
