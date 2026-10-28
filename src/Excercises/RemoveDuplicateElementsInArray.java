package Excercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsInArray {
    public static void main(String[] args) {
        //Set           - always going to store unique records
        //HashSet       - order is not maintain
        //TreeSet       - store or retrieve the data in Asc order
        //LinkedHashSet - it will preserve the order

        int[] a = {20,10,20,10,30,40};  // output : 20 10 30 40

        Set<Integer> dataSet = new LinkedHashSet<>();

        for(int data: a){
            dataSet.add(data);
        }

        System.out.println(dataSet);

        //streams
        int[] result=dataSet.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));


    }
}
