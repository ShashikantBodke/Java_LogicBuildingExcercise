package Excercises;

public class CheckIfNumberIsPalindromeOrNotUsingStringBuilder {

	public static void main(String[] args) {
		int number=1221;
			
		//convert number to string
		String orgNumInString = Integer.toString(number);
		String orgNumInString2 = number + " ";
		
		//reverse the string using StringBuilder
		StringBuilder reverseStringBuilder = new StringBuilder(orgNumInString);
		String reverseString=reverseStringBuilder.reverse().toString();
		
		System.out.println(reverseString);
		
		//compare 2 strings
		if(orgNumInString.equals(reverseString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
