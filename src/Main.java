import java.util.concurrent.Semaphore;

public class Main {

    private static final Semaphore semaphore1 = new Semaphore(1);
    private static final Semaphore semaphore2 = new Semaphore(1);
    private static final Semaphore semaphore3 = new Semaphore(1);

    public static void main(String[] args) throws InterruptedException {
        semaphore2.acquire();
        semaphore3.acquire();

        MyRunnable print1 = new MyRunnable("A", semaphore1, semaphore2);
        MyRunnable print2 = new MyRunnable("B", semaphore2, semaphore3);
        MyRunnable print3 = new MyRunnable("C", semaphore3, semaphore1);

        Thread thread1 = new Thread(print1);
        Thread thread2 = new Thread(print2);
        Thread thread3 = new Thread(print3);

        thread3.start();
        thread2.start();
        thread1.start();
    }

}
