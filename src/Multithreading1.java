public class Multithreading1 implements Runnable{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Multithreading1 mt1 = new Multithreading1();
        Thread thread = new Thread(mt1);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(
                "This is coming from thread: " + Thread.currentThread().getName()
        );
    }
}