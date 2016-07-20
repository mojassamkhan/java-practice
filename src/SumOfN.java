class SumOfN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

}
