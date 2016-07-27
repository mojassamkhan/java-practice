public class PythagoreanTriplet {
    public static void main(String[] args) {
        int sum = 1000;
        for (int a = 1; a < sum; a++) {
            for (int b = a + 1; b < sum; b++) {
                int c = 1000 - (a + b);
                if (c * c == a * a + b * b) {
                    System.out.println(a + ":" + b + ":" + c);
                    System.out.println(a * b * c);
                }
            }
        }
    }
}

//31875000