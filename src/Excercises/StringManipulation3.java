package Excercises;

public class StringManipulation3 {
    public static void main(String[] args) {
        String input = "10010101"; // remove all the occurrence of the substring 10 -- O/P = 0,1
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if(c=='0' && sb.length()>0 && sb.charAt(sb.length()-1)=='1'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
