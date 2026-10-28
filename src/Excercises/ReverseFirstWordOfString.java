package Excercises;

import java.util.Arrays;

public class ReverseFirstWordOfString {
    public static void main(String[] args) {

        String input = "Hello World From Java";
        reverseFirstWord(input);



    }

    private static void reverseFirstWord(String input) {
        if(input==null || input.isEmpty()){
            System.out.println("Cannot reverse the string");
        }else {
            String[] words = input.trim().split(" ", 2);
            char[] charArray = words[0].toCharArray();
            int left = 0, right = charArray.length - 1;
            System.out.println(Arrays.toString(charArray));
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            System.out.println(Arrays.toString(charArray));
            String reversedFirstWord = new String(charArray);
            System.out.println(input);
            System.out.println(reversedFirstWord + " " + words[1]);
        }
    }
}
