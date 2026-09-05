package Excercises;

import java.util.HashSet;

public class CheckPangram {

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
		HashSet<Character> characterset = new HashSet<Character>();
		char inputchar[] = input.toLowerCase().toCharArray();
		for (char c : inputchar) {
			if (Character.isLetter(c)) {
				characterset.add(c);
			}
		}
		if (characterset.size() == 26) {
			return true;
		}
		return false;
	}

}
