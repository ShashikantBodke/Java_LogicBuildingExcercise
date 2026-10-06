package Excercises;

public class CountTheVowelsOfString {

	public static void main(String[] args) {
		
		String input = "Hello World";
		String vowelString = "aeiouAEIOU"; // string containing all vowels
		int count =0;
		// iterate through the input string and check if each character is a vowel by checking if it exists in the vowelString
		for(int index=0; index<input.length(); index++) {
			// check if the character at the current index is a vowel by checking if it exists in the vowelString
 			if(vowelString.indexOf(input.charAt(index))!=-1){
				 // if the character is a vowel exist anywhere in the vowelString, indexOf will return a value other than -1
				count++; // increment the count of vowels
			}
		}
		System.out.println("Total Number of Vowels in string "+count);
		
	}

}
