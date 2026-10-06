package Excercises;

public class ReverseOnlyVowels {

    public static void main(String[] args) {

        String input = "Hello";
        String vowelsString = "aeiouAEIOU";

        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowelsString.indexOf(input.charAt(i)) != -1) vowelCount++;
        }

        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = inputArray.length - 1;


        while (left < right) {
            if (vowelsString.indexOf(inputArray[left]) == -1) {
                left++;
            } else if (vowelsString.indexOf(inputArray[right]) == -1) {
                right--;
            } else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Output: " + new String(inputArray));
        System.out.println("Vowel count: " + vowelCount);
    }
}