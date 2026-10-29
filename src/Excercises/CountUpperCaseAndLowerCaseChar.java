package Excercises;

import java.util.Locale;

public class CountUpperCaseAndLowerCaseChar {
    public static void main(String[] args) {

        String input = "aAbBcCDdEFef";
        char[] inputData= input.toCharArray();

        int upperCaseCharCount = 0;
        int lowerCaseCharCount = 0;
        for(char c : inputData){
            if(Character.isUpperCase(c)){
                upperCaseCharCount ++;
            }else if(Character.isLowerCase(c)){
                lowerCaseCharCount ++;
            }
        }
        System.out.println("UpperCase Char Count: ".toUpperCase()+upperCaseCharCount +"\n"+"LowerCase Char Count: ".toUpperCase()+lowerCaseCharCount);














    }
}
