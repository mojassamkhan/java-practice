import java.util.HashMap;
import java.util.Set;

public class DivisibleOfTriangularNo {
    //Count Divisor
    public static long countDivisor(long n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int pro = 1;
        for (int i = 2; n > 1; ) {
            if (n % i == 0) {
                if (!hm.containsKey(i)) {
                    hm.put(i, 0);
                }
                int value = hm.get(i);
                hm.put(i, value + 1);
                n = n / i;
            } else {
                i++;
            }
        }
        Set<Integer> keys = hm.keySet();
        for (Integer k : keys) {
            pro *= (hm.get(k) + 1);
        }

        return pro;
    }

    public static void main(String[] args) {
        for (long n = 1; ; n++) {
            long t = n * (n + 1) / 2;
            long d = countDivisor(t);
            System.out.println(n + " " + d + " " + t);
            if (d >= 500) {
                System.out.println(t);
                break;
            }
        }
    }
}
