package Excercises;
import java.util.*;

public class MergeTwoSortedArrays  {


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] arr3 = new int [arr1.length + arr2.length];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                arr3[p3]= arr1[p1];
                p1++;
                p3++;
            } else {
                arr3[p3] = arr2[p2];
                p2++;
                p3++;
            }
        }
        while (p1 < arr1.length) {
            arr3[p3] = arr1[p1];
            p1++;
            p3++;
        }
        while (p2 < arr2.length) {
            arr3[p3] = arr2[p2];
            p2++;
            p3++;
        }

        System.out.println(Arrays.toString(arr3));
//          System.out.println("Merged array");
//            for(int j = 0; j < arr3.length; j++) {
//            System.out.print(arr3[j] + " ");
//            }
    }
}
