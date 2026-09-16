package Excercises;

public class CountTheFrequencyOfCharactersWithoutHashMap {

	public static void main(String[] args) {
		 
		String input = "abccbaabccbadfsdf ";
		char[] inputArray = input.toCharArray(); // convert string to char array
		
		int[] frequency = new int[256]; // included standard , Extended ASCII --American Standard Code for Information exchange
		
		for(char currentChar :inputArray) {  // for each character in the input array, increment the frequency count
			frequency[currentChar]= frequency[currentChar] +1 ; // increment the frequency of the current character
		}
		
		for(int i=0; i<frequency.length; i++) { // iterate through the frequency array and print the character and its frequency if the frequency is greater than 0
			if(frequency[i]>0) { // if the frequency of the character is greater than 0, print the character and its frequency
				System.out.println( (char) i + " "+ frequency[i]); // cast the index to char to get the character and print its frequency
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
