package Excercises;

import java.util.Arrays;
import java.util.HashSet;

public class FindUniqueElementsInsideArray {
    public static void main(String[] args) {

        int[] numbers= {1,2,3,1,2};

        HashSet<Integer> uniqueData = new HashSet<>();  // does not maintain the order, if you need you can use LinkedHashSet
        HashSet<Integer> duplicateData = new HashSet<>();

        for (int number : numbers){
            if(!uniqueData.add(number)){
                duplicateData.add(number);
            };
        }
        System.out.println("Unique set: " +uniqueData);
        System.out.println("Duplicate set: " +duplicateData);

        uniqueData.removeAll(duplicateData);
        System.out.println("uniqueData: "+uniqueData);



    }
}
