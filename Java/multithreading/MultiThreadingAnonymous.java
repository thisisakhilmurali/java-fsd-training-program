package multithreading;

public class MultiThreadingAnonymous {
    public static void main(String[] arg) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 0; index < 5; index++) {
                    System.out.println("Thread: " + index + Thread.currentThread().getName());
                }
            }
        });
    }
}
