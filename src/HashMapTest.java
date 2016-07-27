import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        int[] arr = {34, 34, 456, 56, 456, 4, 64, 7, 4, 7, 7};

        // convert array to count map
        HashMap<Integer, Integer> map = createCountMap(arr);

        printMap(map);
        //find maxkey
        int maxKey = findMaxKey(map);

        // get max value count
        int count = getMaxValueCount(map, map.get(maxKey));

        if (count > 1) {
            System.out.println("No Mode");
        } else {
            System.out.println("Mode: " + maxKey);
        }
    }

    private static int getMaxValueCount(HashMap<Integer, Integer> map, Integer maxValue) {
        int count = 0;
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {

        }
        return count;
    }

    private static int findMaxKey(HashMap<Integer, Integer> map) {
        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {

        }
        return maxKey;
    }

    private static HashMap<Integer, Integer> createCountMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int key = map.get(arr[i]);
                key++;
                map.put(arr[i], key);
            } else {
                map.put(arr[i], 1);
            }

        }
        return map;
    }

    private static void printMap(HashMap<Integer, Integer> map) {
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.println(k + ":" + map.get(k));
        }

    }
}

//0:7
//10:17
//5:15