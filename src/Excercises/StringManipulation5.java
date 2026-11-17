package Excercises;

public class StringManipulation5 {
    public static void main(String[] args) {
        String input = "r@56vi ku$%mar67"; //   needs an o/p = "rvi kumar24"
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(char c : input.toCharArray()) {
                if (Character.isLetter(c) || c == ' ') {
                    sb.append(c);
                }
                else if (Character.isDigit(c)) {
                    sum=sum+Character.getNumericValue(c);
                }
            }
        System.out.println(sb);
        System.out.println(sum);
        sb.append(sum);
        System.out.println(sb);
    }
}
