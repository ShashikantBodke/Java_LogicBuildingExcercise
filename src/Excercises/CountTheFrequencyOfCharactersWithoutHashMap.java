package Excercises;

public class CountTheFrequencyOfCharactersWithoutHashMap {

	public static void main(String[] args) {
		 
		String input = "abccbaabccbadfsdf ";
		char inputArray[]=input.toCharArray();
		
		int frequency[]=new int[256]; // included standard , Extended ASCII --American Standard Code for Information exchange
		
		for(char currentChar :inputArray) {
			frequency[currentChar]= frequency[currentChar] +1 ; 	
		}
		
		for(int i=0; i<frequency.length; i++) {
			if(frequency[i]>0) {
				System.out.println( (char) i + " "+ frequency[i]);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
