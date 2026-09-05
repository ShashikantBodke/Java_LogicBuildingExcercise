package Excercises;

public class ChangingKeys {


        public static void main(String[] args) {
          // Implementation for ChangingKeys
            String input = "abBcddeffgghhii";
          //  input=input.toLowerCase();
            int count=0;
            char lastChar = input.toCharArray()[0];
            lastChar=Character.toLowerCase(lastChar); // Convert the first character to lowercase
         //s   System.out.println("Last char: " + lastChar);

            for (int i = 1; i < input.length(); i++) {
                char currentChar = input.toCharArray()[i];
                currentChar=Character.toLowerCase(currentChar); // Convert the current character to lowercase
          //      System.out.println("Current char: " + currentChar);
                if (currentChar != lastChar) {
                    count++;
                }
                lastChar = currentChar;
            }
            System.out.println("Number of changes needed: " + count);



        }

}
