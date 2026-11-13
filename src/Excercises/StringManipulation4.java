package Excercises;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation4 {
    public static void main(String[] args) {
        String input = "a1b2c3"; //   needs an o/p = "a3b2c1"
       List<Character> list =new ArrayList<>();
       for(char c : input.toCharArray()){
           if(Character.isDigit(c)){
               list.add(c);
           }
       }
       System.out.println(list);

       int index = list.size()-1; // 3-1=2

       StringBuilder sb = new StringBuilder();
       for(char c : input.toCharArray()){
           if(Character.isDigit(c)){
               sb.append(list.get(index));
               index--;
           }else{
               sb.append(c);
           }
       }
       System.out.println(sb);




    }
}
