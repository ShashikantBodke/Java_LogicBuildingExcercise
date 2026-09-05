package Excercises;

import java.util.HashMap;

public class CountTheFrequencyOfCharactersString {

	public static void main(String[] args) {

		String input = "madam";
		char inputArray[]=input.toCharArray();
		
		HashMap<Character,Integer> frequencyMap=new HashMap<Character,Integer>();
		
		for(char c : inputArray) {
			
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
		}
		
		for(char character : frequencyMap.keySet()) {
			System.out.println(character + "  " + frequencyMap.get(character));
		}
	}

}
