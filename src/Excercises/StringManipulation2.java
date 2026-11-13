package Excercises;

public class StringManipulation2 {
    public static void main(String[] args) {

        double number = 123.3456;
        //converting number to string

        String input = String.valueOf(number);
        System.out.println(input);
        int indexOfDecimal = input.indexOf(".");
        System.out.println("Decimal is at index : "+indexOfDecimal);
        System.out.println("Total string length is : "+input.length());
        System.out.println("Numbers after decimal are : "+(input.length()-indexOfDecimal-1));

    }
}
