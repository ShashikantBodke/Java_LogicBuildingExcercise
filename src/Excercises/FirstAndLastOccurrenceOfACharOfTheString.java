package Excercises;

public class FirstAndLastOccurrenceOfACharOfTheString {

    public static void main(String[] args) {
        String str = "Hello, World!";
        int firstIndex = -1;
        int lastIndex = -1;

        for(int index=0; index < str.length(); index++) {
            if(str.charAt(index) == 'o') {
                firstIndex = index;
                break;
                }
            }
        for(int index=str.length()-1; index >= 0; index--) {
            if(str.charAt(index) == 'o') {
                lastIndex = index;
                break;
                }
            }
        if(firstIndex != -1 && lastIndex != -1) {
            System.out.println("First occurrence of 'o' is at index: " + firstIndex);
            System.out.println("Last occurrence of 'o' is at index: " + lastIndex);
        }

//        System.out.println("First occurrence of 'o' is at index: " + firstIndex);
//        System.out.println("Last occurrence of 'o' is at index: " + lastIndex);
    }
}
