package Excercises;

public class FIndTheLenghtOfStringUsingExceptionHandling {
    public static void main(String[] args) {
        String input = "Hello";
        int count=0;
        while(true){
            try{
                input.charAt(count);
                count++;
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("The length of the string \""+input+"\" is: " + count);
                break;
            }
        }

    }
}
