public class Main {

    public static void main(String[] args) {
        MyRunnable print1 = new MyRunnable();
        Thread thread1 = new Thread(print1, "thread1");
        Thread thread2 = new Thread(print1, "thread2");
        Thread thread3 = new Thread(print1, "thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
