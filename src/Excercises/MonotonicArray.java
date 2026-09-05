package Excercises;

public class MonotonicArray {


    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                decreasing = false;
            } else if (input[i] < input[i - 1]) {
                increasing = false;
            }
            System.out.println(increasing || decreasing);

        }
    }

}
