class PrintTables {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int table = 1;
        for (int i = 1; i < 11; i++) {
            table = n * i;
            System.out.println(n + " * " + i + " = " + table);

        }
    }
}
