package Excercises;

public class FindShortestAndLongestWordFromString {
    public static void main(String[] args) {
        String input = "I love cricket and football";
        String[] words = input.split(" ");

        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(input);
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);
    }
}
