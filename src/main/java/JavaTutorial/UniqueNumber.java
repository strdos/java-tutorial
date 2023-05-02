package JavaTutorial;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    public static void main(String[] args) {
        // find unique numbers and their quantity in an array
        int array[] = {4,5,5,5,6,6,7,8,8,4,8,9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        System.out.println(map); // prints whole map
        // print unique numbers only
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " is unique");
            }
        }
    }
}
