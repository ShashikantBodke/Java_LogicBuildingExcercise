package Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1,22,32,null,121,100);
        List<Integer> numberList=inputList.stream()
                .filter(i-> Objects.nonNull(i))
                .filter(i->i.toString().startsWith("1"))
                .collect(Collectors.toList());

       // System.out.println(numberList);
       System.out.println(numberList);
    }
}
