package Excercises;

public class CountTotalNumberOfDigits {

    public static void main(String[] args) {
        int number = 1234;
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Total number of digits: " + count);

        String numberString = Integer.toString(1234);
        int countString = numberString.length();
        System.out.println("Total number of digits (using string): " + countString);
    }
}
