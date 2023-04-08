public class Multithreading2{
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        System.out.println("Hello world!");
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(
                    "This is coming from thread: " + this.getName()
            );
        }
    }
}