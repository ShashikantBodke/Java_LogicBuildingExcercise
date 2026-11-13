package Excercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostFrequentCharactersInAString {
    public static void main(String[] args) {

        String input = "aabbb";
        LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        System.out.println(hmap);
        // Find the 2nd most frequency character in the string !!
        int firstMaxFreq = 0;
        int secondMaxFreq = 0;

        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            int currentFreq = entry.getValue();
            if (currentFreq > firstMaxFreq) {
                secondMaxFreq = firstMaxFreq;
                firstMaxFreq = currentFreq;

            } else if (currentFreq > secondMaxFreq && currentFreq < firstMaxFreq) {
                secondMaxFreq = currentFreq;
            }


        }
        System.out.println(secondMaxFreq);

        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == secondMaxFreq) {
                System.out.println(entry.getKey());
            }
        }
    }
}
