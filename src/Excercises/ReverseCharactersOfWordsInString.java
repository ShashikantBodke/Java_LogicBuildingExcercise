package Excercises;

public class ReverseCharactersOfWordsInString {
    public static void main(String[] args) {
        String input = "This is Fun";
        String [] words = input.split(" ");
        String result="";

        for (String word : words) {
            char[] charArray = word.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            result =result + new String(charArray) + " ";
        }
        System.out.println("Input: " + input);
        System.out.println("Output: " + result.trim());







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
}
