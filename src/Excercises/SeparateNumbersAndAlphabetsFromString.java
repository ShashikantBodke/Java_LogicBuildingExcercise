package Excercises;

public class SeparateNumbersAndAlphabetsFromString {

    public static void main(String[]args){

        String str = "abc123def456ghi789# @ 10 ";
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
        StringBuilder whitespace = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();


        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            } else if (Character.isLetter(c)) {
                alphabets.append(c);
            } else if (Character.isWhitespace(c)) {
                whitespace.append(c);
            } else {
                specialCharacters.append(c);
            }
        }

        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Alphabets: " + alphabets.toString());
        System.out.println("Whitespace: " + whitespace.toString());
        System.out.println("Special Characters: " + specialCharacters.toString());
    }
}
