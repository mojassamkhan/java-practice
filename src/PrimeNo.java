public class PrimeNo {

    public static boolean isPrime(long n) {
        if (n == 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long count = 0;
        long n;
        for (n = 1; count != 10001; n++) {
            if (isPrime(n)) {
//                System.out.println(n);
                count++;
            }
        }
        System.out.println(n - 1);

    }
}
