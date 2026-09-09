package Excercises;

public class ReverseCharactersOfWordsInStringWithStringBuilder {
    public static void main(String[] args) {
        String input = "This is Fun";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result = result.append(reversedWord.reverse().toString()).append(" ");
        }
        System.out.println("Input: " + input);
        System.out.println("Output: " + result.toString().trim());
    }









//        String output = reverseCharactersFromWords(input);
//        System.out.println(output); // Output: "sihT si nuF"
    }

//    private static String reverseCharactersFromWords(String input) {
//        String[] words = input.split(" ");
//        StringBuilder reversedString = new StringBuilder();
//
//        for (String word : words) {
//            StringBuilder reversedWord = new StringBuilder(word);
//            reversedString.append(reversedWord.reverse().toString()).append(" ");
//        }
//
//        return reversedString.toString().trim();
//    }

