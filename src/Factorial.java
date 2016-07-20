class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int pro = 1;
        for (int x = n; x > 1; x--) {
            pro = pro * x;
        }
        System.out.println(pro);
    }
}
