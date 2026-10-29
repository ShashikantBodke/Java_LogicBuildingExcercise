package Excercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfWordsInString {
    public static void main(String[] args) {
        String input = "Hi my name is Rohan Rohan";
        String[] inputArray = input.split("\\s");
     //   System.out.println(Arrays.toString(inputArray)); // [Hi, my, name, is, Rohan, Rohan]
        HashMap<String,Integer> result = new HashMap<>();

        for(String s:inputArray){
            result.put(s,result.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer> entry:result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
