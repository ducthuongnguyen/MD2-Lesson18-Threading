package Ex3;

public class TestPrime {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        Thread lazyThread = new Thread(lazyPrimeFactorization);
        lazyThread.start();

        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread optimizedThread = new Thread(optimizedPrimeFactorization);
        optimizedThread.start();
    }

}
