package Excercises;

import java.util.HashSet;
import java.util.Set;

public class CountTheVowelsOfStringUsingHashSet {

	public static void main(String[] args) {
		
		String input = "Hello World";
		String vowelString = "aeiouAEIOU";
		int count =0;
		
		
		Set<Character> vowelSet = new HashSet<Character>();
		
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('A');
		vowelSet.add('E');
		vowelSet.add('I');
		vowelSet.add('O');
		vowelSet.add('O');
		
		for(int index=0; index<=input.length()-1;index++) { //Traversing the string
			if(vowelSet.contains(input.charAt(index))){
				count++;
			}
		}
		System.out.println("Number of vowels found in the string is "+count);		
	}

}
