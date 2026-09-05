package Excercises;

public class ReplaceVowelsWithXLetter {

    public static void main(String[] args) {
        String input = "Name";
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result.append('x');
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
