package Excercises;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;


public class FIndCommonElementsFromTheList {
    public static void main(String[] args) {
      //***************************IMP******************************
    //1. Using in build method retainAll()
        ArrayList<String> list1= new ArrayList<>();
        list1.add("One");
        list1.add("How");
        list1.add("Ten");
        ArrayList<String> list2= new ArrayList<>();
        list2.add("Ten");
        list2.add("How");
        list2.add("Two");

        list1.retainAll(list2);
//        System.out.println(list1);

    //2. Using Stream() , lambda expression
        Set<String> result=list1.stream()
                .filter(x->list2.contains(x))
                .collect(Collectors.toSet());
      //  System.out.println(result);

        //3. Using only stream without lambda expression, method reference
        Set<String> result1=list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toSet());
        System.out.println(result);










    }
}
