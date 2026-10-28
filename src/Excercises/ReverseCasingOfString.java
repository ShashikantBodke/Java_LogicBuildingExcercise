package Excercises;

public class ReverseCasingOfString {

    public static void main(String[] args) {

            String input = "Hello World";   // expected outcome : hELLO wORLD
            StringBuilder result = new StringBuilder();

            char[] data=input.toCharArray();
            for(char c:data){
                if(Character.isUpperCase(c)){
                    result.append(Character.toLowerCase(c));
                }
                else if(Character.isLowerCase(c)){
                    result.append(Character.toUpperCase(c));
                }
                else {
                    result.append(c);
                }
            }
            System.out.println("OG String: "+input);
            System.out.println("Result: "+result.toString());















    }
}
