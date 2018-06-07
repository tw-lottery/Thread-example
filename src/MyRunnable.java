public class MyRunnable implements Runnable {
    private String content;

    public MyRunnable(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " content is : " + this.content);
    }
}
