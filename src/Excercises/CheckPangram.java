package Excercises;

import java.util.HashSet;

public class CheckPangram {
// A pangram is a sentence that contains every letter of the alphabet at least once.
// For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram because it contains every letter of the English alphabet at least once.
// Other examples of pangrams include :
// "Pack my box with five dozen liquor jugs"

	public static void main(String[] args) {
		// Should have >=26 letters,
		// " The quick brown fox jumps over the lazy dog"
		String input = "The quick brown fox jumps over the lazy dog";
		
		boolean result = checkPangram(input);
		if (result) {
			System.out.println("It's a Pangram");
		} else {
			System.out.println("Not a Pangram");
		}
	}

	private static boolean checkPangram(String input) {
		HashSet<Character> characterset = new HashSet<Character>(); // Create a HashSet to store unique characters
		char[] inputchar = input.toLowerCase().toCharArray(); // Convert the input string to lowercase and then to a character array
		for (char c : inputchar) {      // Iterate through each character in the character array
			if (Character.isLetter(c)) { // Check if the character is a letter
				characterset.add(c);   // Add the character to the HashSet (duplicates will be ignored)
			}
		}
		if (characterset.size() == 26) { // Check if the size of the HashSet is 26 (indicating that all letters of the alphabet are present)
			return true;
		}
		return false;
	}

}
