class PrimeFactor {
    public static void main(String[] args) {
        long n = 600851475143L;
        for (long i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
