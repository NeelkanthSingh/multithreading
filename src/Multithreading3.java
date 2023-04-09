public class Multithreading3 {
    public static void main(String[] args) {
        Thread thread = new MyThread();

        thread.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(
                                "Exception: " + e.getMessage() + " in thread: " + t.getName()
                        );
                    }
                }
        );

        thread.start();


        System.out.println("Hello world!");
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(
                    "This is coming from thread: " + this.getName()
            );

            throw new RuntimeException("This is an exception");

        }
    }
}