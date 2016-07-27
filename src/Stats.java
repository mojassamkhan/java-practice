import java.util.Arrays;
import java.util.HashMap;

public class Stats {
    //mean - average
    //median -
    //mode
    //variance

    public int count(int n, int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                c++;
            }
        }
        return c;
    }

    public int max(int[] arr) {
        int big = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        return big;
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i];

            }
        }
        return min;
    }

    public double mean(int[] arr) {
        double sum = 0;
        double m = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        m = sum / arr.length;
        return m;
    }

    public double median(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        if (arr.length % 2 != 0) {
            int i = (l + 1) / 2;
            return arr[i - 1];
        } else {
            int i = (l / 2);
            return ((arr[i] + arr[i - 1]) / 2);
        }
    }

    public int mode(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int key = hm.get(arr[i]);
            key++;
            hm.put(arr[i], key);
        }
        return 0;
    }
}




