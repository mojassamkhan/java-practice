public class SumDiff {
    public static void main(String[] args) {
        long sum = 0, product = 1, difference = 0;
        sum = 100 * (100 + 1) / 2;
        sum = sum * sum;
        product = 100 * (100 + 1) * (2 * 100 + 1) / 6;
        difference = sum - product;
        System.out.println(difference);


    }
}

