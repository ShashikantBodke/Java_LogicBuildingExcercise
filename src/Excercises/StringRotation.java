package Excercises;

public class StringRotation {
    public static void main(String[] args) {

        String s1 = "INTERVIEW";
        String s2 = "VIEWINTER";

        if(s1.length()==s2.length() && (s1+s1).contains(s2)){
            System.out.println("2 strings rotation of each other");
        } else{
            System.out.println("No");
        }
    }
}
