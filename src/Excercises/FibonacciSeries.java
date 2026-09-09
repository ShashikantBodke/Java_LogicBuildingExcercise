package Excercises;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 1; // Number of terms in the Fibonacci series
        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        if(n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        } else if (n == 1) {
            System.out.print(first);
            return;
        }

        System.out.print(first+ " " + second + " ");

        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

}
