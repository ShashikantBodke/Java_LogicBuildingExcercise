package Excercises;

import java.util.Arrays;

public class CalculateTheSumOfNumbersFromTheString {
    public static void main(String[] args) {

        String input= "This is 1000 and it should be 20 30 50 1050";
        String[] inputArray= input.split(" ");
        System.out.println(Arrays.toString(inputArray));
        int totalSum=0;
        for(String s:inputArray){
            try{
                int number=Integer.parseInt(s);
             //   System.out.println(number);
                totalSum=totalSum+number;

            }catch (NumberFormatException e){

            }
        }
        System.out.println(totalSum);






    }
}
