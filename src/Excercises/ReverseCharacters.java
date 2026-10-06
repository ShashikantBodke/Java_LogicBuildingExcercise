package Excercises;

public class ReverseCharacters {
    public static void main(String[] args) {
        String input="this is fun";
        String[] words = input.split(" ");
        String reverse="";
        for(String word:words) {
            String reverseWord="";
            for(int i=word.length()-1;i>=0;i--) {
                reverseWord+=word.charAt(i);
            }
            reverse+=reverseWord+" ";
        }
        System.out.println(reverse);
    }
}
