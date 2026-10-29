package Excercises;

import java.util.TreeSet;

public class FindSecondLargestNumberFromString {

    public static void main(String[] args) {
        String input = "a4b2c0";
        findSecondLargest(input);  // output : 2

    }

    private static void findSecondLargest(String input) {

        char[] data = input.toCharArray();

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int num;

//		char temp='3'; // ASCII Value for character 3 is 51, Character 0 is 48
//		int data=temp-'0'; // 51 - 48 = 3 ... converting character to integer always do substraction with Zero character
//		System.out.println(data);


//		TreeSet<Integer> dataSet = new TreeSet<>(); // data stored in Asc order with unique
        for (char character : data) {
            if (Character.isDigit(character)) {
                num = character - '0';  // converting character to integer , keeping data in ASC char to get the value
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num < first) {
                    second = num;
                }
            }
        }
        System.out.println("Second Largest Number is :" + second);


    }


}
