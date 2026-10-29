package Excercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class FIndCommonElementsFromTheList2 {
    public static void main(String[] args) {
      //***************************IMP******************************
    //4. Using Set , traversing through each element of list
        ArrayList<String> list1= new ArrayList<>();
        list1.add("One");
        list1.add("How");
        list1.add("Ten");
        ArrayList<String> list2= new ArrayList<>();
        list2.add("Ten");
        list2.add("How");
        list2.add("Two");

        Set<String> result1=new HashSet<>();
        for(int i=0;i< list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equalsIgnoreCase(list2.get(j))){
                    result1.add(list1.get(i));
                }
            }
        }
        System.out.println(result1);



    }
}
