package Excercises;

public class DecodeTheString {
    public static void main(String[] args) {
        //***** IMPORTANT *****
        // This is a simple implementation of Run Length Decoding (RLD) algorithm.
        // It decompresses a string that was compressed using Run Length Encoding (RLE)
        // by expanding each character followed by its count of repetitions back to the original string.

        String input = "d3m4t2b0a1";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char letter = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                output.append(letter);
            }
        }
        System.out.println(output.toString());

    }
}
