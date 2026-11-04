package Excercises;

public class EncodeTheString {
    public static void main(String[] args) {

        String input = "aaabbbcccdde";
        StringBuilder output = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output.append(input.charAt(i - 1));
                output.append(count);
                count = 1;
            }
        }
        // Append the last sequence
        output.append(input.charAt(input.length() - 1));
        output.append(count);
        System.out.println(output.toString());
    }
}
