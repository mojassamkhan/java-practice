class Palindrome {
    public static void main(String[] args) {
        Palindrome reverse = new Palindrome();
        int n;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                n = i * j;
                reverse(n);
            }
        }
    }

    public static void reverse(double n) {
        double r, temp, sum = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp);
        }
    }
}
