package Excercises;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfCharactersString {
// Count the frequency of characters in a string
	public static void main(String[] args) {

		String input = "madam";

		// Convert the input string to a character array
		char[] inputArray =input.toCharArray();

		// Create a HashMap to store the frequency of each character
		HashMap<Character,Integer> frequencyMap=new HashMap<Character,Integer>();

		// Iterate through the character array and update the frequency in the HashMap
		for(char c : inputArray) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
		}

		//1. Using keySet to print the frequency of each character
		for(char character : frequencyMap.keySet()) {
			System.out.println(character + "  " + frequencyMap.get(character));
		}
			System.out.println("----------------------------------------");

		//2. Using Map entrySet to print the frequency of each character
		for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}
