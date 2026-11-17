package Excercises;

import java.util.Arrays;

public class MinimumCharacterReplacementInString {
    public static void main(String[] args) {
        String[] data = {"ab", "aab", "abb", "abab", "abaaaba"};  // consecutive character replacement
        int[] result = new int[data.length];

        for (int w = 0; w < data.length; w++) {
            String input = data[w];
            int count = 0; // total number of replacement needed
            int index = 1;
            while (index < input.length()) {
                if (input.charAt(index) == input.charAt(index - 1)) {
                    count = count + 1;
                    index = index + 2;
                } else {
                    index = index + 1;
                }
            }
            result[w]=count;
        }
        System.out.println(Arrays.toString(result));
    }
}
