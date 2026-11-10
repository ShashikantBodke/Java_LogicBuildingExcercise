package Excercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacterFromString {
    public static void main(String[] args) {

        String input = "programming";

        LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
        for (char currentCharacter : input.toCharArray()) {
            hmap.put(currentCharacter, hmap.getOrDefault(currentCharacter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {

            //       System.out.println(entry.getKey()+ ":" +entry.getValue());

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }


    }
}
