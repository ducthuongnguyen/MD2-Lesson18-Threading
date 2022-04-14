package Ex1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("obj1");
        NumberGenerator numberGenerator2 = new NumberGenerator("obj2");
        Thread thread1 = new Thread();
        thread1.start();
        Thread thread2 = new Thread(numberGenerator2);
        thread2.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
    }
}
