package Excercises;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // size of the diamond

        // Upper half of the diamond
        // i = 1, 2, 3, 4, 5
        // For each row, print spaces first, then stars
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to move the stars to the center
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars in odd numbers: 1, 3, 5, 7, 9
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

        // Lower half of the diamond
        // i = 4, 3, 2, 1
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars in decreasing order
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}