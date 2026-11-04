package Excercises;

public class StringManipulation {
    public static void main(String[] args) {

        // *****IMP

        String input = "99956";       // O/P expected is odd number with repeated digits replaced with -
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            sb.append(input.charAt(i));
            int currentDigit = Character.getNumericValue(input.charAt(i));
            int nextDigit = Character.getNumericValue(input.charAt(i + 1));
            if (currentDigit % 2 != 0 && nextDigit % 2 != 0 && currentDigit == nextDigit) {
                sb.append("-");
            }
        }
        // Append the last character
        sb.append(input.charAt(input.length() - 1));

        System.out.println(sb.toString());

    }
}
