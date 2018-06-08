import java.util.Objects;
import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable {
    private String content;
    private Semaphore acquireSemaphore;
    private Semaphore releaseSemaphore;

    public MyRunnable(String content, Semaphore acquireSemaphore, Semaphore releaseSemaphore) {
        this.content = content;
        this.acquireSemaphore = acquireSemaphore;
        this.releaseSemaphore = releaseSemaphore;
    }

    @Override
    public void run() {
        while (Objects.nonNull(content)) {
            try {
                acquireSemaphore.acquire();
                System.out.println(content);
                releaseSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
