package Excercises;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
	// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    // typically using all the original letters exactly once.
	// For example, the word "listen" can be rearranged to form the word "silent", and vice versa.
	// Other examples of anagrams include "evil" and "vile", "cinema" and "iceman", and "astronomer" and "moon starer".

		String s1 = "silent";
		String s2 = "listen";

		if(s1.length() == s2.length()) {  // Check if the lengths of the two strings are equal

			char []s1Array = s1.toCharArray(); // Convert the strings to character arrays
			char []s2Array = s2.toCharArray(); // Convert the strings to character arrays

			Arrays.sort(s1Array); // Sort the character arrays of both strings
			Arrays.sort(s2Array); // Sort the character arrays of both strings

			if (Arrays.equals(s1Array, s2Array)) { // Check if the sorted character arrays are equal
				System.out.println("Yes you are correct !! It's an anagram");
			}else {
				System.out.println("Nope!!");
			}
		} else {
			System.out.println("Nope !! Not an anagrams");
		}

	}

}
