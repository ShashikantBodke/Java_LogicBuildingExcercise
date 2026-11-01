package Excercises;

public class DecodeTheString {
    public static void main(String[] args) {
        //***** IMPORTANT *****

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
