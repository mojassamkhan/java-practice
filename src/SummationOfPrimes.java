public class SummationOfPrimes {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (isPrime(i)) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }

    public static boolean isPrime(long p) {
        if (p == 1) return false;
        if (p == 2) return true;
        for (long i = 2; i <= p / 2; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}
