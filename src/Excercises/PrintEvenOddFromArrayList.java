package Excercises;

import java.util.ArrayList;

public class PrintEvenOddFromArrayList {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(23);
        al.add(null);
        al.add(50);
        al.add(40);
        al.add(45.5f);
        al.add("Java");
        al.add("Python");
        al.add("JavaScript");

       // System.out.println("Even numbers:");
        for (Object value : al) {
            if (value instanceof Integer) {
                int num = (Integer) value;
                if (num % 2 == 0) {
                    System.out.println(num + " is an even number.");
                } else {
                    System.out.println(num + " is an odd number.");
                }

            }
        }

    }
}
