import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public class MyScheduler {
    final Queue<Runnable> runnables = new LinkedBlockingQueue<>();
    final Executor executor;
    Runnable currentRunner;


    public MyScheduler(Executor executor) {
        this.executor = executor;
    }

    public void addRunner(Runnable runnable) {
        runnables.add(runnable);
    }

    public void execute(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            runNext();
        }
    }

    protected void runNext() {
        if ((currentRunner = runnables.poll()) != null) {
            this.execute(currentRunner);
        }
    }
}
