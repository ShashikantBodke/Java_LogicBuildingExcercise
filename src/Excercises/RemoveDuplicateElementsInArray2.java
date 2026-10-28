package Excercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsInArray2 {
    public static void main(String[] args) {

        int[] a = {20,10,20,10,30,40};  // output : 20 10 30 40

        a=Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(a));

        
    }
}
