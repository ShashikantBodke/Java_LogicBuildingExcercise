package Excercises;

import java.util.HashMap;
import java.util.Map;

public class ReverseAMap {
    public static void main(String[] args) {
        // Create a map
      Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        System.out.println("Original map: " + map);

        // Reverse the map
        Map<Integer, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
           }

        // Print the reversed map
        System.out.println("Reversed map: " + reversedMap);
    }
}
