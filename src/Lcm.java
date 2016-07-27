import java.util.Arrays;

public class Lcm {
    public static void main(String[] args) {
        int lcm = 1;
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
        for (int divisor = 2; divisor <= 20; ) {
            boolean canDivide = false;
            for (int j = 0; j < 20; j++) {
                if (arr[j] % divisor == 0) {
                    canDivide = true;
                    arr[j] = arr[j] / divisor;
                }
            }

            if (canDivide) {
                System.out.println(divisor + " divides " + Arrays.toString(arr));
                System.out.println();
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
        }

        System.out.println(lcm);
    }
}