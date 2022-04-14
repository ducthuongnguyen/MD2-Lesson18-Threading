package Ex2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        oddThread.start();
        oddThread.join();
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }
}
