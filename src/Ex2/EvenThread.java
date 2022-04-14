package Ex2;

public class EvenThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Print the even numbers: " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
