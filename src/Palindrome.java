class Palindrome {
    public static void main(String[] args) {
        long max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                long product = i * j;
                if (i >= j && isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        System.out.println(max);
    }

    private static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static long reverse(long n) {
        long r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return sum;
    }
}
