import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        String[] arr = {"khan", "hello", "world", "khan", "earth", "world", "khan"};
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int value = hm.get(arr[i]) + 1;
                hm.put(arr[i], value);
            } else {
                hm.put(arr[i], 1);
            }

        }
        System.out.println(hm);


    }
}


