import java.util.concurrent.Executor;

public class Main {

    public static void main(String[] args) {
        Executor executor = Runnable::run;
        MyRunnable print1 = new MyRunnable("A");
        MyRunnable print2 = new MyRunnable("B");
        MyRunnable print3 = new MyRunnable("C");

        MyScheduler scheduler = new MyScheduler(executor);

        for (int i=0; i < 100; i ++) {
            scheduler.addRunner(print1);
            scheduler.addRunner(print2);
            scheduler.addRunner(print3);
        }

        scheduler.runNext();
    }

}
