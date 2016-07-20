class Fibonacci {
    public static void main(String[] args) {
        long a = 1, b = 1, sum = 0, next = 0;
        for (long i = 1; next < 4000001; i++) {
            next = a + b;
            a = b;
            b = next;
            if (next % 2 == 0) {
                sum = sum + next;
            }
            //System.out.println(next);

        }
        System.out.println(sum);
    }
}
