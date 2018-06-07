public class MyRunnable implements Runnable {
    private int index;

    public MyRunnable() {
        this.index = 0;
    }

    @Override
    public void run() {
        while (Content.canPrint(index)) {
            System.out.println(Thread.currentThread().getName() + " content is : " + Content.getContent(index++));
        }
    }
}
