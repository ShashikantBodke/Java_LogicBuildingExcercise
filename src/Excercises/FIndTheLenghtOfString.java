package Excercises;

public class FIndTheLenghtOfString {
    public static void main(String[] args) {
        String input = "Hello";
        // 1. Using length() method
//        int length = input.length();
//        System.out.println("The length of the string \"" + input + "\" is: " + length);

        // 2. Without Using length() method
        int length = 0;
        char [] inputArray = input.toCharArray();
        for (char c : inputArray) {
            length++;
        }
        System.out.println("The length of the string \"" + input + "\" is: " + length);
    }
}
