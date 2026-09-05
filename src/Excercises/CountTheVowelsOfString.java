package Excercises;

public class CountTheVowelsOfString {

	public static void main(String[] args) {
		
		String input = "Hello World";
		String vowelString = "aeiouAEIOU";
		int count =0;
		for(int index=0; index<=input.length()-1;index++) {
		//	System.out.println(input.charAt(index)); 
			
			if (vowelString.indexOf(input.charAt(index))!=-1){
				count++;
			}
		}
		System.out.println("Total Number of Vowels in string "+count);
		
	}

}
