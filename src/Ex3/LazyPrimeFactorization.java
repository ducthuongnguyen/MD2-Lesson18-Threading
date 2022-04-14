package Ex3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (isPrime(i)) {
                System.out.println("Lazy prime number = " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean isPrime(int number) {
        if (number < 2) return false;
        else if (number == 2) return true;
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
    }
}
