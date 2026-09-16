package Excercises;

public class ChangingKeys {


        public static void main(String[] args) {
          // Implementation for ChangingKeys
          // Given a string, count the number of changes needed to make all characters in the string the same.
            String input = "abBcddeffgghhii";
          //  input=input.toLowerCase();
            int count=0;
            char firstChar = input.toCharArray()[0]; // Get the first character of the string
             firstChar = Character.toLowerCase(firstChar); // Convert the first character to lowercase
         //   System.out.println("Last char: " + lastChar);

            for (int i = 1; i < input.length(); i++) {
                char currentChar = input.toCharArray()[i];
                currentChar=Character.toLowerCase(currentChar); // Convert the current character to lowercase
          //      System.out.println("Current char: " + currentChar);
                if (currentChar != firstChar) { // If the current character is different from the first character, increment the count
                    count++;
                }
                firstChar = currentChar;
            }
            System.out.println("Number of changes needed: " + count);



        }

}
