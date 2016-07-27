class PrimeFactor {
    public static void main(String[] args) {
        long n = 600851475143L;
        for (long i = 2; i < n / 2; i++) {
            if (n % i == 0 && isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(long i) {
        if (i == 1) return false;
        if (i == 2) return true;

        for (int x = 2; x <= i / 2; x++) {
            if (i % x == 0) {
                return false;
            }
        }
        return true;
    }
}
