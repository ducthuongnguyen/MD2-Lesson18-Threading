package Ex3;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(isPrime(i)) System.out.println("Optimized Prime number = "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isPrime(int number) {
        if (number < 2) return false;
        else if (number == 2) return true;
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
    }
}
