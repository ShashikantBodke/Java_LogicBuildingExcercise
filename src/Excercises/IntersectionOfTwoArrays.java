package Excercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        // This program finds the intersection of two arrays of integers.
        // It uses a HashSet to store the elements of the first array and then checks each element of the second array
        // to see if it exists in the HashSet, indicating that it is part of the intersection.

        int[] arr1 = {1, 2, 3, 4, 5, 4, 5, 3};
        int[] arr2 = {4, 5, 6, 7, 8, 4};

        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        System.out.println(set);

        for (int num : arr2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        System.out.println(resultSet);

        int[] resultArray = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            resultArray[index] = num;
            index++;
        }

        System.out.println(Arrays.toString(resultArray));

    }

}




