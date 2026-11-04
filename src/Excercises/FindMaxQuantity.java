package Excercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMaxQuantity {
    public static void main(String[] args) {
        // This program finds the product with the maximum quantity from a list of products and their quantities.
        // The input is an array of strings where each string contains a product name followed by its quantity.
        // The program uses a HashMap to accumulate the quantities for each product and then determines which product has the maximum total quantity.

        String[] input ={"xyz 9","abc 20","xyz 21"};
        Map<String,Integer> inputMap=new HashMap<>();

        for(String s: input){
            String[] inputData=s.split(" ");
          //  System.out.println(Arrays.toString(inputData));
            String name=inputData[0];
            int quantity=Integer.parseInt(inputData[1]);
         //   System.out.println(name+ " : "+quantity);
            inputMap.put(name,inputMap.getOrDefault(name,0)+quantity);
        }

            int maxQuantity=0;
            String product=" ";
        for(Map.Entry<String,Integer> entry:inputMap.entrySet()){
            if(entry.getValue()>maxQuantity) {
                maxQuantity= entry.getValue();
                product=entry.getKey();
            }

        }
        System.out.println(product+":"+maxQuantity);














    }
}
