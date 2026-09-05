package Excercises;

public class CheckIfNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		int number=121;
		int originalNumber=number;
		
		int reverseNumber = 0;
		int lastDigit;
		
		while(number!=0) {
			lastDigit=number%10;
			reverseNumber=reverseNumber*10+lastDigit;
			number=number/10;			
		}
			if(reverseNumber-originalNumber == 0) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
	}

}
