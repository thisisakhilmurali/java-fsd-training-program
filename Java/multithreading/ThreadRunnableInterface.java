package multithreading;



public class ThreadRunnableInterface {

    public static void main(String[] args) {

        System.out.println("Main Thread: " + Thread.currentThread().getName());

        Thread thread = new Thread(new RunnableInterfaceDemo());
        thread.start();
    }

    private static class RunnableInterfaceDemo implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", executing run() method.");
        }
    }

}
