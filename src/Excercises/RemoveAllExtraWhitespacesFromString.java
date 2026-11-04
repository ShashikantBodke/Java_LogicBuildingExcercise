package Excercises;

public class RemoveAllExtraWhitespacesFromString {
    public static void main(String[] args) {

        String input = "   This   is  a   sample   string with   extra   whitespaces.  ";
        String output = input.replaceAll("\\s+", " ").trim();
        // The regex "\\s+" matches one or more whitespace characters,
        // and we replace them with a single space.
        // The trim() method removes leading and trailing spaces.
        System.out.println("********************************************************");
        System.out.println("Input String: \"" + input + "\"");
        System.out.println("Output String: \"" + output + "\"");


    }
}
