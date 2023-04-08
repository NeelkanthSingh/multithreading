public class Multithreading0 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(
                        "This is coming from thread: " + Thread.currentThread().getName()
                );
            }
        });

        thread.start();

        System.out.println("Hello world!");
    }
}