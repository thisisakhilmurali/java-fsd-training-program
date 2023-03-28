package multithreading;

class Runner extends Thread {
    @Override
    public void run() {

        for (int index = 0; index < 5; index++) {
            System.out.println("Thread: " + index + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignore) {
            }
        }
    }
}

public class ThreadClassImplementation {
    public static void main(String[] args) {

        Runner runnerOne = new Runner();
        runnerOne.start();

        Runner runnerTwo = new Runner();
        runnerTwo.start();
    }
}
